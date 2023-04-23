import java.util.Stack;
public class Push_at_the_Bottom_of_the_Stack {
    public static void pushAtBottem (Stack <Integer> s , int data){
        if(s.isEmpty()){
            s.push(data);
            return ;
        }
        int top = s.pop();
        pushAtBottem(s,data);
        s.push(top);
    }
    public static void main (String args[]){
        Stack <Integer> s = new Stack <> ();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottem(s , 4);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
