public class Classes_and_Objects {
    public static void main (String args[]){
        Pen p1 = new Pen();                    // This Line is used to Create Object of Pen Class who's Name is p1
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.color = "pink" ;
        System.out.println(p1.color);

        Pen p2 = new Pen();                    // This Line is used to Create another Object of Pen Class who's Name is p2
        p2.setColor("yellow");
        System.out.println(p2.color);

        p1.setTip(5);
        System.out.println(p1.tip);
        System.out.println(p2.tip);
    }
}

class Pen {                                   // Class
    String color ;
    int tip ;

    void setColor (String newcolor){
        color = newcolor ;
    }

    void setTip (int newtip){
        tip = newtip ;
    }
}
