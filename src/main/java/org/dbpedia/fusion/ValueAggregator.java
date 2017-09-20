package org.dbpedia.fusion;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;


public class ValueAggregator {

    public HashMap<String, Value> uriToValueAggregator = new HashMap();

    public void put(String identifier, String val, String lang) {
        if (uriToValueAggregator.get(identifier) == null) {
            uriToValueAggregator.put(identifier, new Value());
        }
        uriToValueAggregator.get(identifier).add(val, lang);
    }




    public String toString(){
        StringBuffer sb = new StringBuffer();

        for(String identifier : uriToValueAggregator.keySet()){
           sb.append(identifier.replace("http://wikidata.dbpedia.org/resource/","https://www.wikidata.org/wiki/")).append(",");
           sb.append(uriToValueAggregator.get(identifier).toString());
           sb.append("\n");

        }
        return sb.toString();


    }
}
