import java.util.*;
public class LoyaltyProgram {
    boolean discount;
    double amount_spent;
    double marker;
    ArrayList<Integer> stores;
    public final int discountAt = 100;
    public final int discountAmount = 10;
    
    public LoyaltyProgram(){
        this.discount = false;
        this.amount_spent = 0;
        this.marker = amount_spent;
        this.stores = new ArrayList<Integer>();
    }

    public LoyaltyProgram(double amount_spent){
        this.marker = 0;
        this.amount_spent = amount_spent;
        this.stores = new ArrayList<Integer>();
        setDiscount();
    }

    public boolean checkDiscount(){
        return discount;
    }

    public double getAmountSpent(){
        return amount_spent;
    }

    public double getAmountRequiredForDiscount(){
        return (discountAt - (amount_spent - marker));
    }

    private boolean setDiscount(){
        if((amount_spent - marker) >= discountAt && stores.size() == 3){
            marker = amount_spent;
            discount = true;
            return true;
        }
        return false;
    }

    void purchase(double total, int storeNumber){
        if(storeNumber < 1 || storeNumber > 20){
            System.out.println("FRAUD!");
            System.exit(0);
        }
        else{
            if(stores.contains(storeNumber)){
            }
            else{
                stores.add(storeNumber);
            }
        }
        

        if(discount){
            amount_spent += (total - discountAmount);
            discount = false;
            setDiscount();
        }
        else{
            amount_spent += (total - discountAmount);
            setDiscount();
        }
    }

    public String toString(){
        if(discount){
            return (String) "Discount active!";
        }
        else if((amount_spent - marker) < 100 && stores.size() >= 3)
            return (String) "No discount!\nSpend $" + (100-(amount_spent - marker)) +" more to recieve a discount!";
        else if((amount_spent - marker) > 100 && stores.size() < 3)
            return (String) "No discount!\nShop at " + (3 - stores.size()) + " more stores";
        else
            return (String) "Wut";
    }
}
