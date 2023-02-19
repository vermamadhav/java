public class Reverse_An_Array {
    public static void Reversearray (int arr []){
        int first = 0 , last = arr.length - 1 ;

        while (first < last){
            int temp = arr[first] ;
            arr[first] = arr[last] ;
            arr[last] = temp ;
            first++ ;
            last-- ;
        }
    }    
    public static void main (String args[]){
        int arr [] = {1,2,5,9,45,63,95};
        Reversearray (arr) ;

        System.out.println("Reversed Array : ");
        for (int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    // OR
    
    // public static void Reversearray (int arr []){
    //     for (int i=arr.length - 1 ; i>=0; i--){
    //         System.out.print(arr[i] + " ");
    //     }
    // }

    // public static void main (String args[]){
    //     int arr [] = {1,2,5,9,45,63,95};
    //     Reversearray (arr) ;
    // }
}