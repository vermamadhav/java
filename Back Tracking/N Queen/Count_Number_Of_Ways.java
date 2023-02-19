public class Count_Number_Of_Ways {
    public static boolean issafe (char board [][] , int row , int col){
        // Vertical up 
        for (int i = row -1 ; i >= 0 ; i--){
            if (board[i][col] == 'Q'){
                return false ;
            }
        }
        // Diagonal left up 
        for (int i = row -1 , j = col -1 ; i >= 0 && j >= 0 ; i-- , j--){
            if (board[i][j] == 'Q'){
                return false ;
            }
        }
        // Diagonal right up 
        for (int i = row -1 , j = col +1; i >= 0 && j < board.length ; i-- , j++){
            if (board[i][j] == 'Q'){
                return false ;
            }
        }
        return true ;
    }
    public static void nqueen (char board [][] , int i ){
        if (i == board.length ){
            count++;
            return ;
        }
        for (int j = 0 ; j < board.length ; j++){
            if (issafe(board, i , j)){
                board [i][j] = 'Q';
                nqueen(board,i+1);      // function call
                board [i][j] = 'x';     // backtracking step 
            }
        }
    }
    static int count = 0 ;
    public static void main (String args[] ){
    int n = 4 ;
    char board [][] = new char [n][n];

    for (int i = 0 ; i < n ; i++){
        for (int j = 0 ; j < n ; j++){
            board [i][j] = 'x';
        }
    }
    nqueen(board,0);
    System.out.println("total no. of ways : " + count);
    }
}
