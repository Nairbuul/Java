public class combolocktester {
    public static void main(String args[]){
        ComboLock a_1 = new ComboLock(3,7,1);
        System.out.println(a_1);
        a_1.turnRight(3);
        a_1.turnLeft(10);
        a_1.turnRight(8);
        System.out.println(a_1);
    }
}
