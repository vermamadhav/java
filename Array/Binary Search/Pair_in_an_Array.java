public class Pair_in_an_Array {
    public static void PairInArray (int arr []){
        int totalpair = 0 ;
        for (int s = 0 ; s < arr.length ; s++ ){
            for(int j = s +1 ; j < arr.length ; j++){
                System.out.print( "(" + arr[s] + "," + arr[j] + ")" + " ");
                totalpair++ ;
            }
            System.out.println() ;
        }
        System.out.println("total Pairs : " + totalpair);
    
    }
    public static void main (String args[]){
        int arr [] = {1,2,5,9,10,16,19};
        PairInArray (arr);
    }
} 