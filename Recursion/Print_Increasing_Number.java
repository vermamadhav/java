public class Print_Increasing_Number {
    public static void printInc (int n ){
        if (n==1){                          // Base case 
            System.out.print(1 + " ");
            return ;
        }
        printInc( n-1 );                      // inner function call 
        System.out.print(n + " ");          // Kaam
        
    }
    public static void main (String args[]){
        int n = 10 ; 
        printInc(n);
    }
}

// OR

// public class Print_Increasing_Number {
//     public static void printInc (int n , int a){
//         if (n==a){                          // Base case 
//             System.out.print(n);
//             return ;
//         }
//         System.out.print(a + " ");          // Kaam
//         printInc( n, a+1);                      // inner function call 
        
//     }
//     public static void main (String args[]){
//         int n = 10 ; 
//         printInc(n ,1);
//     }
// }
