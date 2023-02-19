public class Largest_String_Lexicographically {
    public static void largeststring (String fruits[]){
        String largest = fruits[0] ;
        for (int i = 1 ; i < fruits.length ; i++){
            if((largest.compareTo(fruits[i]) < 0)){    // Lexicographically Compare 
                largest = fruits[i];
            }
        }
        System.out.println(largest); 
    }

    public static void main (String args[]){
        String fruits[] = {"apple" , "mango" , "orange" , "banana"} ;
        largeststring(fruits);
    }
}
