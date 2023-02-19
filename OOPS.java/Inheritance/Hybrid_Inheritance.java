public class Hybrid_Inheritance {
    public static void main(String args[]){
        Human yuvi = new Human();
        yuvi.eat = "Yuvi like to eat protein rich foods .";
        System.out.println(yuvi.eat);
        yuvi.breathe();
        yuvi.walk();
        yuvi.talk();
        Lion lion = new Lion();
        lion.eat = "Lions like to eat meat .";
        System.out.println(lion.eat);
        lion.breathe();
        lion.walk();
        lion.legs();
        System.out.println();

        Parrot parrot = new Parrot();
        parrot.eat = "Parrot like to eat Green Chillies .";
        System.out.println(parrot.eat);
        parrot.breathe();
        parrot.fly();
        parrot.color();
        Pigeon pigeon = new Pigeon();
        pigeon.eat = "Pigeon like to eat Wheat .";
        System.out.println(pigeon.eat);
        pigeon.breathe();
        pigeon.fly();
        pigeon.color();
        System.out.println();
    
        Shark shark = new Shark();
        shark.eat = "Shark like to eat Small fishes .";
        System.out.println(shark.eat);
        shark.breathe();
        shark.swim();
        shark.color();
        ClownFish clown = new ClownFish();
        clown.eat = "ClownFish like to eat Algae .";
        System.out.println(clown.eat);
        clown.breathe();
        clown.swim();
        clown.color();
        System.out.println();
   }

}

class Animals {                               // Base class
    String eat ;

    void breathe(){
        System.out.println("It Breathe 24*7 .");
    }
}

class Mammals extends Animals { 
    void walk (){
        System.out.println("They can Walk .");
    }
}
class Human extends Mammals {  
    void talk() {
        System.out.println("They can Talk .");
    }
}
class Lion extends Mammals {  
    void legs() {
        System.out.println("Lions have four legs .");
    }
}

class Birds extends Animals {
    void fly (){
        System.out.println("They can fly .");
    }
}
class Parrot extends Birds {
    void color() {
        System.out.println("Parrot is of Green color .");
    }
}
class Pigeon extends Birds {
    void color() {
        System.out.println("Pigeon is of Bluish Gray color .");
    }
}

class Fish extends Animals {
    void swim (){
        System.out.println("Fishes always Swim .");
    }
}
class Shark extends Fish {
    void color (){
        System.out.println("Shark is of Blue color .");
    }
}
class ClownFish extends Fish {
    void color (){
        System.out.println("Clown Fish is of Orange color .");
    }
}
