public class Shortest_Path {
    public static void shortestpath (String str ){
        int x = 0 , y = 0 ;
        for (int i = 0 ; i < str.length() ; i++){
            if (str.charAt(i) == 'E'){
                x += 1 ;
            }
            else if (str.charAt(i) == 'W'){
                x -= 1 ;
            }
            else if (str.charAt(i) == 'N'){
                y += 1 ;
            }
            else{
                y -= 1 ;
            }
        }

        float distance =(float) Math.sqrt(Math.pow(x,2) + Math.pow(y,2)) ;
        System.out.println(distance) ;
    }
    public static void main (String args[] ){
    String str = "racecarmy" ;
    shortestpath(str) ;
    }
}
