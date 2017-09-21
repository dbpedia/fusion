package org.dbpedia.fusion;

import org.apache.commons.collections.map.HashedMap;

import java.util.HashSet;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;


public class WikidataQ implements Comparable<WikidataQ> {

    String URI ;
    SortedSet<String> labels = new TreeSet<String>();
    int numberOfDifferences = 0;
    Map<String,Value> propertyToValue = new HashedMap();

    public WikidataQ(String URI) {
        this.URI = URI;
    }

    public void put(String property, String val, String lang) {
        if (propertyToValue.get(property) == null) {
            propertyToValue.put(property, new Value());
        }
        propertyToValue.get(property).add(val, lang);
    }


    public void setNumberOfDifferences(){
        for (Value v: propertyToValue.values()){
            numberOfDifferences +=v.getNrOfDifferences();
        }
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();

        for(String property : propertyToValue.keySet()){
            Value v = propertyToValue.get(property);
            if(Strings.getMap().get(property) !=null ){
                property = Strings.getMap().get(property);
            }
            sb.append("<tr><td>");

            sb.append(property).append("</td><td>");
           sb.append(v.toString());
           sb.append("</tr>");

        }
        return sb.toString();


    }

    @Override
    public int compareTo(WikidataQ o) {
        return o.numberOfDifferences-this.numberOfDifferences;
    }
}
