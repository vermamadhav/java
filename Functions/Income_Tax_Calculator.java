import java.util.*;
public class Income_Tax_Calculator {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Your Income : ");
        float income = sc.nextFloat() ;
        float tax ;
        if (income < 5){
            tax = 0 ;
        }
        else if (income >= 5 && income < 10 ){
            tax = income * 0.2f ;
        }
        else {
            tax = income * 0.3f ;
        }

        System.out.println("Tax is :" + tax + "\nTotal is :" + (income + tax) ) ;
    }
    
}
