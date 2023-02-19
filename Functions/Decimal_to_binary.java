import java.util.*;

public class Decimal_to_binary {
    public static void DecimaltoBinary (int n ){
        int pow = 0 ;
        int Binarynum = 0 ;
        
        while(n>0){
            int reminder = n%2 ;
            Binarynum += reminder * (int) Math.pow(10,pow);
            pow++ ;
            n /= 2 ;
        }
        System.out.println("Your Binry Number : " + Binarynum);
    }

    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Your Decimal Number : ") ;
        int n = sc.nextInt() ;
        DecimaltoBinary(n);

    }

}
