public class Factorial_OF_A_Number {
    public static int factorial (int n){
        if (n==0){
            return 1 ;
        }
        return n*factorial(n-1) ;
    }
    public static void main (String args[]){
        int n = 5 ; 
        System.out.print(factorial(n));
    }
}