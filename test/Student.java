import java.util.ArrayList;
public class Student {
    String first;
    String last;
    int StudentID;
    Double student_average;
    ArrayList<Double> gradeBook;

    /**
     * Default Constructor.
     */
    public Student(){
        first = new String();
        last = new String();
        StudentID = 0;
        student_average = 0.0;
        gradeBook = new ArrayList<Double>();
    }   
    
    /**
     * Constructor to initialize student's name and id if gradebook is not yet available.
     * @param firstName first name
     * @param lastName  last name
     * @param ID        id
     */
    public Student(String firstName, String lastName, int ID){
        first = firstName;
        last = lastName;
        StudentID = ID;
    }

    /**
     * Parameter constructor to initialize name, id and, gradebook.
     * @param firstName first name
     * @param lastName  last name
     * @param ID        student id
     * @param grades    gradeBook.
     */
    public Student(String firstName, String lastName, int ID, ArrayList<Double> grades){
        first = firstName;
        last = lastName;
        StudentID = ID;
        gradeBook = grades;
        student_average = 0.0;
        setAverage();
    }

    /**
     * Mutator Function.
     * Updating student's average course grade.
     */
    private void setAverage(){
        for(int i = 0; i < gradeBook.size(); i++){
            student_average += gradeBook.get(i);
        }
        student_average /= gradeBook.size();
    }

    /**
     * Mutator Function.
     * @param grade adding grade to student's grade book.
     */
    public void addGrade(double grade){
        gradeBook.add(grade);
        setAverage();
    }

    /**
     * Accessor Function.
     * @return student's average
     */
    public double getAverage(){
        return student_average;
    }

    /**
     * Accessor Function.
     * @return All of student's grades.
     */
    public ArrayList<Double> getGradeBook(){
        return gradeBook;
    }

    /**
     * Accessor Fucntion
     * @return student's full name.
     */
    public String getName(){
        return first + " " + last;
    }

    public String toString(){
        String temp = ("Student Name: " + first +  " " + last + "\tID: " + StudentID + "\tAverage Grade: " + student_average);
        return temp;
    }
}
