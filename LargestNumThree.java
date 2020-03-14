
/**
 * LargestNumThree
 */
import java.util.Scanner;

public class LargestNumThree {

    // function to fund the greatest number
    static public float findGreatest(float a, float b, float c) {
        float ans;
        if (a > b && a > c) {
            System.out.println("a is greater.");
            ans = a;
        } else if (b > a && b > c) {
            System.out.println("b is greater.");
            ans = b;
        } else {
            System.out.println("c is greater.");
            ans = c;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float x = obj.nextInt();
        System.out.println(("Enter the second number: "));
        float y = obj.nextInt();
        System.out.println("Enter the third number: ");
        float z = obj.nextInt();
        float ans = findGreatest(x, y, z);
        System.out.println("The greatest number is : " + ans);
    }
}