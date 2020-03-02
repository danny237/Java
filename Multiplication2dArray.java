import java.util.Scanner;

/**
 * Multi2d
 */
public class Multiplication2dArray {
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);                                   //Creating scanner object
        System.out.println("Enter the no of rows of first matrix: ");
        int r1 = obj.nextInt();                                                 //row of first matrix
        System.out.println("Enter the no of columns of first matrix: ");
        int c1 = obj.nextInt();                                                 //Column of first matrix
        System.out.println("Enter the no of rows of second matrix: ");
        int r2 = obj.nextInt();                                                 //row of first matrix
        System.out.println("Enter the no of columns of second matrix: ");
        int c2 = obj.nextInt();                                                 //column of second matrix
        
        //Checking for whether the column of first matrix and row of second matrix
        if(c1 != r2){     
            System.out.print("----------------------------");
            System.out.print("Multiplication not Possible!");
            System.out.print("----------------------------");
        }
        else{
            //Declaration of 2d array
            int[][] mat1 = new int[r1][c1];
            int[][] mat2 = new int[r2][c2];
            int[][] mat3 = new int[r1][c2];
            int total = 0;                  

             //Getting first matrix
             System.out.println("----------------------------");
            System.out.println("Enter the elements of first matrix: ");
            for(int i = 0; i < r1; i++) {
                for(int j = 0; j < c1; j++) {
                    mat1[i][j] = obj.nextInt();
                }
                System.out.println();
            }

            //Getting second matrix
            System.out.println("----------------------------");
            System.out.println("Enter the elements of second matrix: ");
            for(int i = 0; i < r2; i++) {
                for(int j = 0; j < c2; j++) {
                    mat2[i][j] = obj.nextInt();
                }
                System.out.println();
            }
            System.out.println();

            //multipllication of matrix
            for(int i = 0; i < r1; i++) {
                for(int j = 0; j < c2; j++) {
                    for(int k = 0; k < r2; k++) {    //you can use either r2 or c1
                        total = total + (mat1[i][k] * mat2[k][j]);
                        mat3[i][j] = total;
                    }
                    total = 0;
                }
            }

            //Display the answer
            System.out.println("Resul matrix is in the order of : " + r1 + " x " + c2);
            for(int i = 0; i < r1; i++) {
                for(int j = 0; j < c2; j++) {
                    System.out.print(mat3[i][j] + " ");
                }
                System.out.println();
            }
        }
    
    
    }
}