﻿Its Madhav Verma

// pair sum 1
import java.util.ArrayList;
class HelloWorld {
    public static boolean F (ArrayList <Integer> list , int target){
        int i = 0 ;
        int j = list.size() - 1 ;
        while (i < j){
            int current = list.get(i) + list.get(j);
            if (current == target){
                return true ;
            }
            else if (current < target){
                i++ ;
            }
            else {
                j-- ;
            }
        }
        return false ;
    }
    
    public static void main(String[] args) {
        ArrayList <Integer> height = new ArrayList <>() ;
        height.add(1);
        height.add(2);
        height.add(3);
        height.add(4);
        height.add(5);
        height.add(6);
        height.add(7);
        height.add(8);
        height.add(9);

        System.out.println(F(height , 15 ));
    }
}


// container

import java.util.ArrayList;
class HelloWorld {
    public static int F (ArrayList <Integer> list){
        int i = 0 ;
        int j = list.size() - 1 ;
        int max = Integer.MIN_VALUE ;
        while (i < j){
            int curr = (Math.min(list.get(i),list.get(j)))* (j-i) ;
            max = Math.max(curr ,max);
            
            if (list.get(i) < list.get(j)){
                i++ ;
            }
            else if (list.get(i) == list.get(j)){ // we can write this step it is not necessary 
                i++ ;
                j-- ;
            }
            else {
                j-- ;
            }
        }
        return max ;
    }
    public static void main(String[] args) {
        ArrayList <Integer> height = new ArrayList <>() ;
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(F(height));
    }
}
