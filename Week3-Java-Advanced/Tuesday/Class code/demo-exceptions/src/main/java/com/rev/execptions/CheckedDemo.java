package com.rev.execptions;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedDemo {
    public static void main(String[] args) {
        // this is an exception that is found at compile time
        // better known as a checked exception
        try
        {
            FileReader FileReader = new FileReader("abc.txt");
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        
    }
    
}
