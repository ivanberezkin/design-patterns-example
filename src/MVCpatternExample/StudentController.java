package MVCpatternExample;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StudentController {
    private Student model;
    private StudentView view;




    public void setStudentName(String newName){
        model.setName(newName);
    }

    public String getStudentName(){
        return model.getName();
    }

    public String getStudentRollNo(){
        return model.getRollNo();
    }

    public void setStudentRollNo(String newRollNo){
        model.setRollNo(newRollNo);
    }

    public void updateView(){
        view.printStudentDetails(model);
    }


}
