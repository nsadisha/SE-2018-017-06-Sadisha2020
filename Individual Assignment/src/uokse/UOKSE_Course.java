package uokse;

public class UOKSE_Course {
    int capacity;
    UOKSE_Student roster[];
    static int enrolled;

    public UOKSE_Course(int capacity){
        this.capacity = capacity;
        roster = new UOKSE_Student[this.capacity];
        enrolled = 0;
    }

    public boolean addStudent(String name, int num_exams){
        if( enrolled<this.roster.length ){
            UOKSE_Student tempStudent = new UOKSE_Student(name,num_exams);
            this.roster[enrolled] = tempStudent;
            enrolled++;

            return true;
        }else{
            return false;
        }
    }
    public UOKSE_Student findStudent(String name){
        for(UOKSE_Student student : this.roster){
            if(student.getName().equalsIgnoreCase(name)){
                return student;
            }
        }
        return null;
    }
    public double computeAverage(int exam){
        double average = 0;
        for(int i=0; i<enrolled; i++){
            UOKSE_Student student = this.roster[i];
            average += student.getGrade(exam);
        }
        try{
            average /= enrolled;
            return average;
        }catch (ArithmeticException e){
            System.out.println("No one has enrolled with this course.");
        }
        return 0;
    }

    //main method
    public static void main(String[] args) {
        UOKSE_Course course = new UOKSE_Course(30);

        //adding students
        course.addStudent("Sally Smarty", 3);
        course.addStudent("Phil Phailure", 3);

        //searching for students and giving grades
        try{
            course.findStudent("Sally Smarty").addGrade(1, 100);
            course.findStudent("Phil Phailure").addGrade(1, 100);
        }catch (Exception e){
            System.out.println("Something went wrong!");
        }

        //output the average
        double average = course.computeAverage(1);
        System.out.println("Average for exam 1: " + average);
    }
}