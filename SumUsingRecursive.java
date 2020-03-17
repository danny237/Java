
/**
 * SumUsingRecursive
 */
import java.util.Scanner;

public class SumUsingRecursive {

    static public int sum(int a) {
        if (a < 1){
            return 0;
        }
        else
        {
            return a + sum(a-1);
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int x = obj.nextInt();
        int ans = sum(x);
        System.out.println("Sum of series" + x + " is " + ans);

    }
}