public class Diagonal_Sum {
    public static void Diagonalsum (int matrix [][] ){
        int sum = 0 ;

        // for(int i = 0 ; i < matrix.length ; i++ ){
        //     sum += matrix[i][i] ;
        //     sum += matrix[i][matrix[0].length - 1 - i] ;
        // }

        // if (matrix.length % 2 == 0){
        //     System.out.println(sum);
        // }
        // else{
        //     int a = matrix.length / 2 ;
        //     System.out.println(sum - matrix[a][a]);
        // }

        // or

        for(int i = 0 ; i < matrix.length ; i++ ){               
            sum += matrix[i][i] ;           // Primary Diagonal    i == j 
            if (i != matrix[0].length - 1 - i){         
               sum += matrix[i][matrix[0].length - 1 - i] ; // Secondary Diagonal , all i + j = matrix.length - 1  then j = matrix.length - 1 - i 
            }   
        }

        System.out.println(sum);
    }    
    public static void main (String args[] ){
       int matrix [][] =  {{1 ,2 ,3 ,4 ,5 },
                           {6 ,7 ,8 ,9 ,31},
                           {15,14,13,12,32},
                           {19,20,21,22,33},
                           {50,52,53,54,55}};
        // int matrix [][] = {{1 ,2 ,3 ,4 },
        //                    {6 ,7 ,8 ,9 },
        //                    {15,14,13,12},
        //                    {19,20,21,22},};

        Diagonalsum(matrix); 
    }
}
