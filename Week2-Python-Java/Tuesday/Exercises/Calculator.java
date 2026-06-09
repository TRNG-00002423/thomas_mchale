/**
 * Week 2 Exercise — Calculator with static methods and overloads.
 *
 * Division by zero strategy (TODO — choose and implement):
 *   Option A: print error message and return Double.NaN
 *   Option B: return 0.0 and document why (not ideal for production)
 *
 * Compile: javac Calculator.java
 * Run:     java Calculator
 */
public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    /** Sum of three doubles — overloads add(a,b). */
    public static double add(double a, double b, double c) {
        return add(add(a,b),c);
    }

    public static double subtract(double a, double b) {
        
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0)
        {
            System.out.println("Unable to divide by zero, please choose another operation");
            return -1;
        }
        return a/b;
    }

    public static void main(String[] args) {
        System.out.println(add(2,4));
        System.out.println(add(2,4,6));
        System.out.println(divide(10,0));
    }
}