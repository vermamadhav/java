import java.util.*;
public class Prime_Number_upto_n {
    public static boolean isprime(int n ){
        for(int i = 2 ; i<=Math.sqrt(n) ; i++){
            if(n%i==0){
                return false ;
            }
       }
       return true ;
    }

    public static void primerange (int n ){
       for(int i = 2 ; i <= n ; i++){
         if (isprime(i)){
            System.out.print(i + " ") ;
        }
    }
    } 
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Number : ");
        int  num = sc.nextInt() ;
        primerange (num) ;
        
    }
}

// import java.util.*;

// public class Prime_Number_upto_n  {
//     public static void isprime(int n) {
//         for (int j = 2; j <= n; j++) {
//             boolean isp = true;
//             for (int i = 2; i <j; i++) {
//                 if (j % i == 0) {
//                     isp = false;
//                     break;
//                 }
//             }
//             if (isp) {
//                 System.out.println(j);
//             }
//         }
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Number : ");
//         int num = sc.nextInt();
//         isprime(num);
//     }
// }

