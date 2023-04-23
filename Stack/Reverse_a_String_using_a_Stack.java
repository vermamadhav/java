import java.util.Stack;
public class Reverse_a_String_using_a_Stack {
    public static String reverseString (String str){
        Stack <Character> s = new Stack <> ();

        int i = 0 ;
        while (!(str.length() == i)){
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder newstr = new StringBuilder("");
        while(!s.isEmpty()){
            newstr.append(s.pop());
        }
        str = newstr.toString();
        return str ;
    }
    public static void main (String args[]){
        String str = "Madhav Verma" ;
        String newstr = reverseString(str);
        System.out.println(newstr);
    }
}
