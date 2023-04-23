import java.util.Stack;

public class Implementing_Stack_using_Java_Collection_Framework {
    public static void main (String args[]){
        Stack <Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

        // System.out.println(s);
    }
}
