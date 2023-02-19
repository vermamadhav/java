public class LinkedList {
    public static class Node {
        int data ;
        Node next ;

        public Node (int data){
            this.data = data ;
            this.next = null ;
        }
    }

    public static Node Head ;
    public static Node Tail ;
    public static int size ;

    public void addFirst (int data){
        Node newNode = new Node (data);
        size++;
        if (Head == null){
            Head = Tail = newNode ;
            return ;
        }
        newNode.next = Head ; // Link
        Head = newNode ;
    }

    public void addLast (int data){
        Node newNode = new Node (data);
        size++;
        if (Head == null){
            Head = Tail = newNode ;
            return ; 
        }

        Tail.next = newNode ;
        Tail = newNode ;
    }
    
    public void addMiddle (int index , int data){
        if (index == 0){
            addFirst(data);
            return ; 
        }
        Node newNode = new Node (data) ;
        size++;
        
        Node temp = Head ;
        for (int i = 0 ; i < index -1 ; i++){
            temp = temp.next ;
        }
        newNode.next = temp.next ;
        temp.next = newNode ;
        

    }

    public int removeFirst (){
        if (size == 0){
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE ;
        }
        else if (size == 1){
            int value = Head.data ;
            Head = Tail = null ;
            size = 0 ;
            return value ;
        }
        int value = Head.data ;
        Head = Head.next ;
        size-- ;
        return value ;
    }

    public int removeLast (){
        if (size == 0){
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE ;
        }
        else if (size == 1){
            int value = Head.data ;
            Head = Tail = null ;
            size = 0 ;
            return value ;
        }
        Node previous = Head ;
        for (int i = 0  ; i < size -2 ; i++){
            previous = previous.next ;
        }
        int value = previous.next.data ; // OR Tail.data
        size--;
        previous.next = null ;
        Tail = previous ;
        return value ;
    }

    public void print (){
        Node temp = Head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next ;
        }
        System.out.println("null");
    }

    public int iterativeSearch (int key){       // O(n)
        int i = 0 ;
        Node temp = Head ;
        while (temp != null){
            if (temp.data == key){     // Key Found 
                return i ;
            }
            temp = temp.next ;
            i++;
        }
        return -1 ;
    }

    public int helperFunction (Node Head , int key){     // O(n) 
        if (Head == null){
            return -1 ;
        }
        if (Head.data == key){
            return 0 ;
        }
        int index = helperFunction (Head.next , key) ;
        if (index == -1){
            return -1 ;
        }
        return index + 1 ;
    }

    public int recursiveSearch (int key){
        return helperFunction (Head , key);
    }

    public void reverseLinkedList () {
        Node previous = null ;
        Node current = Tail = Head ;
        Node next ;
        

        while (current != null){
            next = current.next ;
            current.next = previous ;
            previous = current ;
            current = next ;
        }
        Head = previous ;
    }

    public void remove_Nth_Node_From_Last (int n){
        if (size == n){
            Head = Head.next ;
            return ;
        }
        int a = size -n ;
        Node temp = Head ;
        for (int i = 1 ; i < a  ; i++){
            temp = temp.next ;
        }
        temp.next = temp.next.next ;
    }

    public static void main (String args[]){
        LinkedList LL = new LinkedList ();
        LL.addFirst(2);
        LL.addLast(4);
        LL.addLast(5);
        LL.addFirst(1);
        LL.addMiddle(2 , 3);
        // LL.removeFirst();
        // LL.removeLast();
        LL.print();
        // System.out.println(LL.size);
        System.out.println(LL.iterativeSearch(3));
        System.out.println(LL.iterativeSearch(7));
        System.out.println(LL.recursiveSearch(3));
        System.out.println(LL.recursiveSearch(7));
        // LL.reverseLinkedList();
        LL.remove_Nth_Node_From_Last(5);
        LL.print();

    }
}