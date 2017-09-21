package org.dbpedia.fusion;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class Value {


    Map<String, SortedSet<String>> valueForLanguages = new HashMap();

    void add(String val, String lang) {
        if (valueForLanguages.get(val) == null) {
            valueForLanguages.put(val, new TreeSet<>());
        }
        valueForLanguages.get(val).add(lang);
    }

    public int getNrOfDifferences (){
        return valueForLanguages.keySet().size();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        int totalmax = 0;
        int count = 0;

        boolean wikidata =false;

        for (String val : valueForLanguages.keySet()) {
            int currentmax = 0;
            sb.append("<td>");
            if(val.startsWith("Q")){
                sb.append("<a href=\"http://wikidata.org/wiki/"+val+"\" >") ;
                sb.append(val) ;
                sb.append("</a>") ;

            }else{
                sb.append(val) ;

            }
            sb.append(" (");

            for (String lang : valueForLanguages.get(val)) {
                if(lang.equalsIgnoreCase("wikidata")){
                    wikidata=true;
                }

                sb.append(lang).append("|");
                count++;
                currentmax++;
            }
            sb.delete(sb.length() - 1, sb.length());
            sb.append(")</td>");
            if (totalmax < currentmax) {
                totalmax = currentmax;
            }
        }
        //sb.delete(sb.length() - 1, sb.length());

        DecimalFormat df = new DecimalFormat(".###");
        return count + "</td><td>" + df.format(((double) totalmax) / ((double) count)) + "</td><td>"+((wikidata)?"yes":"maybe")+ "</td><td>" + sb.toString();
    }
}
