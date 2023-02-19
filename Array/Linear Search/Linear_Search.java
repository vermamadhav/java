public class Linear_Search {
    public static int LinearSearch (int arr [] , int key ){
        for(int i=0 ; i<arr.length ; i++){
            if (arr[i] == key){
                return i ;
            }
        }
        return -1 ;
    }
    public static void main (String args[]){
        int arr [] = {1,2,3,4,5,6,7,8,9} ;
        int key = 11 ;
        
        int ans = LinearSearch (arr , key);
        if (ans == -1 ){
            System.out.print("Key is Not Found") ;
        }else{
            System.out.print("Key is found at index value : " + ans ) ;
        }
    }
}