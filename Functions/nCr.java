public class nCr {
    public static int Factorial(int n) {
        if (n == 0) {
          return 1 ;
        }
        int facto = 0 ;
        if (n > 0) {
            facto = n * Factorial(n - 1);
        }  
            return facto;
    }

    public static void main(String args[]) {
        int n = 7;
        int r = 3 ;
        int f = Factorial(n)/(Factorial(r)*Factorial(n-r));
        System.out.println(f);

    }

}