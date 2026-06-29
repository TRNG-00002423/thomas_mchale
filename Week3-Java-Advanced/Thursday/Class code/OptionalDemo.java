


public class OptionalDemo {
    // previously
    private static void printLenOld(String name)
    {

    }

    // new and safer way
    private static void printLenNew(String name)
    {

    }

    public static void main(String[] args)
    {
        String name1 = null;
        String name2 = "Jim";

        printLenOld(name1);
        printLenOld(name2);

        printLenNew(name1);
        printLenNew(name2);
    }
}
