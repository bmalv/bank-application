public class Checking extends Account {
    //list props specific to checking account
    private int debitCardNum;
    private int pinNumber;

    //constructor to init checking account props
    public Checking(String name){
        super(name);
        System.out.println("New Checking Account!");
    }

    //list methods specific to the checking account
}
