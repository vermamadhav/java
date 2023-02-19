import java.util.*;
public class Prime_number {
    public static boolean isprime(int n ){
        for(int i = 2 ; i<=Math.sqrt(n) ; i++){
            if(n%i==0){
                return false ;
            }
       }
       return true ;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Number : ");
        int  num = sc.nextInt() ;
        System.out.println(isprime(num)) ;
    }
}


// import java.util.*;
// public class Prime_number {
//     public static void main (String args[]){
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter Number : ");
//         int  num = sc.nextInt() ;
//         boolean isPrime = true ;
//         for(int i = 2 ; i<num ; i++){
//             if(num%i==0){
//                 isPrime = false ;
//                 System.out.println("It is not a prime number .");
//                 break;
//             }
//         }
//         if (isPrime){
//             System.out.print("It is a prime number .");
//         }
//     }
// }