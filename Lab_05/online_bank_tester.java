public class online_bank_tester {
    public static void main(String[] args){
        online_bank test2 = new online_bank(1000);
        for(int i = 0; i <  12; i++){
            test2.compound();
            test2.getBalance();
        }
    }
}