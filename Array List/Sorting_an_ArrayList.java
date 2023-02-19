import java.util.ArrayList;
import java.util.Collections;
public class Sorting_an_ArrayList {
    public static void main (String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(1);
        list.add(3);
        list.add(10);
        list.add(4);
        System.out.println(list);

        // for ascending order 
        Collections.sort(list);
        System.out.println(list);

        // for descending order 
        Collections.sort(list , Collections.reverseOrder());
        System.out.println(list);
    }
}
