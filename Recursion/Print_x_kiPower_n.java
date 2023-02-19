public class Print_x_kiPower_n {

    //optimised solution 
    public static int power (int x , int n ){
        if(n==0){
            return 1 ;
        }
        int halfpower = power(x , n/2);
        int halfpowersq = halfpower * halfpower ;
        if(n%2 == 1){
            halfpowersq *= x ;
        }
        return halfpowersq ;
    }

    // Normal solution
    // public static int power (int x , int n ){
    //     if(n==0){
    //         return 1 ;
    //     }
    //     return x * power(x , n-1);
    // }
    public static void main (String args[]){
        int x = 2 ;
        int n = 10 ;
        System.out.println(power(x,n));
    }
}