// public class Grid_Ways {
//     public static int gridways (int grid [][] , int i , int j){
//         if (i == grid.length || j == grid.length ){
//             return 0 ;
//         }
//         else if (i == grid.length -1 && j == grid.length -1 ){
//             return 1 ;
//         }
//         int w1 = gridways (grid , i +1 , j) ;
//         int w2 = gridways (grid , i , j +1) ;

//         return w1 + w2 ;
//     }
//     public static void main (String args[] ){
//         int n= 4 , m = 4 ;
//         int grid [][] = new int [n][m];
//         int ans = gridways(grid , 0 , 0);
//         System.out.println(ans);
//     }
// }


// using permutation concept
public class Grid_Ways {
    public static int permutation (int n){
        if (n == 0 || n == 1 ){
            return 1 ;
        }
        return n*permutation(n-1) ;
    }
    public static void main (String args[] ){
        int n = 4 , m = 4 ;
        int ans = permutation(n-1 + m-1)/(permutation(n-1)*permutation(m-1));
        System.out.println(ans);
    }
}