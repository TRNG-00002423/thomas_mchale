package com.rev.arrays;

public class ArraysDemo 
{
    public static void main(String[] args) 
    {
        // array: varable used to store multiple values at the same time
        // starts at index 0
        // there is a length property (array.length) vs Python's len(array)
        // int[] myArray = new int[5];
        String[] cources = {"Java", "DataBases, Operating system"};

        for (int i = 0; i < cources.length; i++)
        {
            System.out.println(cources[i]);
        }
        // could also do
        for (String course: cources)
        {
            System.out.println(course);
        }
    }    
}
