import java.util.Arrays;
import java.util.*;
public class a {
    public static boolean issafe (char c [][] , int r , int co){
        for (int i = r -1 ; i >=0 ; i--){
            if (c[i][co] == 'Q'){
                return false ;
            }
        }
        for (int i = r -1 , j = co -1; i >=0 && j >=0; i-- , j--){
            if (c[i][j] == 'Q'){
                return false ;
            }
        }
        for (int i = r -1 , j = co +1; i >=0 && j < c.length ; i-- , j++){
            if (c[i][j] == 'Q'){
                return false ;
            }
        }
        return true ;
    }

    public static void nqueen (char c [][] , int r){
        if (r == c.length ){
            
            System.out.println();
            for (int i = 0 ; i < 5 ; i++){
                for (int j = 0 ; j <5 ; j++){   
                System.out.print(c [i][j] + " ");;
                }
                System.out.println();
            } 
            return ;
        }
        for (int i = 0 ; i < c.length ; i++){
            if (issafe (c , r , i)){
                c[r][i] = 'Q';
                nqueen (c , r+1);
                c[r][i] = 'x';
            }
        }
    }
    public static void main (String args[]){
        char c[][] = new char [5][5];
        for (int i = 0 ; i < 5 ; i++){
            for (int j = 0 ; j <5 ; j++){
                c [i][j] = 'x';
            }
        }
        nqueen (c , 0);
    }
}