public class Print_Spiral_Matrix {
    public static void spiral (int matrix [][] ){
        int startrow = 0 ;
        int endrow = matrix.length - 1;
        int startcolumn = 0 ;
        int endcolumn = matrix[0].length - 1 ;

        while(startrow <= endrow && startcolumn <= endcolumn){
            for(int j = startcolumn ; j <= endcolumn ; j++){
                System.out.print(matrix[startrow][j] + " ");
            }

            for(int i = startrow + 1 ; i <= endrow ; i++){
                System.out.print(matrix[i][endcolumn] + " ");
            }

            for(int j = endcolumn - 1 ; j >= startcolumn ; j--){
                // if (startcolumn == endcolumn){
                //     break;
                // }
                System.out.print(matrix[endrow][j] + " ") ;
            }

            for(int i = endrow - 1 ; i >= startrow + 1 ; i--){
                // if (startrow == endrow){
                //     break;
                // }
                System.out.print(matrix[i][startcolumn] + " ");
            }

            startrow++;
            endrow--;
            startcolumn++;
            endcolumn--;

        }
    }

    public static void main (String args[] ){
    int matrix [][] = {{1 ,2 ,3 ,4 ,5 },
                       {6 ,7 ,8 ,9 ,31},
                       {15,14,13,12,32},
                       {19,20,21,22,33},
                       {51,52,53,54,55}};
                 
        spiral(matrix);    
                       
    }
}