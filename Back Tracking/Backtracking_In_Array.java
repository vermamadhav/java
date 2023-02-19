public class Backtracking_In_Array {
    public static void backtrack (int arr [] , int i , int value){
        if (i == arr.length){
            for (int j = 0 ; j < arr.length ; j++){
                System.out.print(arr[j]);
            }
            return ;
        }
        arr [i] = value ;
        backtrack (arr , i + 1 , value + 1);   // function call step
        arr[i] -= 2 ;                          // backtracking step 
    }
    public static void main (String args[]){
        int n = 5 ;
        int arr [] = new int [n];
        backtrack (arr , 0 , 5);
        System.out.println();
        for (int j = 0 ; j < n ; j++){
            System.out.print(arr[j]);
        }
    }
}