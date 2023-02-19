// import java.util.*;

public class Print_All_Letters_in_Strings {
    public static void PrintLettersInString (String str ){
        for(int i = 0 ; i < str.length() ; i++){
            System.out.print(str.charAt(i) + " ") ; 
        }
    }

    public static void main (String args[]){
        // Scanner sc = new Scanner (System.in) ;
        // String str = sc.nextLine() ;
        String str = "Madhav Verma" ;

        PrintLettersInString (str) ;

    //     String first = "Madhav" ;
    //     String last = "Verma" ;
    //     String fullname = first + " " + last ;          // concatenation 
    //     System.out.println(fullname) ;
    }
}