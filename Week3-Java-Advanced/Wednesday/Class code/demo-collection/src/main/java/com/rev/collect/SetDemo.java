package com.rev.collect;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo 
{
    public static void main(String[] args) 
    {
        // unordered
        Set<String> mySet = new HashSet<>();
        mySet.add("Oscar");
        mySet.add("Cody");
        mySet.add("Natalie");
        mySet.add("Oscar");
        mySet.add("Dwight");
        
        System.out.println(mySet);

        // ordered
        Set<String> myTreeSet = new TreeSet<>();
        myTreeSet.add("Oscar");
        myTreeSet.add("Cody");
        myTreeSet.add("Natalie");
        myTreeSet.add("Oscar");
        myTreeSet.add("Dwight");

        System.out.println(myTreeSet);
    }
}
