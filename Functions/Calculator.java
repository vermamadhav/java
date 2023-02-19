import java.util.*;
public class Calculator {
    public static void calculator (int num1 , int num2 , int Operator){
        switch(Operator){
            case '+' : System.out.println(num1 + num2);
                       break;
            case '-' : System.out.println(num1 - num2);
                       break;
            case '*' : System.out.println(num1 * num2);         
                       break;
            case '/' : System.out.println(num1 / num2);
                       break;
            case '%' : System.out.println(num1 % num2);
                       break;
            default  : System.out.println("Invalid Operator !! ");        
        }
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Number 1 : ") ;
        int num1 = sc.nextInt() ;
        System.out.print("Enter Number 2 : ") ;
        int num2 = sc.nextInt() ;
        System.out.print("Enter Operator : ") ;
        char Operator = sc.next().charAt(0) ;
        calculator(num1 , num2 , Operator) ;
    }
}