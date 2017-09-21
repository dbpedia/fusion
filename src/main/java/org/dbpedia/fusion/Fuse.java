package org.dbpedia.fusion;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.FileWriter;

public class Fuse {

    // Load an HDTFusion and perform a search. (examples/ExampleSearch.java)
    public static void main(String[] args) throws Exception {


        //HDTFusion.getByID("http://wikidata.dbpedia.org/resource/Q64");


        int qs = 50000;
        int i = 1;
        for (; i < qs; i++) {
            String wdUri = "http://wikidata.dbpedia.org/resource/Q" + i;
            WikidataQ valag = new WikidataQ(wdUri);

            HDTFusion.label(valag);

            for (String property : Strings.properties) {

                HDTFusion.getByIDandProperty(wdUri, property, valag);

                //System.out.println("finished " + property);
            }


            String vstring = valag.toString();
            String labels = "";
            for (String s : valag.labels) {
                labels += s + " - ";
            }
            if (vstring.length() > 0) {
                VelocityEngine ve = new VelocityEngine();
                ve.init();
                Template t = ve.getTemplate("QX.html");
                VelocityContext context = new VelocityContext();

                context.put("labels", labels);
                context.put("table", vstring);
                context.put("i", i);

                FileWriter fw = new FileWriter("results/q" + i + ".html");
                t.merge(context, fw);
                fw.close();
            }

        }

    }

}