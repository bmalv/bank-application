public class Savings extends Account {
    //list props specific to savings account
    private int depositBoxID;
    private int depositBoxCode;

    //constructor to init setting for savings props
    public Savings(String name){
        super(name);
        System.out.println("New Savings Account!");
    }

    //list methods specific to savings account
}
