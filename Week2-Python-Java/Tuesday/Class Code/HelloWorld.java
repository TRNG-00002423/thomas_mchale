// jvm : java virtual machine (class loader | Bytecode Executor)
// jre : java runtime env (core Libraries: java.lang, java.util)
// jvk : (Developer Tools: javac, jar)

// java convention has classes capitalized
// so in our example we are using 3 different classes (HelloWorld, String, System)

/*
multi line comment
*/

/**
 * documentation comments
 */
public class HelloWorld 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello World!");
        // One way to get user input (command line arguments)
        String firstName = args[0];
        String lastName = args[1];
        System.out.printf("My name is %s %s", firstName, lastName);
    }
}