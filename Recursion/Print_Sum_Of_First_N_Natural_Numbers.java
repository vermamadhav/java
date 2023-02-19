public class Print_Sum_Of_First_N_Natural_Numbers {
    public static int sum (int n){
        if (n==1){
            return 1 ;
        }
        return (n + sum(n-1)) ;
    }
    public static void main (String args[]){
        int n = 10 ; 
        System.out.print(sum(n));
    }
}