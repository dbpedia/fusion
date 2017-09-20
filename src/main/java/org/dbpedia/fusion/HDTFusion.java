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
import java.util.concurrent.TimeUnit;

public class HDTFusion {

    private static Map<String, org.rdfhdt.hdt.hdt.HDT> langToHDT = null;


    public static Map getMap() {

        if (langToHDT == null) {
            langToHDT = new HashedMap();
            for (String lang : languages) {
                try {

                    langToHDT.put(lang, HDTManager.loadHDT("data/hdt/downloads.dbpedia.org/2016-10/tmp/data/" + lang + "/wkd_uris_selection.gz.hdt", null));
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
            System.out.println("loaded " + langToHDT.size() + "/" + languages.length);
        }

        return langToHDT;

    }


    static void getByIDandProperty(String identifier, String property) throws NotFoundException {

        Map<String, HDT> l = getMap();
        Map<String, List<TripleString>> langtotriples = new HashMap();

        for (String lang : l.keySet()) {
            HDT hdt = l.get(lang);
            // Search pattern: Empty string means "any"
            try {
                IteratorTripleString it = hdt.search(identifier, property, "");
                while (it.hasNext())

                {
                    TripleString ts = it.next();
                    ValAgg.put(identifier, ts.getObject().toString(), lang);
                    //System.out.println(ts.getObject());
                    //System.out.println(lang + " " + ts);
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


    static String[] languages = new String[]{"af",
            "als",
            "am",
            "an",
            "ar",
            "arz",
            "ast",
            "az",
            "azb",
            "ba",
            "bar",
            "bat_smg",
            "be",
            "bg",
            "bn",
            "bpy",
            "br",
            "bs",
            "bug",
            "ca",
            "ce",
            "ceb",
            "ckb",
            "commons",
            "cs",
            "cv",
            "cy",
            "da",
            "de",
            "el",
            "en",
            "eo",
            "es",
            "et",
            "eu",
            "fa",
            "fi",
            "fo",
            "fr",
            "fy",
            "ga",
            "gd",
            "gl",
            "gu",
            "he",
            "hi",
            "hr",
            "hsb",
            "ht",
            "hu",
            "hy",
            "ia",
            "id",
            "io",
            "is",
            "it",
            "ja",
            "jv",
            "ka",
            "kk",
            "kn",
            "ko",
            "ku",
            "ky",
            "la",
            "lb",
            "li",
            "lmo",
            "lt",
            "lv",
            "mg",
            "min",
            "mk",
            "ml",
            "mn",
            "mr",
            "mrj",
            "ms",
            "my",
            "mzn",
            "nah",
            "nap",
            "nds",
            "ne",
            "new",
            "nl",
            "nn",
            "no",
            "oc",
            "or",
            "os",
            "pa",
            "pl",
            "pms",
            "pnb",
            "pt",
            "qu",
            "ro",
            "ru",
            "sa",
            "sah",
            "scn",
            "sco",
            "sh",
            "si",
            "simple",
            "sk",
            "sl",
            "sq",
            "sr",
            "su",
            "sv",
            "sw",
            "ta",
            "te",
            "tg",
            "th",
            "tl",
            "tr",
            "tt",
            "uk",
            "ur",
            "uz",
            "vec",
            "vi",
            "vo",
            "wa",
            "war",
            "wikidata",
            "yi",
            "yo",
            "zh",
            "zh_min_nan",
            "zh_yue"};


}
