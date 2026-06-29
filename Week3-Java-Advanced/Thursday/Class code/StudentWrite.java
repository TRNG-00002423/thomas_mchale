
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class StudentWrite 
{
    public static void main(String[] args) 
    {
        Student s = new Student(101, "ABC", 24);
        try (
            FileOutputStream fout = new FileOutputStream("student.dat");
            ObjectOutputStream oout = new ObjectOutputStream(fout) 
            )
        {
            oout.writeObject(s);
        }
        catch (IOException e )
        {
            e.printStackTrace();
        }

        try (
            FileInputStream fin = new FileInputStream("student.dat");
            ObjectInputStream oin = new ObjectInputStream(fin)
            ) 
        {
            Student savedStudent = (Student) oin.readObject();
        }
        catch(IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
    