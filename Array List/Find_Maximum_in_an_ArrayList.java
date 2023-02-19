import java.util.ArrayList;
public class Find_Maximum_in_an_ArrayList {
    public static void main (String args[]){
        ArrayList<Integer> list = new ArrayList <>();

        list.add(2);
        list.add(6);
        list.add(1);
        list.add(3);
        list.add(10);
        list.add(4);

        int max = Integer.MIN_VALUE ;
        for (int i = 0 ; i < list.size(); i++){
            if (max < list.get(i)){
                max = list.get(i);
            }
        }

        // OR
        // for (int i = 0 ; i < list.size(); i++){
        //     max = Math.max(max , list.get(i));
        // }
        
        System.out.println(max);
    }
}
