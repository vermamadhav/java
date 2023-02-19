public class Access_Modifiers {
    public static void main (String args[]){
        BankAccount myacc = new BankAccount();
        myacc.username = "madhav" ;
        System.out.println(myacc.username);
        
        // myacc.password = "dddddd" ;         // This will give error because password is private 

        myacc.setPass("dddddd") ;

       // System.out.println(myacc.password);  //This will also give error because password is private 

    }
    
}

class BankAccount {
    public String username ;
    private String password ;

    public void setPass (String pwd){
        password = pwd ;
    }
}