public class BankAccountTester {
    public static void main(String args[]){
        BankAccount BriansAccount = new BankAccount(1000);
        System.out.println("\nBrian's Initialized Balanced: " + BriansAccount.getBalance());
        BriansAccount.withdraw(20);
        System.out.println("Withdrew $20" + BriansAccount.getBalance());
        BriansAccount.deposit(20150);
        System.out.println("Deposited $20,150: " + BriansAccount.getBalance());
        
        System.out.println("Printing the transaction history.");
        BriansAccount.getTransactionHistory();

        BriansAccount.setFee(1);
        BriansAccount.withdraw(BriansAccount.getBalance());
        System.out.println("Withdrew all my money." + BriansAccount.getBalance());
        
        System.out.println("Printing the transaction history.");
        BriansAccount.getTransactionHistory();
        
    }
    
}
