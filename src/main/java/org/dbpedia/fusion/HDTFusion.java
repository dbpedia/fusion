package org.dbpedia.fusion;

import org.apache.commons.collections.map.HashedMap;
import org.rdfhdt.hdt.exceptions.NotFoundException;
import org.rdfhdt.hdt.hdt.HDT;
import org.rdfhdt.hdt.hdt.HDTManager;
import org.rdfhdt.hdt.triples.IteratorTripleString;
import org.rdfhdt.hdt.triples.TripleString;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HDTFusion {

    private static Map<String, HDT> langToHDT = null;


    public static Map getMap() {

        if (langToHDT == null) {
            langToHDT = new HashedMap();
            for (String lang : Strings.languages) {
                try {

                    langToHDT.put(lang, HDTManager.loadHDT("data/hdt/downloads.dbpedia.org/2016-10/tmp/data/" + lang + "/wkd_uris_selection.gz.hdt", null));
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
            System.out.println("loaded " + langToHDT.size() + "/" + Strings.languages.length);
        }

        return langToHDT;

    }


    static void getByIDandProperty(String identifier, String property, ValueAggregator valag) throws NotFoundException {

        Map<String, HDT> l = getMap();

        for (String lang : l.keySet()) {
            HDT hdt = l.get(lang);
            // Search pattern: Empty string means "any"
            try {
                IteratorTripleString it = hdt.search(identifier, property, "");
                while (it.hasNext()) {
                    TripleString ts = it.next();
                    valag.put(identifier, ts.getObject().toString(), lang);
                }
            } catch (NotFoundException nfe) {
                //intentionally left blank.
                //hdt.search should return null, not an NF exception
            }
        }

    }


    static void getByID(String identifier) throws NotFoundException {

        Map<String, HDT> l = getMap();
        Map<String, List<TripleString>> langtotriples = new HashMap();

        for (String lang : l.keySet()) {
            HDT hdt = l.get(lang);
            // Search pattern: Empty string means "any"
            try {
                IteratorTripleString it = hdt.search(identifier, "", "");
                while (it.hasNext())

                {
                    TripleString ts = it.next();
                    //System.out.println(ts.getObject());
                    System.out.println(lang + " " + ts);
                }
            } catch (NotFoundException nfe) {
                //intentionally left blank.
                //hdt.search should return null, not an NF exception
            }
        }

    }


    static void getByProperty(String property) throws NotFoundException {

        Map<String, HDT> l = getMap();
        Map<String, List<TripleString>> langtotriples = new HashMap();

        for (String lang : l.keySet()) {
            HDT hdt = l.get(lang);
            // Search pattern: Empty string means "any"
            try {
                IteratorTripleString it = hdt.search("", property, "");
                while (it.hasNext())

                {
                    TripleString ts = it.next();
                    //System.out.println(ts.getObject());
                    System.out.println(lang + " " + ts);
                }
            } catch (NotFoundException nfe) {
                //intentionally left blank.
                //hdt.search should return null, not an NF exception
            }
        }

    }


}
