public class Checking extends Account {
    //list props specific to checking account
    private int debitCardNum;
    private int pinNumber;

    //constructor to init checking account props
    public Checking(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    //list methods specific to the checking account
    public void setDebitCard(){
        debitCardNum = (int) (Math.random() * Math.pow(10, 12));
        pinNumber = (int) (Math.random() * Math.pow(10, 4));
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Your Checking Account features" +
                "\n  Debit Card Number: " + debitCardNum +
                "\n  Debit Card Pin: " + pinNumber
        );
    }
}
