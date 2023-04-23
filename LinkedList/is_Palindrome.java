public class is_Palindrome {
    public static class Node {
        int data ;
        Node next ;

        public Node (int data){
            this.data = data ;
            this.next = null ;
        }
    }
    public static Node head ;          //  left  side head
    public static Node Head ;          //  right side head

    public Node findMid () {
        Node slow = head ;
        Node fast = head ;

        while (fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        return slow ;
    }

    public void reverse (Node mid){
        Node prev = null ;
        Node current = mid ;
        Node Next ;

        while (current != null){
            Next = current.next ;
            current.next = prev ;
            prev = current ;
            current = Next ;
        }
        Head = prev ;
    }

    public boolean checkpalindrome (){
        if  (head == null || head.next == null ){
            return true ;
        }
        
        reverse(findMid()) ;      // reverse 2nd half
        
        Node temp = head ;        // check palindrome
        Node temp1 = Head ;
        while (temp1 != null){
            if (temp.data != temp1.data){
                return false ;
            }
            temp = temp.next ;
            temp1 = temp1.next ;
        }
        return true ;
    }

    public static void main (String args[]){
        is_Palindrome LL = new is_Palindrome () ;
        LL.head = new Node(1);
        LL.head.next = new Node(2);
        LL.head.next.next = new Node(2);
        LL.head.next.next.next = new Node(1);
        System.out.println(LL.checkpalindrome());
        //LL.main(args);

    }
}