public class Inverted_AND_Rotated_Half_Pyramid {
    public static void InvertedANDRotatedHalfPyramid (int row , int col){
        for (int i = 1 ; i <= row ; i++){
            for (int j = 1 ; j <= col ; j++){
                if( j <= row-i ){
                    System.out.print("  ") ;
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void main (String args[]){
        InvertedANDRotatedHalfPyramid(4,4) ;
    }
}

//         * 
//       * *
//     * * *
//   * * * *