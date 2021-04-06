import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

class ResultTest{

    @Test
    void getResult() {
        Student frenk = new Student(19928781, "naam");
        PolairQuestion rijvraag = new PolairQuestion("is nederland kleiner dan australie?", true);
        PolairQuestion algemeenvraag = new PolairQuestion("Is amerika groter dan nederland?", true);
        int userInput = 0;
        ResultQuestion voldoende = new ResultQuestion(userInput, rijvraag);
        ResultQuestion voldoende1 = new ResultQuestion(userInput, algemeenvraag);
        ArrayList<ResultQuestion> vragenlijst = new ArrayList<>();
        vragenlijst.add(voldoende);
        vragenlijst.add(voldoende1);
        ArrayList<Question> questions = new ArrayList<>();
        questions.add(rijvraag);
        questions.add(algemeenvraag);
        Examen examen1 = new Examen("naam1", questions);

        Result uitslag = new Result(frenk, vragenlijst, examen1);

        assertEquals(uitslag.getResult(),false);
    }
}

class menuStudentTest{

    @Test
    void addUniqueStudent(){
        Student frenk = new Student(20118123, "naam");
        Student henk = new Student(20118123, "naam1");
        menuStudent menu1 = new menuStudent();
        assertEquals(menu1.addUniqueStudent(frenk), true);
        assertEquals(menu1.addUniqueStudent(henk), false);
    }
    void getStudentByNumber(){
        Student frenk = new Student(20118123, "naam");
        Student henk = new Student(20120123, "naam1");
        menuStudent menu1 = new menuStudent();
        menu1.addUniqueStudent(frenk);
        menu1.addUniqueStudent(henk);
        assertEquals(menu1.getStudentByNumber(20118123), frenk);
        assertEquals(menu1.getStudentByNumber(20118124), null);
    }
}

class menuResultTest{

    @Test
    void getPassedExams(){
        Student frenk = new Student(19928781, "naam");
        PolairQuestion rijvraag = new PolairQuestion("is nederland kleiner dan australie?", true);
        PolairQuestion algemeenvraag = new PolairQuestion("Is amerika groter dan nederland?", true);
        int userInput = 1;
        ResultQuestion voldoende = new ResultQuestion(userInput, rijvraag);
        ResultQuestion voldoende1 = new ResultQuestion(userInput, algemeenvraag);
        ArrayList<ResultQuestion> vragenlijst = new ArrayList<>();
        vragenlijst.add(voldoende);
        vragenlijst.add(voldoende1);
        ArrayList<Question> questions = new ArrayList<>();
        questions.add(rijvraag);
        questions.add(algemeenvraag);
        Examen examen1 = new Examen("naam1", questions);

        Result uitslag = new Result(frenk, vragenlijst, examen1);
        MenuResult menu1 = new MenuResult();
        ArrayList<Examen> passedExamList = new ArrayList<>();
        passedExamList.add(examen1);
        assertEquals(menu1.getPassedExams(frenk), passedExamList);
    }
}

class MenuExamenTest{

    @Test
    void addExam(){
        Student frenk = new Student(19928781, "naam");
        PolairQuestion rijvraag = new PolairQuestion("is nederland kleiner dan australie?", true);
        PolairQuestion algemeenvraag = new PolairQuestion("Is amerika groter dan nederland?", true);
        int userInput = 1;
        ResultQuestion voldoende = new ResultQuestion(userInput, rijvraag);
        ResultQuestion voldoende1 = new ResultQuestion(userInput, algemeenvraag);
        ArrayList<ResultQuestion> vragenlijst = new ArrayList<>();
        vragenlijst.add(voldoende);
        vragenlijst.add(voldoende1);
        ArrayList<Question> questions = new ArrayList<>();
        questions.add(rijvraag);
        questions.add(algemeenvraag);
        Examen examen1 = new Examen("naam1", questions);
        MenuExamen menu1 = new MenuExamen();
        assertEquals(menu1.addExam(examen1), true);
    }
}