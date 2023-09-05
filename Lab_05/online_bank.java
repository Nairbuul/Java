public class online_bank{
    private double balance;
    public final double interest = 6.0;

    /**
     * Default constructor
     */
    public online_bank(){
        balance = 0;
    }

    /**
     * Single arg constructor to initialize balance
     * @param initialBalance balance
     */
    public online_bank(double initialBalance){
        balance = initialBalance;
    }

    /**
     * Compounds(adds 6% interest annually)
     * @return balance
     */
    public double compound(){
        //check
        if(balance == 0){
            System.out.println("Empty bank account");
            return 0;
        }
        //Adding 6% of balance divided by 12 to balance.
        balance += (balance*(interest/100))/12;
        return balance;
    }

    /*
     * mutator method that updates the balance.
     */
    public void setBalance(double newBalance){
        balance = newBalance;
    }

    /*
     * accessor method that returns the balance.
     */
    public void getBalance(){
        System.out.printf("Balance: %.2f", balance);
        System.out.println();
    }
}