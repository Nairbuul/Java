import java.util.ArrayList;
class CS3B{
    String instructor_name = new String();
    int section_number;
    ArrayList<Student> students;

    /**
     * Defaul CTOR.
     */
    public CS3B(){
        instructor_name = new String();
        section_number = 0;
        students = new ArrayList<Student>();
    }

    /**
     * Param ctor to set variables
     * @param instructor instructor of class
     * @param SectionNum 
     * @param roster
     */
    public CS3B(String instructor, int SectionNum, ArrayList<Student> roster){
        instructor_name = instructor;
        section_number = SectionNum;
        students = roster;
    }

    /**
     * Accessor method
     * @return instructor name
     */
    public String getInstructor(){
        return instructor_name;
    }

    /**
     * Accessor Method
     * @return
     */
    public int getSectionNumber(){
        return section_number;
    }

    /**
     * Mutator method. (in case of professor change)
     * @param newInstructor new instructor
     */
    public void setInstructor(String newInstructor){
        instructor_name = newInstructor;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void setRoster(ArrayList<Student> newRoster){
        students = newRoster;
    }

    public ArrayList<Student> topStudents(int n){
        if(n >= students.size())
            return students;
        
        if(n <= 0)
            return new ArrayList<Student>();

        ArrayList<Student> temp = new ArrayList<Student>();
        for(int i = 0; i < n; i++){
            temp.add(students.get(i));
        }

        return temp;
    }

    public String toString(){
        String temp = "Section Number: " + section_number + "\tInstructor Name: " + instructor_name + "\tRoster: " + students;
        return temp; 
    }

}