public class Multiple_Inheritance {
    public static void main (String args[]){

        Human yuvi = new Human();
        yuvi.brain();
        yuvi.skill();
    }
}

interface Brain {
    void brain();
}

interface Skill {
    void skill();
}

class Human implements Brain , Skill {
    public void brain (){
        System.out.println("Human have Brain .");
    }
    public void skill (){
        System.out.println("Human have Skills .");
    }
}