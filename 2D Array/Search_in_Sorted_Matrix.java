public class Search_in_Sorted_Matrix {
    public static boolean search (int matrix [][] , int key){
        int i = 0 , j = matrix[0].length - 1 ;
        while(i < matrix.length && j >=0){
            if(matrix[i][j] == key){
                System.out.println("Key Found at (" +  i + "," + j + ") .");
                return true ;
            }
            else if(matrix[i][j] < key){
                i++ ;
            }
            else {
                j-- ;
            }
        }

        System.out.println("Key Not Found ");
        return false ;
    }
    public static void main (String args[] ){
    int matrix [][] = {{10,20,30,40},
                       {12,22,32,42},
                       {15,25,35,45},
                       {21,31,41,51}};
    int key = 25 ;               
    search(matrix,key);
    }
}
