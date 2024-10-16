//abstract because we don't want to create classes from Account
public abstract class Account implements IBaseRate {
    //list common props for savings and checking account
    private String name;
    String accountNumber;
    private String sSN;
    private double balance;
    double rate;
    private static int index = 10000;

    //constructor to set base properties and init the account
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        this.balance = initDeposit;

        //set account number
        index++;
        this.accountNumber = setAccountNumber();
        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber(){
        String lastTwoOfSSN = sSN.substring(sSN.length() - 2);
        int uniqueID = index;
        int randomNum = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNum;
    }

    //list common methods: deposit(), withdraw(), transfer(), showInfo()
    public void deposit(){

    }

    public void withdraw(){

    }

    public void transfer() {

    }

    public void showInfo(){
        System.out.println(
                "NAME: " + name +
                        "\nACCOUNT NUMBER: " + accountNumber +
                        "\nBALANCE: $" + balance +
                        "\nRATE: " + rate + "%"
        );
    }
}
