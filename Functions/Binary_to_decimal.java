import java.util.*;
public class Binary_to_decimal {
    public static void BinarytoDecimal(int n ){
        int pow = 0 ;
        int Decimalnum = 0 ;
        while (n>0){
            int lastdigit = n%10 ;
            Decimalnum += lastdigit * (int) Math.pow(2,pow) ;
            pow++ ;
            n = n/10 ;
        }
        System.out.println("In Decimal Number : " + Decimalnum) ; 
    }

    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Your Binary Number : ") ;
        int  binarynum = sc.nextInt();
        BinarytoDecimal(binarynum) ;
        
        

    }
}
