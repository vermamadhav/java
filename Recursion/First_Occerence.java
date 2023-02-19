public class First_Occerence {
    public static int firstOccerence (int arr [] , int i , int n){
        if(i == arr.length){
            return -1 ;
        }
        if(arr[i] ==  n){
            return i ;
        }
        return firstOccerence(arr , i+1 , n);
    }
    public static void main (String args[]){
        int arr [] = {1,4,3,5,2,3,2,5,7,3,2};
        System.out.println(firstOccerence(arr , 0 , 2));
    }
}
