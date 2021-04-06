import java.util.ArrayList;
import java.util.regex.Pattern;

class Student{
    private Integer studentNumber;
    private String name;
    private ArrayList<Result> hasResults;

    public Student(Integer studentNumber, String name){
        hasResults = new ArrayList<Result>();
        this.studentNumber = studentNumber;
        this.name = name;
    }

    public boolean addResult(Result result){
        return hasResults.add(result);
    }
    public Integer getStudentNumber(){
        return studentNumber;
    }
    public String getName(){
        return name;
    }
    public boolean validateStudentNumber() {
        return (Pattern.matches("[1-9][0-9]{7}", studentNumber.toString()));
    }
}
