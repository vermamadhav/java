public class Print_Decreasing_Number {
    public static void printDec (int n){
        if (n==1){                          // Base case 
            System.out.print(1);
            return ;
        }
        System.out.print(n + " ");          // Kaam
        printDec(n-1);                      // inner function call 
        
    }
    public static void main (String args[]){
        int n = 10 ; 
        printDec(n);
    }
}