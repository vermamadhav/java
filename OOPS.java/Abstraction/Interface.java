public class Interface {
    public static void main (String args[]){
        Queen q = new Queen();
        q.moves();
    }
}

interface Chessplayer {                       // It is the case of Total abstractions
    void moves();
}
class Queen implements Chessplayer {
    public void moves (){
        System.out.println("Queen Move .");
    }
}
class Rook implements Chessplayer {
    public void moves (){
        System.out.println("Rook Move .");
    }
}
class King implements Chessplayer {
    public void moves (){
        System.out.println("King Move .");
    }
}