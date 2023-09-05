import java.util.Scanner;

 public class Student_tester {
    public static void main(String args[]){
        // //Creating an object
        // Student test = new Student("Brian", "Luu", 100, 10237040);
       
        // //Printing out student info(Name, Quizzes taken, Average quiz score, Total quiz Score, ID)
        // test.printInfo();
 
 
        // //Adding quizes to student's record.
        // test.addQuiz(5);
        // test.addQuiz(81);
 
 
        // //Printing out the info again.
        // test.printInfo();

        String s = "Java Program";
        System.out.println(s.length());
        String s2 = s.substring(8,12);
        System.out.println(s2);
        s2 = "Java Pro"+s2+"ming";
        System.out.println(s2);

        String str = "Harry"; 
        int n = str.length();
        String mystery = str.substring(0, 1) + str.substring(n - 1, n); 
        System.out.println(mystery);

        int na = (int)0.51;
        System.out.println(na);
        System.out.println(Math.floorMod(13, -10));

        Scanner myobj = new Scanner(System.in);
        System.out.println(myobj.nextLine());
    }
 }
 