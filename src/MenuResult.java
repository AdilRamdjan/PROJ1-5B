import java.util.ArrayList;

class MenuResult extends Menu {
    private ArrayList<Examen> examList;
    private ArrayList<Examen> succesfullExamens;
    public MenuResult(Examen[] Exam, Student student) {
        super(Exam, student);
    }

    public void DisplayMenu() {
        for (int i = 0; i >= succesfullExamens.size(); i++){
            System.out.println(succesfullExamens.get(i));
        }
    }

    public ArrayList<Examen> getSuccesfullExamens(){
        for (int i = 0; i >= examList.size();i++){
            if (examList.get(i).getResult() == true){
                succesfullExamens.add(examList.get(i));
            }
        }
        return succesfullExamens;
    }
}
