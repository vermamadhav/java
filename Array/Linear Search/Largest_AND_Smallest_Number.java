public class Largest_AND_Smallest_Number {
    public static void Largestandsmallestnumber (int arr []){
        int max = Integer.MIN_VALUE ;
        int min = Integer.MAX_VALUE ;
        for(int i = 0 ; i < arr.length ; i++){
            if (arr[i] > max){
                max = arr[i] ;
            }
            if (arr[i] < min ){
                min = arr[i] ;
            }
        }
        System.out.println("Smallest number : " + min);
        System.out.println("Largest Number : " + max);
    }
    public static void main (String args[]){
        int arr []  = {1,8,22,7,102,96,-8,25,6} ;
        Largestandsmallestnumber (arr) ;
    }
}