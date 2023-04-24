import java.util.*;
public class a {
    public static void stockspan(int stocks[] , int span[]){
        Stack <Integer> s = new Stack<>();
        s.push(0);
        span[0] =1 ;
        for (int i = 1 ;i < stocks.length ; i++){
            while (!s.isEmpty() && stocks[i] >= stocks[s.peek()]){
                s.pop();
            }
            if (s.isEmpty()){
                span[i] = i + 1;
            }
            else{
                span[i] = i - s.peek() ;
            }
            s.push(i);
        }
        
    }
    public static void main (String args[]){
        int stockPrice [] = {100,80,60,70,60,85,100};
        int span[] = new int [stockPrice.length];
        stockspan(stockPrice , span);
        for(int i = 0 ; i < span.length ;i++){
            System.out.println(span[i]);
        }
    }
}