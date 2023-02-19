public class Insertion_Sort {
    // public static void insertionsort (int arr [] ){
    //     for(int i = 0 ; i < arr.length - 1 ; i++ ){
    //         for(int j = i ; j >= 0 ; j-- ){
    //             if (arr[j] > arr [j+1]){
    //                 int temp = arr [j] ;
    //                 arr [j] = arr[j+1] ;
    //                 arr[j+1] = temp ;
    //             } 
    //         }
    //     }
    // }
    
    // OR
    
    public static void insertionsort (int arr [] ){
        for(int i = 1 ; i < arr.length  ; i++ ){
            int current = arr[i];
            int previous = i-1;
            while (previous >= 0 && arr[previous] > current){
                arr[previous + 1] = arr[previous] ;
                previous-- ;
            }
            arr[previous + 1] = current ;
        }
    }

    public static void print (int arr [] ){
        for(int i = 0 ; i < arr.length  ; i++ ){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main (String args[] ){
        int arr [] = {5,8,6,4,2,1,3} ;
        insertionsort (arr);
        print(arr);
    }
}