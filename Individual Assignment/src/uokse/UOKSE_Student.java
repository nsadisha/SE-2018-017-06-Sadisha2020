package uokse;

public class UOKSE_Student extends Student {
    int num_exams;
    int[] exams;

    //constructor
    public UOKSE_Student(String name, int num_exams) {
        super(name);
        this.num_exams = num_exams;
        this.exams = new int[num_exams];
    }

    //adding grade to the specific exam
    public boolean addGrade(int exam, int grade){
        if(exam<=num_exams && exam>0){
            this.exams[--exam] = grade;
            return true;
        }else{
            return false;
        }
    }
    //returns the grade from an exam
    public int getGrade(int exam){
        if(exam<=num_exams && exam>0){
            return this.exams[--exam];
        }else{
            return -1;
        }
    }
    //returns student's name
    public String getName(){
        return super.getName();
    }
}
