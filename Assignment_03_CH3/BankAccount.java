public class BankAccount{
    //Bank Account methods from book Chapter 3 pg 77 (NOT MY WORK)
    //Excluding setFee() and Fee() 

    private double balance;                             //The bank account balance
    private double Fee;                                 //The fee that is charged for every transaction
    private double Charges[] = new double[100];         //Arbitray size used for keeping track of all the fees.
    private String transactions[] = new String[100];    //Arbitrary size used for keeping track of transactions.
    private double extraCharges[] =  new double[100];   //Arbitrary size used for keeping track of fees at the time of the transaction.
    private int numOfTransactions;                      //Variable used to keep track of the amount of transactions.
    
    /**
     * Constructs a bank account withh zero balance.
     */
    public BankAccount(){
        balance = 0;
        this.setFee(0.15);
        numOfTransactions = 0;
    }
    
    /**
     * Constructs a bank accoutn with a given balance.
     * @param intialBalance the initialBalance
     */
    public BankAccount(double initialBalance){
        balance = initialBalance;
        numOfTransactions = 0;
        this.setFee(0.05);
    }

    /**
     * Deposits money into the bank account.
     * @param amount the amount to deposit.
     */
    public void deposit(double amount){
        balance = balance + amount - Fees(amount);
        transactions[numOfTransactions] = "+" + Double.toString(amount);
        Charges[numOfTransactions] = Fees(amount);
        extraCharges[numOfTransactions] = Fee;
        numOfTransactions++;
    }

    /**
     * Withdraws money from the bank account.
     * @param amount the amount to withdraw.
     */
    public void withdraw(double amount){
        balance = balance - amount - Fees(amount);
        transactions[numOfTransactions] = "-" + Double.toString(amount);
        Charges[numOfTransactions] = Fees(amount);
        extraCharges[numOfTransactions] = Fee;
        numOfTransactions++;
    }

    /**
     * Gets the current balance of the bank account.
     * @return the current balance;
     */
    public double getBalance(){
        return balance;
    }

    /**
     * Function that returns the fee after the transaction amount.
     * @param amount the transaction amount 
     * @return the Fee * the transaction amount.
     */
    public double Fees(double amount){
        return amount*Fee;
    }


    /**
     * Function to set the percentage.
     * @param percentage Fee Percentage.
     */
    public void setFee(double percentage){
        Fee = percentage;
    }

    /**
     * A method to print the transaction history.
     */
    public void getTransactionHistory(){
        System.out.println("-------------------- Transaction History --------------------\n");
        for(int i = 0; i < numOfTransactions; i++){
            System.out.println("\tTransaction: " + transactions[i] + "\t\tFees(" + extraCharges[i] + ") -" + Charges[i]);
        }
        System.out.println("\n" + "-----------------------------------------------------------------");
    }
}