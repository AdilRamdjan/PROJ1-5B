import java.util.regex.Pattern;

class Student{
    private Integer studentNummer;
    private String naam;
    Student hasResults;

    public void Student(Integer studentNummer){
        this.studentNummer = studentNummer;

    }
    public Integer getStudentNummer(){
        return studentNummer;
    }
    public String getNaam(){
        return naam;
    }
    public boolean validateStudentNumber(String studentNumber) {
        return (Pattern.matches("[1-9][0-9]{7}",studentNumber));
    }
}
