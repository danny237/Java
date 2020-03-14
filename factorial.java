
/**
 * factorial
 */
import java.util.Scanner;

public class factorial {

    // method for factorial
    static public int factorial(int a) {
        int fact = 1;
        for (int i = a; i > 0; i--) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = obj.nextInt();
        System.out.println("Factorial: " + factorial(x));
    }
}