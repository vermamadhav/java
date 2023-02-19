import java.util.*;
public class Reverse_a_Given_Number {
    public static void reverse (int n ){
        int reverse = 0 ;
        while(n > 0){
            int lastdigit = n % 10 ;
            reverse = (reverse * 10) + lastdigit ;
            n /= 10 ;
        }
        System.out.println(reverse);
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Your Number : ");
        int num = sc.nextInt();
        reverse(num);
    }
}
