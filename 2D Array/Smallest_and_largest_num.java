import java.util.*;

public class Smallest_and_largest_num {
    public static void SmallestandLargest (int matrix [][] ){
        int smallest = Integer.MAX_VALUE ;
        int largest = Integer.MIN_VALUE ;
        Scanner sc = new Scanner (System.in);

        System.out.print("Give Numbers in 2D Array : ") ;

        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                matrix[i][j] = sc.nextInt() ;
                smallest = Math.min(smallest , matrix[i][j]);
                largest = Math.max(largest , matrix[i][j]);
            }
        }
        print (matrix); 

        System.out.println("Smallest Number : " + smallest);
        System.out.println("largest Number : " + largest);
    }

    public static void print (int matrix[][]){
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                System.out.print(matrix[i][j] + " ") ;
            }
            System.out.println() ;
        }
    }
    public static void main (String args[] ){
    int matrix [][] = new int [3][3] ;
    SmallestandLargest (matrix);
    }
}
