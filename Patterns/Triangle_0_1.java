public class Triangle_0_1 {

    // public static void triangle_01(int n) {
    //     for (int i = 1; i <= n; i++) {
    //         if (i % 2 == 1) {
    //             for (int j = 1; j <= i; j++) {
    //                 if (j % 2 == 1) {
    //                     System.out.print(1);
    //                 } else {
    //                     System.out.print(0);
    //                 }
    //             }
    //         }
    //         else {
    //             for (int j = 1; j <= i; j++) {
    //                 if (j % 2 == 1){
    //                     System.out.print(0);
    //                 }
    //                 else {
    //                     System.out.print(1);
    //                 }
    //             }
    //         }
    //         System.out.println();
    //     }
    // }



    public static void triangle_01(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ( (i+j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);

                }
            }
            System.out.println(); 
        }
    }            

    public static void main(String args[]) {
        triangle_01(5);

    }
}


//    1
//    01
//    101
//    0101
//    10101