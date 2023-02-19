public class Counting_Sort {
    public static void countingsort (int arr [] ){
        int largestnum = Integer.MIN_VALUE ;
        for(int i = 0 ; i < arr.length ; i++){                   // largest number in array
            largestnum = Math.max(arr[i] , largestnum);
        }
        int count [] = new int [largestnum + 1];             
        for(int i = 0 ; i < arr.length ; i++){                   // counting 
            count[arr[i]]++ ;
        }
        int j = 0 ;
        for(int i = 0 ; i < count.length ; i++){              // put counted number in array
            while (count[i] > 0){
                arr[j] = i ;
                j++ ;
                count[i] -- ;
            }
        }
    }
    public static void print (int arr [] ){
        for(int i = 0 ; i < arr.length  ; i++ ){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main (String args[] ){
        int arr [] = {5,8,6,4,2,5,10,0,1,3} ;
        countingsort (arr);
        print(arr);
    }
}
