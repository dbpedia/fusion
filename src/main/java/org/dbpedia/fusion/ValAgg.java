package org.dbpedia.fusion;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class ValAgg {

    public static HashMap<String, ValAgg> uriToValag = new HashMap();

    public static void put(String identifier, String val, String lang) {
        if (uriToValag.get(identifier) == null) {
            uriToValag.put(identifier, new ValAgg());
        }
        uriToValag.get(identifier).add(val, lang);
    }


    Map<String, SortedSet<String>> valLang = new HashMap();

    void add(String val, String lang) {

        if (valLang.get(val) == null) {
            valLang.put(val, new TreeSet<>());
        }

        valLang.get(val).add(lang);

    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        int totalmax = 0;
        int count = 0;

        for (String val : valLang.keySet()) {
            int currentmax = 0;
            sb.append(val).append("(");

            for (String lang : valLang.get(val)) {
                sb.append(lang).append(", ");
                count++;
                currentmax++;
            }

            sb.append(")    ");
            if (totalmax < currentmax) {
                totalmax = currentmax;
            }
        }

        return count + "  " + (totalmax / count) + "    " + sb.toString();
    }

    public static String ValaggtoString(){
        StringBuffer sb = new StringBuffer();

        for(String identifier : uriToValag.keySet()){
           sb.append(identifier).append("   ");
           sb.append(uriToValag.get(identifier).toString());

        }
        return sb.toString();


    }
}
