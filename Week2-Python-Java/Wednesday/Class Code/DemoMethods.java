import java.util.Scanner;
public class DemoMethods {
    public static void main(String[] args)
    {
        System.out.println("Hello VS Code...");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();
        System.out.println(greet(name));
    }
    
    // access modifieers: public, private, defualt

    // nonaccess modifiers: static (available to the class rather than a specific instance),
    //  final (constant [use uppercase snake]), abstract (means it is incomplete [has no body])
    static String greet(String name)
    {
        return "Hello " + name;
    }
}
