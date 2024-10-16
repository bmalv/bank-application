public class Savings extends Account {
    //list props specific to savings account
    private int depositBoxID;
    private int depositBoxCode;

    //constructor to init setting for savings props
    public Savings(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
    }

    //list methods specific to savings account
    public void showInfo() {
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Savings");
    }
}
