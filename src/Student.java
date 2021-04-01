import java.util.regex.Pattern;

class Student{
    private Integer studentNumber;
    private String naam;
    Student hasResults;

    public void Student(Integer studentNummer){
        this.studentNumber = studentNummer;

    }
    public Integer getStudentNumber(){
        return studentNumber;
    }
    public String getName(){
        return naam;
    }
    public boolean validateStudentNumber(String studentNumber) {
        return (Pattern.matches("[1-9][0-9]{7}",studentNumber));
    }
}
