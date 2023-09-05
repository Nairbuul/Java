public class RoachPopulation_Tester {
    static public void main(String args[]){
        RoachPopulation group1 = new RoachPopulation(100);
        System.out.println("Group1 Population: " + group1.getRoaches());
        group1.breed();
        System.out.println("Increasing the population by 2x: " + group1.getRoaches());
        group1.spray(0.9);
        System.out.println("Reducing the population by 90%: " + group1.getRoaches());
    }
}
