public class Merge_Sort {
    public static void divide (int arr[] , int s , int e ){
        if (s >= e){
            return ;
        }
        int mid = s + (e-s)/2 ;
        divide (arr , s , mid);
        divide (arr , mid + 1 , e);
        mergesort(arr , s , mid , e);
    }
    public static void mergesort (int arr[] , int s , int mid , int e ){
        int temparr [] = new int [e - s + 1];
        int i = s ;
        int j = mid+1;
        int k = 0 ;
        while (i <= mid && j <= e){
            if(arr [i] < arr[j]){
                temparr [k] = arr[i];
                i++ ;
            }
            else{
                temparr[k] = arr[j];
                j++ ;
            }
            k++;    
        }
        while (i <= mid){
            temparr[k++] = arr [i++];
        }
        while (j <= e){
            temparr[k++] = arr [j++];
        }
        for (k = 0 , i = s ; k < temparr.length ; k++ , i++){
            arr [i] = temparr[k];
        }
    }
    public static void main (String args[]){
        int arr [] = {5,3,7,4,1,6};
        divide (arr , 0 , arr.length - 1);
        for (int b = 0 ; b < arr.length ; b++){
            System.out.print(arr[b] + " ");
        }
    }
}
