import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFileExample
{
    public static void main(String[] args)
    {

        try(
            FileReader fin= new FileReader("Example.txt");
            FileWriter fout = new FileWriter("Output.txt")
        )
        {
            int ch;
            while ((ch=fin.read()) != -1)
            {
                fout.write(ch);
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}