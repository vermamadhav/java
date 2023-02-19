public class prefix_Subarray_Max_Sum {
    public static void subarraysum (int arr []){
        int max = Integer.MIN_VALUE ;
        int min = Integer.MAX_VALUE ;

        int prefix [] = new int [arr.length] ;
        prefix[0] = arr[0] ;
        for(int i = 1 ; i < arr.length ; i++){ 
            prefix [i]  = prefix [i-1] + arr[i] ;
        }    

        for(int i = 0 ; i < arr.length ; i++){                   // start 
            int sum = 0 ;
            for(int j = i; j < arr.length ; j++){                // end 
                sum = (i == 0) ? prefix [j] : prefix [j] - prefix [i-1] ;
                if(sum < min){
                    min = sum ;
                }
                if (sum > max){
                    max = sum ;
                }
            }
        }
        System.out.println("Max Sum of Subarray : " + max);
        System.out.println("Min sum of Subarray : " + min);        
    } 

    public static void main (String args[]){
        //int arr [] = {1,2,-5,9,10,-16,19};
        int arr [] = {1,2,5,9,10,16,19};

        subarraysum (arr);
    }
}
