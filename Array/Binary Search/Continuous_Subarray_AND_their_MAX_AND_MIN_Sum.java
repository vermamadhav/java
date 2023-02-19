public class Continuous_Subarray_AND_their_MAX_AND_MIN_Sum {
    public static void SubArray (int arr[]){
        int totalsubarray = 0 ;
        int max = Integer.MIN_VALUE ;
        int min = Integer.MAX_VALUE ;
        for(int i = 0 ; i < arr.length ; i++){                 // For Start
            for(int j = i; j < arr.length ; j++){              // For End
                int sum = 0 ;
                for(int k = i ; k <= j ; k++){                 // for Start to End
                    System.out.print(arr[k] + "  ");
                    sum += arr[k] ;
                }
                if(sum < min){
                    min = sum ;
                }
                if (sum > max){
                    max = sum ;
                }
                System.out.println("Sum : " + sum);
                totalsubarray++ ;
            }
            System.out.println();
        }
        System.out.println("Total Subarray : " + totalsubarray);
        System.out.println("Max Sum of Subarray : " + max);
        System.out.println("Min sum of Subarray : " + min);
    }

    public static void main (String args[]){
        int arr [] = {1,2,5,9,10,16,19};
        SubArray (arr);
    }
}
