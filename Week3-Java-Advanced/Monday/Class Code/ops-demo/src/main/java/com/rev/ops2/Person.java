package com.rev.ops2;

// putting a restriction to not be able to create an object of the class
// you are basically sayint that this is incomplete
public abstract class Person {
    private String name;
    private int age;
    
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // means the same thing for methods
    // just means this method is incomplete
    public abstract void introduce();
}
