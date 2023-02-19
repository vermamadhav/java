public class Abstraction {
    public static void main (String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        h.changecolor();
        System.out.println(h.color);
        
        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);
        c.changecolor();
        System.out.println(c.color);

        // Animal a = new Animal();   // if we make object of Animal then it will give error .
    }
}

abstract class Animal {
    String color ;
    Animal(){
        color = "brown";
    }
    void eat (){
        System.out.println("They Eat .");
    }
    abstract void walk ();
}

class Horse extends Animal {
    void changecolor (){
        color = "white";
    }
    void walk (){
        System.out.println("Horses walk on 4 legs .");
    }
}

class Chicken extends Animal {
    void changecolor (){
        color = "yellow";
    }
    void walk (){
        System.out.println("Chicken walk on 2 legs .");
    }
}