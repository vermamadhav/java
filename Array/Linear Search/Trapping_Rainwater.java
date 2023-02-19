public class Trapping_Rainwater {
    public static void TrappingRainwater (int arr [] ){
        int n = arr.length;
        int width = 1 ;
        int area = 0 ;

        int leftmaxboundary [] = new int [n] ;
        leftmaxboundary[0] = arr[0] ;
        for (int i=1 ; i<n ;i++){
            leftmaxboundary[i] = Math.max(leftmaxboundary[i-1] , arr[i]);
        }

        int rightmaxboundary [] = new int [n] ;
        rightmaxboundary[n-1] = arr[n-1] ;
        for (int i=n-2 ; i>=0 ;i--){
            rightmaxboundary[i] = Math.max(rightmaxboundary[i+1] , arr[i]);
        }

        for (int i = 0 ; i<n ; i++){
            int waterlevel = Math.min(leftmaxboundary[i] , rightmaxboundary[i]) ;
            area += (waterlevel - arr [i])* width ;
        } 
        
        System.out.println(area) ;
    }

   public static void main (String args[] ){ 
   
   int arr [] = {4,2,0,6,3,2,5};
   // int arr [] = {8,6,0,2,10,7,3,2,12};
   TrappingRainwater(arr);
   }
}