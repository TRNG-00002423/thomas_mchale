package com.rev.execptions;

public class UnCheckedDemo {
    public static void main(String[] args) {
        // this error is thrown during runtime
        int[] myArray=new int[5];
        try 
        {
            myArray[5]=10;
            System.out.println(myArray[5]);
        } 
        catch (ArithmeticException e) 
        {
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        System.out.println("Program ends...");
        
        try 
        {
            
        } 
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) 
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Finally");
        }
    }
}