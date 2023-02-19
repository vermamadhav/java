public class Hollow_Rhombus {
    public static void HollowRhombus (int n){
        for(int i = 1; i <= n ;i++){
            for(int j = 1; j <= n-i ; j++){                        //  Spaces
                System.out.print("  ");
            }

            for(int j = 1; j <= n ; j++){                         //   Hollow Rhombus
               if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
               }
               else{
                    System.out.print("  ");
               }
            }
            System.out.println();
        }
    }

    public static void main (String args[]){
        HollowRhombus (5) ;
    }
}


        //            * * * * * 
        //          *       *   
        //        *       *     
        //      *       *       
        //    * * * * * 