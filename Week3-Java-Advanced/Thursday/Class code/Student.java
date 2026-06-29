import java.io.Serializable;

public class Student implements Serializable
{
    public int id;
    private String name;
    private transient int age;

    public Student() 
    {
    }

    public Student(int id, String name, int age) 
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }
        
}
