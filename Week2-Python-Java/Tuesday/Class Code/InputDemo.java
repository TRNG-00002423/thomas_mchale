import java.util.Scanner;
public class InputDemo {
    public static void main(String args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String input = scanner.nextLine();
        System.out.printf("Hello %s", input);
        scanner.close();
    }
}