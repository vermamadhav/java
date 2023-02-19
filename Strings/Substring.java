public class Substring {
    // public static String substring (String str , int SI , int EI){   // SI - Starting Index , EI - Ending Index 
    //     String substr = "" ;
    //     for(int i = SI ; i < EI ; i++){
    //         substr += str.charAt(i);
    //     }
    //     return substr ;
    // }

    public static void main (String args[]){
        String str = "Madhav verma" ;
        // System.out.print(substring(str , 0 , 5)) ;

        System.out.print(str.substring( 0 , 5)) ;     // java Substring Function
    }
}

// OR

// public class Substring {
//     public static void substring (String str , int SI , int EI){  
//         for(int i = SI ; i < EI ; i++){
//             System.out.print(str.charAt(i));
//         }
//     }

//     public static void main (String args[]){
//         String str = "Madhav verma" ;
//         substring(str , 0 , 8) ;
//     }
// }