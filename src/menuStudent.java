import java.util.ArrayList;

public class menuStudent extends Menu {
    private ArrayList<Student> hasStudents;

    public menuStudent(ArrayList<Student> student) {
        hasStudents = student;
    }
    public menuStudent(){
        hasStudents = new ArrayList<Student>();
    }
    public void DisplayMenu() {

    }


    public boolean addUniqueStudent(Student student){
        int count = 0;
        boolean result = false;
        for (Student ExistingStudent : hasStudents){
            if(!ExistingStudent.getStudentNumber().equals(student.getStudentNumber())){
                count++;
            }
        }
        if (count == hasStudents.size()){
            result = hasStudents.add(student);
        }
        return result;
    }

    public ArrayList<Student> getStudents(){
        return hasStudents;
    }

    public Student getStudentByNumber(Integer studentNumber){
        Student resultStudent = null;
        for (Student student : hasStudents){
            if(student.getStudentNumber().equals(studentNumber)){
                resultStudent = student;
                break;
            }
        }
        return resultStudent;
    }

    public String displayStudents(){
        int i = 1;
        String result = "";
        for(Student student : hasStudents){
            result += i + ") " + student.getName() + "\t " + student.getStudentNumber() + "\n";
            i++;
        }
        return result;
    }

    public boolean deleteStudentExisting(Student student){
        return hasStudents.remove(student);
    }

}
