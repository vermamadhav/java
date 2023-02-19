public class Is_Palindrome {
    public static Boolean palindrome (String str ){
        for (int i = 0 ; i < (str.length())/2 ; i++){
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
                System.out.print("It is not Palindrome .");
                return false ;
            }
        }
        System.out.print("It is Palindrome") ;
        return true ;
    }
    public static void main (String args[] ){
    String str = "racecar" ;
    palindrome(str);
    }
}