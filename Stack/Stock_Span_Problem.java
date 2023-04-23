import java.util.Stack;
public class Stock_Span_Problem {
    public static void findingSpan (int stockprice[] , int span[]){
        Stack <Integer> s = new Stack<>();
        span[0] = 1 ;
        s.push(0);

        for(int i = 1 ; i < stockprice.length ;i++){
            int currentprice = stockprice[i];
            while(!s.isEmpty() && currentprice >= stockprice[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1 ;
            }
            else{
                int prevhigh = s.peek();
                span[i] = i - prevhigh;
            }
            s.push(i);
        }
    }
    public static void main (String args[]){
        int stockPrice [] = {100,80,60,70,60,85,100};
        int span[] = new int [stockPrice.length];
        findingSpan(stockPrice , span);
        for(int i = 0 ; i < span.length ;i++){
            System.out.println(span[i]);
        }


    }
}
