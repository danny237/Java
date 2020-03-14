
/**
 * SumUsingRecursive
 */
import java.util.Scanner;

public class SumUsingRecursive {

    static public int sum(int a) {
        int result = 0;
        for (int i = 0; i <= a; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int x = obj.nextInt();
        int ans = sum(x);
        System.out.println("Sum of series" + x + " is " + ans);

    }
}