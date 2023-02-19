import java.util.*;
public class AreaOfCircle {
    public static void area (float r){
        double area = 3.14 * r * r ;
        System.out.println(area) ;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in) ;
        float r = sc.nextFloat();
        area(r);
    }
}    