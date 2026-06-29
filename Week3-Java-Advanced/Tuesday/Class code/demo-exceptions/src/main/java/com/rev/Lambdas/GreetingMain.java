package com.rev.Lambdas;

public class GreetingMain {
    public static void main(String[] args) {
        Greeting greet = (name)->"Greetings " + name;
        Greeting test = (name)->"Greetings " + name;
        greet.sayHello("Jim");
        test.sayHello("Jim");
    }
}
