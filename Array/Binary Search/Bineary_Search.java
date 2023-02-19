public class Bineary_Search {
    public static int BinarySearch (int arr[] , int key ){
        int start = 0 ; 
        int end = arr.length - 1 ; 

        while (start <= end){
            int mid = (start + end)/2 ;

            if (arr[mid] == key){
                return mid ;
            }

            else if (arr[mid] < key ){
                start = mid + 1 ;
            }

            else {
                end = mid - 1 ;
            }
        }
        return -1 ;
    }

    public static void main (String args[]){
        int arr [] = {1,2,5,9,45,63,95};
        int key = 9 ;
        int ans = BinarySearch (arr , key);
        System.out.print(ans) ;
    }
}
