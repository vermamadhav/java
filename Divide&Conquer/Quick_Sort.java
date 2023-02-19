public class Quick_Sort {
    public static void quicksort (int arr[] , int s , int e){
        if (s >= e){
            return ;
        }
        int pivot = partition (arr , s , e);
        quicksort(arr , s , pivot - 1);
        quicksort(arr , pivot + 1 , e);
    }
    public static int partition (int arr [] , int s , int e){
        int pivot = arr[e];
        int a = s;
        for(int i = s ; i < e ; i++){
            if (arr[i] < pivot){
                int temp = arr[a];
                arr[a] = arr[i];
                arr[i] = temp ;
                a++;
            }
        }
        int temp = arr[a];
        arr[a] = pivot;
        arr[e] = temp ;
        return a ;
    }
    public static void main (String args[]){
        int arr [] = {5,3,7,4,1,6};
        quicksort (arr , 0 , arr.length - 1);
        for (int b = 0 ; b < arr.length ; b++){
            System.out.print(arr[b] + " ");
        }
    }
}