import java.util.LinkedList ;
public class LL_Using_JCF {
    public static void main (String args[]){
        LinkedList <Integer> LL = new LinkedList <>();   // create LL

        LL.addFirst(2);      // add
        LL.addFirst(1);
        LL.addLast(3);

        System.out.println(LL);

        LL.removeFirst();       // remove
        LL.removeLast();

        System.out.println(LL);
    }
}