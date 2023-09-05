public class LPtester {
    public static void main (String args[]){
        LoyaltyProgram Joe = new LoyaltyProgram(119);
        System.out.println("1:" + Joe);
        // Joe.purchase(20, 42);
        Joe.purchase(20, 12);
        System.out.println("2:" + Joe);
        System.out.println(Joe.getAmountRequiredForDiscount());
        Joe.purchase(189, 19);
        System.out.println("3:" + Joe);
        System.out.println(Joe.getAmountSpent());
    }
}
