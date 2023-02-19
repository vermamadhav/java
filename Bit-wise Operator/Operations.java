public class Operations {
    public static void Get_ith_bit (int n , int i ){
        int Bitmask = 1 << i ;
        if ( (n & Bitmask) == 0 ){
            System.out.println("ith Bit is 0");
        }
        else {
            System.out.println("ith Bit is 1");
        }
    }
    
    public static int Set_ith_bit (int n , int i ){
        int Bitmask = 1 << i ;
        return ( n | Bitmask );
    }

    public static int  Clear_ith_bit (int n , int i ){
        int Bitmask = ~(1 << i) ;
        return ( n & Bitmask );
    }

    public static void Update_ith_bit (int n , int i , int newbit){
        if (newbit == 0){
            n = Clear_ith_bit (n,i);
        }
        else {
            n = Set_ith_bit (n,i);
        }

        // OR

        // n = Clear_ith_bit (n,i);
        // n = n | (newbit << i) ;
        
        System.out.println(n);
    }

    public static int Clear_Last_i_bits (int n , int i){
        int Bitmask = ~0 << i;
        return ( n & Bitmask );
    }

    public static int Clear_Range_of_Bits (int n , int i , int j){
        int a = ((~0) << (j+1)) ;
        int b = (1 << i) -1 ;
        int Bitmask = a | b ;
        return (n & Bitmask) ;
    }
    public static void main (String args[] ){
    // Get_ith_bit (11 , 3);
    // System.out.println ( Set_ith_bit (10 , 2) );
    // System.out.println ( Clear_ith_bit (10 , 3) );
    // Update_ith_bit (10 , 2 , 1);
    // System.out.println (Clear_Last_i_bits (15 , 2 ));
    System.out.println (Clear_Range_of_Bits (10 , 0 , 4 ));
    }
}
