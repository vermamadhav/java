public class Search_In_Rotated_Sorted_Array {
    public static int search (int arr[] , int s , int e , int t){
        int mid = s + (e-s)/2 ;
        if (arr[mid] == t){
            return mid ;
        }
        if (arr[s] <= arr[mid]){
            if (arr[s] <= t && t < arr[mid]){
                return search(arr , s , mid -1 , t);
            }
            else {
                return search(arr , mid +1 , e , t);
            }
        }
        else{
            if (arr[mid] < t && t <= arr[e]){
                return search(arr , mid +1 , e , t);
            }
            else {
                return search(arr , s , mid -1 , t);
            }
        }
    }
    public static void main (String args[]){
        int arr [] = {4,5,6,7,8,9,0,1,2,3};
        int target = 9 ;
        int i = search (arr , 0 , arr.length - 1 , target);
        // for (int b = 0 ; b < arr.length ; b++){
             System.out.print(i);
        // }
    }
}
