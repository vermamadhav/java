public class Check_Odd_or_Even {
    public static void OddorEven (int n ){
        int Bitmask = 1 ;
        if ((n & Bitmask) == 0){
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }
    public static void main (String args[] ){
    OddorEven(12); 
    OddorEven(15); 
    OddorEven(29); 
    }
}
