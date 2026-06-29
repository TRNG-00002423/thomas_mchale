package com.rev.ops;

public class StudentManager 
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.name="Audy";
        s1.age=24;
        s1.gpa=3.8;

        Student s2 = new Student("Audy", 24, 3.8);
        Student s3 = new Student("John", 26, 3.9);
        
        // used to get the class name and package name
        System.out.println(s2.getClass());
        // will just print the location in memory if not overwritten
        System.out.println(s2);
        // will just compair the memory adress
        System.out.println(s1 == s2);
        // instead you need to override the equals method
        System.out.println(s1.equals(s2));
    }    
}
