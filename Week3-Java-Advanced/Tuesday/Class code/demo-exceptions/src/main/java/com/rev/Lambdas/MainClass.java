package com.rev.Lambdas;

public class MainClass 
{
    public static void main(String[] agrs)
    {
        AdditionImpl addtionImpl = new AdditionImpl();
        System.out.println(addtionImpl.add(10,20));

        // this only works becuase it is a functional interface or SAM interface (Single abstract function)
        // they can have any number of static and default methods
        // that means it only has one abstract method
        // marker interfaces have no abstract methods (Serializable, Cloneable)

        // lambda express has 3 parts
        // first the parameters: (a,b)
        // then the arrow: ->
        // finally the body: a+b;
        // note how you don't need to specify the type

        Addition sum = (a,b) -> a+b;
        int result = sum.add(10,20);
    }
}
