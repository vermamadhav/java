public class Fibonacci_Series {
    public static int fibonacci (int n ){
        if (n == 0 || n == 1){
            return n ;
        }
        return (fibonacci(n-1) + fibonacci(n-2)) ;
    }
    public static void main (String args[]){
        int n = 8 ;
        System.out.println(fibonacci(n));
    }
}