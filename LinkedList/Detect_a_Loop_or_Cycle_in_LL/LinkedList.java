public class LinkedList {
    public static class Node {
        int data ;
        Node next ;

        public Node (int data){
            this.data = data ;
            this.next = null ;
        }
    }

    public static Node head ;

    public static boolean checkCycle (){
        Node slow = head ;
        Node fast = head ;

        while (fast != null && fast.next != null){
            slow = slow.next ;           // +1
            fast = fast.next.next ;      // +2
            if (fast == slow){
                return true ;        // cycle exist 
            }
        }
        return false ;               // cycle doesn't exist
    }

    public static void removeCycle (){      
        // detect cycle 
        Node slow = head ;
        Node fast = head ;
        boolean iscycle = false ;
        while (fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
            if (slow == fast){
                iscycle = true ;
                break ;
            }
        }
        if (iscycle == false){
            return ;
        }

        // find meeting point
        slow = head ;
        Node prev = null ;    // lastnode
        while (slow != fast){
            prev = fast ;
            slow = slow.next ;
            fast = fast.next ;
        }

        // remove cycle --> lastnode.next = null
        prev.next = null ;
    }
    public static void main (String args[]){
        LinkedList LL = new LinkedList () ;
        LL.head = new Node(1);
        LL.head.next = new Node(2);
        LL.head.next.next = new Node(3);
        LL.head.next.next.next = new Node(4);
        LL.head.next.next.next.next = LL.head.next.next ;
        System.out.println(checkCycle());
        removeCycle();
        System.out.println(checkCycle());
    }    
}