//abstract because we don't want to create classes from Account
public abstract class Account implements IBaseRate {
    //list common props for savings and checking account
    private String name;
    private String accountNumber;
    private String sSN;
    private double balance;
    double rate;

    //constructor to set base properties and init the account
    public Account(String name) {
        System.out.println("Name: " + name);
        System.out.print("New Account: ");
    }

    //list common methods: deposit(), withdraw(), transfer(), showInfo()
    public void deposit(){

    }

    public void withdraw(){

    }

    public void transfer() {

    }

    public String showInfo(){
        return "";
    }
}
