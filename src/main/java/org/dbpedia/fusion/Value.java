package org.dbpedia.fusion;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class Value {


    Map<String, SortedSet<String>> valueForLanguages = new HashMap();

    void add(String val, String lang) {
        val = val.replace("http://wikidata.dbpedia.org/resource/", "");
        if (valueForLanguages.get(val) == null) {
            valueForLanguages.put(val, new TreeSet<>());
        }

        valueForLanguages.get(val).add(lang);

    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        int totalmax = 0;
        int count = 0;

        for (String val : valueForLanguages.keySet()) {
            int currentmax = 0;
            sb.append(val).append("(");

            for (String lang : valueForLanguages.get(val)) {
                sb.append(lang).append("|");
                count++;
                currentmax++;
            }
            sb.delete(sb.length() - 1, sb.length());
            sb.append("),");
            if (totalmax < currentmax) {
                totalmax = currentmax;
            }
        }
        sb.delete(sb.length() - 1, sb.length());

        DecimalFormat df = new DecimalFormat(".###");
        return count + "," + df.format(((double) totalmax) / ((double) count)) + "," + sb.toString();
    }
}
