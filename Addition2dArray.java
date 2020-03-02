// Program for adding the 2d array
import java.util.Scanner;
/**
 * addition2d
 */
public class Addition2dArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);         //Creating the Scanner object
        System.out.print("Enter no of rows: ");
        int rows = s.nextInt();                     //get the no of rows
        System.out.print("Enter no of columns: ");
        int columns = s.nextInt();
        System.out.println("-----------------------------------");
        System.out.println("Both matrix should have equal no of rows and columns.");     //get the no of columns
        System.out.println("-----------------------------------");
        int[][] a = new int[rows][columns];         //Creating 2d array 
        int[][] b = new int[rows][columns];

        //Elements for first matrix
        System.out.println("Enter the elements for first matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = s.nextInt();              //get individual element for first matrix
            }
            System.out.println();
        }

        //Elements for second matrix
        System.out.println("Enter the elements for second matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                b[i][j] = s.nextInt();              //individual element for second matrix
            }
            System.out.println();
        }
        
        //Result matrix
        int[][] c = new int[rows][columns];         //creating matrix for storing the result
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        //display the result;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(c[i][j] + " ");    //Prints the element and add space 
            }
            System.out.println();
        }
    }
}           //The end