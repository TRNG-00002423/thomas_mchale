package com.rev.execptions;

public class ThrowDemo {
    public static void checkAge(int age)
    {
        if (age < 18)
        {
            throw new IllegalArgumentException("Age must be >= 18");
        }
    }

    public static void main(String[] args)
    {
        checkAge(10);
    } 
}
