import java.util.ArrayList;
public class Reverse_of_an_ArrayList {
    public static void main (String args[]){
        ArrayList <Integer> list = new ArrayList<> ();
 
        list.add(1);
        list.add(3);
        list.add(8);
        list.add(7);
        list.add(10);
        System.out.println(list);

        for (int i = list.size() -1 ; i >= 0 ; i--){
            System.out.print(list.get(i) + " ");
        }
    }    
}
