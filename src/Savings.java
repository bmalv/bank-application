public class Savings extends Account {
    //list props specific to savings account
    private int depositBoxID;
    private int depositBoxCode;

    //constructor to init setting for savings props
    public Savings(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    //list methods specific to savings account
    private void setSafetyDepositBox() {
        depositBoxID = (int) (Math.random() * Math.pow(10,3));
        depositBoxCode = (int) (Math.random() * Math.pow(10,4));
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Your Savings Account features" +
                "\n  Safety Deposit Box ID: " + depositBoxID +
                "\n  Safety Deposit Box Key: " + depositBoxCode
                );
    }
}
