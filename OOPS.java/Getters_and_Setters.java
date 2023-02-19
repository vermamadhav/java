public class Getters_and_Setters {
    public static void main (String args[]){
        BankAccount myacc = new BankAccount();
        myacc.setPass("dddddd") ;
        System.out.println(myacc.getPass());

    }
    
}

class BankAccount {
    private String password ;

    String getPass(){                             // Getters
        return this.password ;
    }

    void setPass (String pwd){                   // Setters
        this.password = pwd ;
    }
}