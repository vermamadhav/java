public class Kadanes_Max_Subarray_Sum {
    public static void maxsubarray(int arr []){
        int maxsum = 0 ;
        int sum = 0 ;
        for (int i = 0 ; i < arr.length ; i++){
            sum = sum + arr[i] ;
            if (sum < 0){
                sum = 0 ;
            }
          maxsum = Math.max(maxsum,sum);
        }
        System.out.print(maxsum);
    }

    public static void main (String args[]){
        //int arr [] = {1,2,-5,9,-10,-16,19};
        int arr [] = {1,2,-5,9,10,-16,20};

        maxsubarray (arr) ;
    }
}