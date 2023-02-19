public class Selection_Sorting {
    public static void selectionsort (int arr [] ){
        for(int i = 0 ; i < arr.length - 1 ; i++){
            int minposition = i ;
            for (int j = i+1  ; j < arr.length ; j++){
                if (arr[minposition] > arr[j]){
                    minposition = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minposition] ;
            arr[minposition] = temp ;
        }
    }
    public static void print (int arr [] ){
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + ",");
        }
    }
    public static void main (String args[] ){
        int arr [] = {5,8,6,4,2,5,10,0,1,3} ;
        selectionsort (arr);
        print(arr);
    }
}