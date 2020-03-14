
/**
 * PrimeNo
 */
import java.util.Scanner;

public class PrimeNo {

    // function to find prime number
    // static public void findPrime(int a) {
    // for (int i = 2; i < a; i++) {
    // if (a % i == 0) {
    // System.out.println("Number is not a prime.");
    // break;
    // // System.out.println(i);
    // } else {
    // System.out.println("Number is prime.");
    // break;
    // // System.out.println(i);
    // }
    // }
    // }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = obj.nextInt();
        if (findPrime(x)) {
            System.out.println("Prime");
        } else {
            System.out.println("not");
        }
    }

    public static boolean findPrime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}