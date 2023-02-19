public class Single_Level_Inheritance {
    public static void main (String args[]){
        Fish shark = new Fish();
        shark.color = "Blue";
        shark.eat = "Small Fishes";
        System.out.println(shark.color);
        System.out.println(shark.eat);
        shark.breathe();
        shark.swim();

    }
}

class Animals {                      // Base class
    String color ;
    String eat ;

    void breathe(){
        System.out.println("It Breathe 24*7 .");
    }
}

class Fish extends Animals {        // Derived class
    int fins ;

    void swim (){
        System.out.println("Fishes always Swim .");
    }
}