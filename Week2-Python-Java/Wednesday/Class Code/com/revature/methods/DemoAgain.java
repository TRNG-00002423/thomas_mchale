package com.revature.methods;

public class DemoAgain {
    public static void main(String[] args) 
    {
        DemoAgain dm = new DemoAgain();
        System.out.println(dm.sayHello("Erm"));
    }

    public static int sum(int ...numbers)
    {
        int total = 0;
        for (int num:numbers)
        {
            total+=num;
        }
        return total;
    }

    public String sayHello(String name)
    {
        return "Hello " + name;
    }
}
