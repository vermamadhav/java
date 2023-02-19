public class Tilling_Problem {
    public static int tillingproblem (int n){
        if (n == 0 || n == 1){
            return 1 ;
        }
        int i = tillingproblem(n-1);
        int j = tillingproblem(n-2);

        int totalways = i + j;
        return totalways;
    }
    public static void main (String args[]){
        int n = 4; 
        System.out.println(tillingproblem(n));
    }
}