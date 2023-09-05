import java.util.ArrayList;
public class tester {
    public static void main(String args[]){
        ArrayList<Double> test = new ArrayList<Double>();
        for(int i = 0 ; i <10; i++){
            test.add(i*10.0);
        }

        System.out.println(test);
        Student Brian = new Student("Brian", "Luu", 10237040, test);
        System.out.println(Brian);

        ArrayList<Student> test2 = new ArrayList<Student>();
        for(int i = 0; i < 10; i++){
            test2.add(Brian);
        }

    }
}


/*
 * Create a class for a course called CS3B.
This class will have an instructor name, section number, and array list of students, and 
Student class will have  the first name last name and student ID, average grade for the course, and an ArrayList of grades 
We will have  a static variable called last studentIDUsed  
Display top N students based on the average grade 
Be sure you have two constructors and at least three mutators and three accessor methods
Be sure you will have toString for printing each class
Have a tester class to test this  
 */