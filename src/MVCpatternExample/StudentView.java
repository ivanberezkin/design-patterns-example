package MVCpatternExample;


public class StudentView {

    public void printStudentDetails(Student student){
        System.out.println("Student details:");
        IO.print("Name: ");
        IO.println(student.getName());
        System.out.print("Roll no: ");
        System.out.println(student.getRollNo());
    }
}
