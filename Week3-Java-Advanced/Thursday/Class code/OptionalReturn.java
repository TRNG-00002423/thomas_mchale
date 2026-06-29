import java.util.Optional;

public class OptionalReturn 
{
    // method that might return null
    private static String lookUp()
    {
        return null;
    }


    // much safer
    private static Optional<String> newLookUp()
    {
        return Optional.ofNullable(null);
    }

    public static void main(String[] args) 
    {
        System.out.println(lookUp());

        System.out.println(newLookUp());
    }
}
