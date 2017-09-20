package org.dbpedia.fusion;

import java.io.FileWriter;

public class Fuse {

    // Load an HDTFusion and perform a search. (examples/ExampleSearch.java)
    public static void main(String[] args) throws Exception {


        //HDTFusion.getByID("http://wikidata.dbpedia.org/resource/Q64");

        String property = "http://dbpedia.org/ontology/areaCode";
        for (int i=1;i<10000;i++) {
            HDTFusion.getByIDandProperty("http://wikidata.dbpedia.org/resource/Q"+i, "http://dbpedia.org/ontology/areaCode");
        }
        FileWriter fw = new FileWriter("result.tsv");
        fw.write(ValAgg.ValaggtoString());
        fw.close();
    }

}