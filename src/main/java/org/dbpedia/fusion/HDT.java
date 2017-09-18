package org.dbpedia.fusion;

import org.rdfhdt.hdt.hdt.HDT;
import org.rdfhdt.hdt.hdt.HDTManager;
import org.rdfhdt.hdt.triples.IteratorTripleString;
import org.rdfhdt.hdt.triples.TripleString;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class HDT {

    static Map<String, org.rdfhdt.hdt.hdt.HDT> langToHDT = new HashMap<>();


    // Load an HDT and perform a search. (examples/ExampleSearch.java)
    public static void main(String[] args) throws Exception {

        for (String lang : languages) {
            try {
                langToHDT.put(lang, HDTManager.loadHDT("data/hdt/downloads.dbpedia.org/2016-10/tmp/data/" + lang + "/wkd_uris_selection.gz.hdt", null));
            } catch (Exception e) {

                System.err.println(e.getMessage());
            }
        }
        TimeUnit.MINUTES.sleep(1);



        // Load HDT file.
        // NOTE: Use loadIndexedHDT() for ?P?, ?PO or ??O queries
        //HDT hdt = HDTManager.loadHDT("data/hdt/downloads.dbpedia.org/2016-10/tmp/data/als/wkd_uris_selection.gz.hdt", null);

        // Search pattern: Empty string means "any"
        /*IteratorTripleString it = hdt.search("", "", "");
        while (it.hasNext())

        {
            TripleString ts = it.next();
            System.out.println(ts);
        }*/

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
