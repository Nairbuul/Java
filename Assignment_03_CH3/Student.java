public class Student{


    //Private variables.
    //Ctor variables.
    static int lastStudentID = 123456;
    private static String _fname;
    private static String _lname;
    private static int _quizScore[] = new int [100];            //are all dynamically allocated.
    //Method Variables
    private static int amount_of_quizzes = 0;
   
    /*
    Accessor function that’ll return us the student’s first and last name.
    @param name of the student.
    */
    static String getName(){
        return _fname + " " + _lname;
    }
 
 
    /*
     * Accesor function that returns the amount of quizzes the student has taken.
     * @return number of quizzes taken.
     */
    static int getNumberOfQuizzes(){
        return amount_of_quizzes;
    }
 
 
    /*
     * Accessor function that returns the student ID
     * @return StudentID
     */
    static int getStudentID(){
        return lastStudentID;
    }
 
    /*
     * Accessor function that returns the highest total score possible.
     *@return the highest score possible.
     */
    static int getMaximTotal(){
        return amount_of_quizzes*100;
    }
 
    /*
    Adds the quiz score into the student’s record.
    @param score of the student’s quiz
    */
    static void addQuiz(int score){
        _quizScore[amount_of_quizzes] = score;
        amount_of_quizzes++;
    }
 
 
    /*
    Calculates all the quiz scores
    @returns the total score.  
    */
    static int getTotalScore(){
        int TotalScore = 0;
        for(int i = 0; i < amount_of_quizzes; i++){
            TotalScore +=  _quizScore[i];
        }
        return TotalScore;
    }
 
 
    /**
    Computes all the quiz scores and returns the average of it.
    @return the average score of the student.
    */
    static int getAverageScore(){
        int Average = 0;
        for(int i = 0; i < amount_of_quizzes; i++){
            Average += _quizScore[i];
        }  
        return Average/amount_of_quizzes;
    }
 
 
    /**
     * Function that'll print out all of the students info and their quiz grades.
     */
    static void printInfo(){
        System.out.println("\tStudent Info: " + getName() + " #" + getStudentID());
        System.out.println("\tAmount of Quizzes taken:\t" + getNumberOfQuizzes());
        System.out.println("\tStudent Average Quiz Score:\t" + getAverageScore());
        System.out.println("\tStudent Total Quiz Score:\t" + getTotalScore());
        System.out.println("\tHighest Possible Score:\t\t" + getMaximTotal());
        System.out.println();
    }
 
 
    /**
    Our constructor that takes in two strings(first and last name), then two ints(quiz Score        and student id)
    @param fname first name
    @param lname last name
    @param quizScore quiz score
    @param StudentID studentID
    */
    public Student(String fname, String lname, int quizScore, int StudentID){
        lastStudentID = StudentID;
        _fname = fname;
        _lname = lname;
        _quizScore[amount_of_quizzes] = quizScore;
        amount_of_quizzes++;
    }
 }
 