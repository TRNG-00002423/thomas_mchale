package com.rev.ops2;

public class Student extends Person {
    double gpa;

    public Student() {
    }

    public Student(String name, int age, double gpa) {
        super(name, age);
        this.gpa = gpa;
    }

    void enroleCourse(String courseName)
    {
        System.out.println(courseName);
    }
    
    @Override
    public void introduce()
    {
        System.out.println("Hello I am a student");
    }

}
