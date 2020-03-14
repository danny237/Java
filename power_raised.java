
/**
 * power_raised
 */
import java.util.Scanner;

public class power_raised {
    static public int raiseToPower(int a, int b) {
        int ans = 1;
        for (int i = 0; i < b; i++) {
            ans *= a;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = obj.nextInt();
        System.out.println("Raised to the power: ");
        int y = obj.nextInt();
        int ans = raiseToPower(x, y);
        System.out.println(x + " to the power " + y + " is " + ans);
    }
}