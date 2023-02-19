public class Last_Occerence {
    public static int lastOccerence (int arr [] , int i , int key){
        if(i == arr.length){
            return -1 ;
        }
        int isfound = lastOccerence(arr , i+1 , key);
        
        if(isfound == -1 && arr[i] ==  key){
            return i ;
        }

        // OR
        
        // if(isfound != -1){
        //     return isfound ;
        // }
        // if(arr[i] ==  key){
        //     isfound = i ;
        // }
        return isfound ;
    }
    public static void main (String args[]){
        int arr [] = {1,4,3,5,2,3,2,5,7,3,2};
        System.out.println(lastOccerence(arr , 0 , 7));
    }
}

// OR

// public class Last_Occerence {
//     public static int lastOccerence (int arr [] , int i , int key){
//         if(arr[i] ==  key){
//             return i ;
//         }
//         if(i == 0){
//             return -1 ;
//         }
//         return lastOccerence(arr , i-1 , key);
//     }
//     public static void main (String args[]){
//         int arr [] = {1,4,3,5,2,3,2,5,7,3,2};
//         System.out.println(lastOccerence(arr , arr.length - 1 , 5));
//     }
// }