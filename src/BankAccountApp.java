import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
//        Checking chkacc1 = new Checking("Tom Wilson", "321456879", 1500);
//
//        Savings savacc1 = new Savings("Rich Lowe", "123456789", 2500);
//
//
//        savacc1.showInfo();
//        System.out.println("*****************");
//        chkacc1.showInfo();

        //Read a CSV File then create new accounts based on that data
        List<String[]> newAccountHolders = util.CSV.read("NewBankAccounts.csv");
        for(String[] accountHolder: newAccountHolders){
            System.out.println("NEW ACCOUNT");
            System.out.println(accountHolder[0]);
            System.out.println(accountHolder[1]);
            System.out.println(accountHolder[2]);
            System.out.println(accountHolder[3]);
        }
    }
}