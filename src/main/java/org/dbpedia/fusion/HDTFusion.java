package org.dbpedia.fusion;

import org.apache.commons.collections.map.HashedMap;
import org.rdfhdt.hdt.exceptions.NotFoundException;
import org.rdfhdt.hdt.hdt.HDT;
import org.rdfhdt.hdt.hdt.HDTManager;
import org.rdfhdt.hdt.triples.IteratorTripleString;
import org.rdfhdt.hdt.triples.TripleString;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HDTFusion {

    private static Map<String, HDT> langToHDT = null;


    public static Map getMap() {

        if (langToHDT == null) {
            langToHDT = new HashedMap();
            for (String lang : Strings.languages) {
                try {

                    langToHDT.put(lang, HDTManager.loadIndexedHDT("data/hdt/downloads.dbpedia.org/2016-10/tmp/data/" + lang + "/wkd_uris_selection.gz.hdt", null));
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
            System.out.println("loaded " + langToHDT.size() + "/" + Strings.languages.length);
        }

        return langToHDT;

    }


    static void label(WikidataQ wikidataQ) throws NotFoundException {

        Map<String, HDT> l = getMap();

        for (String lang : l.keySet()) {
            if(lang.equalsIgnoreCase("wikidata")){
                continue;
            }
            HDT hdt = l.get(lang);

            // Search pattern: Empty string means "any"
            try {
                IteratorTripleString it = hdt.search(wikidataQ.URI, "http://www.w3.org/2000/01/rdf-schema#label", "");
                while (it.hasNext()) {
                    TripleString ts = it.next();
                    wikidataQ.labels.add(ts.getObject().toString());
                }
            } catch (NotFoundException nfe) {
                //intentionally left blank.
                //hdt.search should return null, not an NF exception
            }
        }

    }

    static void getByIDandProperty(String identifier, String property, WikidataQ wikidataQ) throws NotFoundException {

        Map<String, HDT> l = getMap();

        for (String lang : l.keySet()) {
            //lang = "en";
            //System.out.println("en" + identifier);

            HDT hdt = l.get(lang);
            // Search pattern: Empty string means "any"

            List<TripleString> ls = new ArrayList<>();
            try {

                //System.out.println("query: " +identifier + "  http://wikidata.dbpedia.org/ontology/" + property);

                IteratorTripleString it = hdt.search(identifier, "http://dbpedia.org/ontology/" + property, "");
                while (it.hasNext()) {
                    TripleString ts = it.next();
                   // System.out.println(lang + " o " + ts.toString());
                    ls.add(ts);
                }
            } catch (NotFoundException nfe) {
                //intentionally left blank.
                //hdt.search should return null, not an NF exception
            }
            try {
                //System.out.println("query: "+identifier + "  http://wikidata.dbpedia.org/ontology/" + property);

                IteratorTripleString it = hdt.search(identifier, "http://wikidata.dbpedia.org/ontology/" + property, "");
                //it = hdt.search(identifier, "", "");
                while (it.hasNext()) {
                    TripleString ts = it.next();
                  //  System.out.println(lang + " a " + ts.toString());
                    ls.add(ts);
                }

            } catch (NotFoundException nfe) {
                //intentionally left blank.
                //hdt.search should return null, not an NF exception
            }

            for (TripleString ts : ls) {
                // add values per property
                String value = ts.getObject().toString();

                //scrub scrub
                value = value.replace("http://wikidata.dbpedia.org/resource/", "");
                if (value.contains("http://www.w3.org/2001/XMLSchema#date")) {
                    while (value.startsWith("0")) {
                        value = value.substring(1);
                    }
                    while (value.contains("-0")) {
                        value = value.replace("-0", "-");
                    }
                }

                int roof = value.indexOf("^^");
                if (roof > 0) {
                    value = value.substring(0, roof);
                }
                wikidataQ.put("http://dbpedia.org/ontology/" + property, value, lang);
            }

        }

    }


}
