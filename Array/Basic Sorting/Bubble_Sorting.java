public class Bubble_Sorting {
    public static void bubblesort (int arr[] ){
        for(int j = 0 ; j < arr.length - 1 ; j++){
            for(int i = 0 ; i < arr.length - j - 1 ; i++){
                if (arr[i] > arr[i+1]){
                    int temp = arr[i] ;
                    arr[i] = arr[i+1] ;
                    arr[i+1] = temp ;
                }                            // Worst case T.C. - O(n^2)
            }                                // Best case T.C. - O(n^2)
        }
    }
    
    public static void OptimisedBubblesort (int arr[] ){
        for(int j = 0 ; j < arr.length - 1 ; j++){
            boolean swap = false ;
            for(int i = 0 ; i < arr.length - j - 1 ; i++){
                if (arr[i] > arr[i+1]){
                    int temp = arr[i] ;
                    arr[i] = arr[i+1] ;
                    arr[i+1] = temp ;
                    swap = true ;
                }                            // Worst case T.C. - O(n^2)
            }                                // Best case T.C. - O(n)
            if (swap == false){
                break;
            }
        }
    }

    public static void print(int arr []){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + ",");
        }
    }

    public static void main (String args[]){
        int arr [] = {5,8,6,4,2,1,3} ;
        // bubblesort (arr);
        OptimisedBubblesort(arr);
        print(arr);
    }
}