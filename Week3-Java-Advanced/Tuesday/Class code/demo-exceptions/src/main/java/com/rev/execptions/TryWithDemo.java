package com.rev.execptions;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithDemo {
    public static void main(String[] args) 
    {
        FileReader fileReader = null;

        try
        {
            fileReader=new FileReader("abc.txt");
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        finally
        {
            
        }

        try (FileReader fileReader2 = new FileReader("abc.txt"))
        {

        }
        catch (FileNotFoundException e)
        {

        }
        catch (IOException e)
        {

        }
        
    }
}
