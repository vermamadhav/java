public class Multi_Level_Inheritance {
    public static void main (String args[]){
        Human yuvi = new Human();
        yuvi.color = "Skin Color";
        System.out.println(yuvi.color);

        yuvi.breathe();

        yuvi.legs = 2 ;
        System.out.println(yuvi.legs);

        yuvi.walk();
        yuvi.talk();

    }
}

class Animals {                                // Base class
    String color ;
    String eat ;

    void breathe(){
        System.out.println("It Breathe 24*7 .");
    }
}
class Mammals extends Animals {               // Derived class
    int legs ;

    void walk (){
        System.out.println("They can Walk .");
    }
}

class Human extends Mammals {                // Derived class
    void talk() {
        System.out.println("They can Talk .");
    }
}