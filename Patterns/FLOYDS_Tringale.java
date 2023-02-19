public class FLOYDS_Tringale {
    public static void FLOYDSTriangles (int n){
        int counter = 1 ;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(counter + " ");
                counter++ ;
            }
            System.out.println();
        }
    }

    public static void main (String args[]){
        FLOYDSTriangles(4);
    }
}


// 1 
// 2  3
// 4  5  6
// 7  8  9  10
// 11 12 13 14 15
