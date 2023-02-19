import java.util.*;

public class Search_Key {
    public static void input (int matrix [][] ){
        Scanner sc = new Scanner (System.in);
        System.out.print("Give Numbers in 2D Array : ") ;
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                matrix[i][j] = sc.nextInt() ;
            }
        }
    }

    public static boolean search (int matrix[][] , int key){
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                if (matrix[i][j] == key){
                    System.out.print("Key Found ") ;
                    return true ;
                } 
            }
        }
        System.out.println("Key Not Found ") ;
        return false ;
    }
    public static void main (String args[] ){
    int matrix [][] = new int [3][3] ;
    input (matrix) ;
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter Key : ") ;
    int key = sc.nextInt() ;
    search (matrix,key) ;
    } 
}