public class HelloWeek2 {

    public static void main(String[] args)
    {
        int argCount = args.length;
        if (argCount > 0)
        {
            System.out.printf("Hello, %s", args[0]);
        }
        else
        {
            System.out.println("Hello, trainee!");
        }
    }
}


