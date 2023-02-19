public class Super_Keyword {
    public static void main (String args[]){
        Fish f = new Fish();
        System.out.println(f.color);
    }
}

class Animals {                     
    String color ;

    Animals(){
        System.out.println("Animal Constructor is call .");
    }
}

class Fish extends Animals {
    Fish (){
        super.color = "Blue";
        System.out.println("Fish Constructor is call .");
    }
}