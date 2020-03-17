/**
 * Fibo
 */
import java.util.Scanner;
public class Fibo {


    //function to calculate fibo:
    static public void fibo(int a) {
        int x = 0;
        int y = 1;
        System.out.println("Fibo numbers are: ");
        System.out.println("0");
        System.out.println("1");
        for(int i = 2; i < a; i++) {
            int z = x + y;
            System.out.println(z);
            x = y;
            y = z;
        }
        
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("How many fibo number do you want?");
        int x = obj.nextInt();
        System.out.println();
        fibo(x);
    }
}