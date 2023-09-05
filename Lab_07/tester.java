import java.util.Scanner;
/**
 * Cody Toeung
 * Brian Luu
 */
public class tester {
    //Method asking for directions.
    public static String getDirection(){
        System.out.println("Type in a direction (up/down)");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        while(!input.toLowerCase().equals("up") && !input.toLowerCase().equals("down")){
            System.out.println("Invalid input");
            input = scan.nextLine();
        }
        return input;
    }

    //Formatting.
    public static void line(){
        System.out.println("=======================================================================");
        System.out.println();
    }

    //Method asking for ring number.
    public static int getRing(String current_combination){
        System.out.println("Choose a ring: (1-4)" + current_combination);
        System.out.println();
        Scanner scan = new Scanner(System.in);
        int ringNum = 0;
        String s = "x";

        while(s.equals("x")){
            if(scan.hasNextInt()){
                ringNum = scan.nextInt();
                while(ringNum > 4){
                    System.out.println("Invalid input.");
                    ringNum = scan.nextInt();
                }
                return ringNum;
            }
            else{
                System.out.println("Not an interger");
                String arbitraryInput = scan.nextLine();
            }
            
        }
        return 0;
    }

    //Method asking for times rotated.
    public static int getAmount(){
        System.out.println("How many times do you want to rotate?");
        Scanner scan = new Scanner(System.in);
        int rotations = 0;
        String s = "x";

        while(s.equals("x")){
            if(scan.hasNextInt()){
                rotations = scan.nextInt();
                return Math.abs(rotations);
            }
            else{
                System.out.println("Not an integer");
                String arbitraryInput = scan.nextLine();
            }
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        String input = "Y";
        lock temp = new lock();

        while(!input.toUpperCase().equals("N") && input.toUpperCase().equals("Y")){
            temp.print();
            line();
            int a = getRing(temp.getCurrentCombination());
            String b = getDirection();
            int c = getAmount();
            temp.instructions(b, a, c);
            
            if(temp.locked()==false){
                temp.print();
                break;
            }
            else{
                System.out.println("Continue? (Y/N)");
                input = scan.nextLine();
            }
        }
    }
}


/*
* While !input.toUpper().equals("Y") && !input.toUpper().equal("N"){
    *     sysout(choose a ring(1-4) + current combination);
    *     int1 = getRing();
    *     sysout(Direction)
    *     String = getDirection();
    *     sysout(getAmount)
    *     int2 = getAmount();
    *     lock.instructions(String, int1, int2);
    *     if(temp.locked() == false){
        *        break;
        *     }
        *     else{
 *        sysout(Continue Y or  N);
 *      }
 * 
 * }
 */
// while(!input.toUpperCase().equals("X")){
//     if(temp.locked() == false){
//         break;
//     }
//     System.out.println("Type in a direction (up/down)");
//     if(!input.equals(new String())){
//         scan.nextLine();
//     }
//     input = scan.nextLine();
//     if(!input.toLowerCase().equals("up") && !input.toLowerCase().equals("down")){
//         System.out.println("Invalid input.");
//         break;
//     }
//     else{
//         System.out.println("Choose a ring: (1-4)" + temp.getCurrentCombination());
//         System.out.println();
//         if(scan.hasNextInt()){
//             numInput = scan.nextInt();
//             if(numInput > 4){
//                 System.out.println("Invalid input.");
//                 break;
//             }
//             System.out.println("How many times do you want to rotate?");
//             if(scan.hasNextInt()){
//                 numInput2 = scan.nextInt();
//                 System.out.println(numInput2);
//                 temp.instructions(input, numInput, numInput2);
//                 temp.print();
//             }
//             else{
//                 break;
//             }
//         }
//         else{
//             break;
//         }
//     }
// }