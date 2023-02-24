public class is_Palindrome {
    public static class Node {
        int data ;
        Node next ;

        public Node (int data){
            this.data = data ;
            this.next = null ;
        }
    }
    public static Node head ;
    public static void main (String args[]){
        is_Palindrome LL = new is_Palindrome () ;
        LL.head = new Node(1);
    }
}