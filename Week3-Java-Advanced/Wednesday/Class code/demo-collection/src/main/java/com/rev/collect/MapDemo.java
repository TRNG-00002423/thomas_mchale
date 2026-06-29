package com.rev.collect;
import java.util.HashMap;
import java.util.Map;

public class MapDemo 
{
    public static void main(String[] args)
    {
        Map<String,Double> scores = new HashMap<>();
        scores.put("John", 0.0);
        scores.put("Audy", 91.2);
        scores.put("Curtis", 99.0);
        scores.put("Thomas", 90.1);
        scores.put("Thomas", 99.0);

        // when you try to put a key in twice 
        // the seccond one replaces the first

        System.out.println(scores);

        // how do you iterate of a map if you can't use iterator?
        // you use the map.entry class

        for (Map.Entry<String,Double> entry:scores.entrySet())
        {
            System.out.print(entry.getKey());
            System.out.print(" ");
            System.out.println(entry.getValue());
        }
    }   
}
