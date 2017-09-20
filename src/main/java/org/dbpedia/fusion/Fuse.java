package org.dbpedia.fusion;

import java.io.FileWriter;

public class Fuse {

    // Load an HDTFusion and perform a search. (examples/ExampleSearch.java)
    public static void main(String[] args) throws Exception {


        //HDTFusion.getByID("http://wikidata.dbpedia.org/resource/Q64");


        for (String property : Strings.properties) {
            ValueAggregator valag = new ValueAggregator();

            for (int i = 1; i < 10000; i++) {
                HDTFusion.getByIDandProperty("http://wikidata.dbpedia.org/resource/Q" + i, "http://dbpedia.org/ontology/" + property, valag);
            }
            String vstring = valag.toString();
            if (vstring.length() > 0) {
                FileWriter fw = new FileWriter("results/" + property + ".csv");
                fw.write(vstring);
                fw.close();
            }
            System.out.println("finished " + property);
        }
    }

}