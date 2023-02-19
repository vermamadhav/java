public class Hierarchial_Inheritance {
    public static void main (String args[]){
        Mammals yuvi = new Mammals();
        yuvi.color = "Skin Color";
        System.out.println(yuvi.color);
        yuvi.breathe();
        yuvi.walk();

        Birds parrot = new Birds();
        parrot.color = "Green";
        System.out.println(parrot.color);
        parrot.breathe();
        parrot.fly();

        Fish shark = new Fish();
        shark.color = "blue";
        System.out.println(shark.color);
        shark.swim();
    }
}

class Animals {                               // Base class
    String color ;

    void breathe(){
        System.out.println("It Breathe 24*7 .");
    }
}

class Mammals extends Animals {               // Derived class
    void walk (){
        System.out.println("They can Walk .");
    }
}

class Birds extends Animals {                 // Derived class
    void fly (){
        System.out.println("They can fly .");
    }
}

class Fish extends Animals {                   // Derived class
    void swim (){
        System.out.println("Fishes always Swim .");
    }
}