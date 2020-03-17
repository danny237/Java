
/**
 * SumUsingRecursive
 */
import java.util.Scanner;

public class PowerUsingRecursive {

    static public int pow(int a) {
        if (a < 1){
            return 1;
        }
        else
        {
            return a * pow(a-1);
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int x = obj.nextInt();
        int ans = pow(x);
        System.out.println("Sum of series" + x + " is " + ans);

    }
}