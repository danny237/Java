
//Program to calculate the numbers
import java.util.Scanner;

public class add_sub {

    // methods for addition
    static public void add(int a, int b) {
        int ans = a + b;
        System.out.println("The addition of two number is : " + ans);
    }

    // subtraction with return type
    static int sub(int a, int b) {
        return a - b;
    }

    // Multiplication of two number
    static int mul(int a, int b) {
        return a * b;
    }

    // division
    static float div(float a, float b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int x = obj.nextInt();
        System.out.println("Enter the second value: ");
        int y = obj.nextInt();
        add(x, y);
        System.out.println("The subtraction is : " + sub(x, y));
        System.out.println("The multiplication is : " + mul(x, y));
        System.out.println(("The division is : " + div(x, y)));

    }
}