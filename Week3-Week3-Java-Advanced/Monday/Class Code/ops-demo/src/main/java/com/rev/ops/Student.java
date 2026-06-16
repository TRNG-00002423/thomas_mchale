package com.rev.ops;

public class Student {
    String name;
    double gpa;
    int age;

    Static int counter= 0;

    public Student()
    {

    }

    public Student(String name, int age, double gpa)
    {
        this.name = name;
        this.age = age;
        this.gpa = gpa;

        counter += 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0 && gpa <= 4.0)
        {
            this.gpa = gpa;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        Student other=(Student)obj;
        return age == other.age && Double.compare(gpa, other.gpa) == 0 && name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age,gpa);
    }

    public void enrollCourse(String courseName){
        System.out.println("Enrolled in :" + courseName);
    }
}
