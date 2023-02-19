public class Friends_Pairing_Problem {
    public static int friends_pairing (int n){
        if (n == 1 || n == 0){
            return 1 ;
        }
        int i = friends_pairing(n-1);
        int j = friends_pairing(n-2);

        return i+j ;
    }
    public static void main (String args[]){
        int n = 4 ;
        System.out.println(friends_pairing(n));
    }
}