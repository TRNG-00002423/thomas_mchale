package com.exercise_maven_setup;

public class Greeter 
{
    String hello(String name)
    {
        if (name.length() < 1)
        {
            throw new IllegalArgumentException("Invalid value");
        }
        return "Hello, " + name;
    }
}
