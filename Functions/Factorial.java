// public class Factorial {
//     public static int Factorial(int n) {
//         if (n == 0) {
//           return 1 ;
//         }
//         int facto = 0 ;
//         if (n > 0) {
//             facto = n * Factorial(n - 1);
//         }  
//             return facto;
//     }

//     public static void main(String args[]) {
//         int n = 7;
//         int f = Factorial(n);
//         System.out.println(f);

//     }

// }




public class Factorial {
    public static int Factorial(int n ){
        int fact = 1 ;
        for(int i =1 ; i<=n ; i++){
            fact *= i ;
        }
        return fact ;
    }

    public static void main (String args[]){
        int n = 10 ;
        int fact = Factorial (n);
        System.out.println(fact) ;
    }
}
