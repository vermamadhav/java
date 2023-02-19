import java.util.ArrayList;
public class Array_List {
    public static void main (String args[]){
        ArrayList <Integer> list = new ArrayList<> ();

        // For adding elements 
        list.add(1);
        list.add(3);
        list.add(8);
        list.add(7);
        System.out.println(list);

        // For adding elements at an index
        list.add(2,13);
        System.out.println(list);

        // For getting elements 
        int a = list.get(0);
        System.out.println(a);
        System.out.println(list.get(2));

        // For removing elements 
        list.remove(1);
        System.out.println(list);

        // Set elements
        list.set(2 , 19);
        System.out.println(list);

        // Contains elements 
        System.out.println(list.contains(13));
        System.out.println(list.contains(10));
        
        // Size of ArrayList 
        System.out.println("Length of ArrayList : " + list.size());

        // Print ArrayList 
        for (int i = 0 ; i < list.size() ; i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
 