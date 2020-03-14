
/**
 * recursive
 */
import java.util.Scanner;

public class FactUsingRecursive {

    static public int fact(int a) {
        if (a == 1) {
            return 1;
        } else {
            return a * fact(a - 1);
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = obj.nextInt();
        int ans = fact(x);
        System.out.println("Factorial of " + x + ": " + ans);
    }
}