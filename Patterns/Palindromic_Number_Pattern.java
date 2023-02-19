public class Palindromic_Number_Pattern {
    // public static void pattern (int n ){
    //     for (int i = 1 ; i<=n ; i++ ){
    //         for (int j = 1 ; j<=n-i ; j++ ){
    //             System.out.print("  ");
    //         }     
    //         for (int j = i ; j>=1 ; j--){
    //             System.out.print(j + " ");
    //         }  
    //         for (int j = 2 ; j<=i ; j++){
    //             System.out.print(j + " ");
    //         }
    //         System.out.println();  
    //     }
    // }

    public static void pattern (int n ){
        for (int i = 1 ; i<=n ; i++ ){
            for (int j = 1 ; j<=n ; j++ ){
                if( j <= n-i ){
                    System.out.print("  ") ;
                }
                else{
                    System.out.print((n-j+1) + " ");
                }
            }  
            for (int j = 2 ; j<=i ; j++){
                System.out.print(j + " ");
            }
            System.out.println();  
        }
    }
    public static void main (String args[] ){
    int n = 5 ;
    pattern (n) ; 
    }
}


//           1 
//         2 1 2
//       3 2 1 2 3
//     4 3 2 1 2 3 4 
//   5 4 3 2 1 2 3 4 5 