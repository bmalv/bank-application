public class Savings extends Account {
    //list props specific to savings account
    private String depositBoxNum;
    private String depositBoxCode;
    private int safetyDepositBox;

    //constructor to init setting for savings props
    public Savings(String name){
        super(name);
        System.out.println("New Savings Account!");
    }

    //list methods specific to savings account
}
