public class Running_of_Constructor {
    public static void main (String args[]){
        Hen c = new Hen();
    }
}

abstract class Animal {
    Animal(){
        System.out.println("Animal walks .");
    }
}

class Chicken extends Animal {
    Chicken (){
        System.out.println("Chicken walk on 2 legs .");
    }
}
class Hen extends Chicken {
    Hen (){
        System.out.println("Chicken walk on 2 legs .");
    }
}