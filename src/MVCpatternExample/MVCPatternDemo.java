package MVCpatternExample;

import java.util.ArrayList;

public class MVCPatternDemo {
    private final ArrayList<StudentController> scList = new ArrayList<>();

    MVCPatternDemo() {
        StudentDatabase studentDatabase = StudentDatabase.getInstance();
        Student s1 = studentDatabase.retrieveStudentFromDatabase("Viktor");
        Student s2 = studentDatabase.retrieveStudentFromDatabase("Niklas");
        Student s3 = studentDatabase.retrieveStudentFromDatabase("Ivan");

        StudentView view = new StudentView();
        scList.add(new StudentController(s1, view));
        scList.add(new StudentController(s2, view));
        scList.add(new StudentController(s3, view));

        printAllStudents();

        IO.println("------------------------------------------");

        scList.getFirst().setStudentName("Amanda");
        scList.get(1).setStudentName("Jenny");
        scList.getLast().setStudentName("Jennifer");

        printAllStudents();
    }

    private void printAllStudents(){
        for (StudentController sc : scList) {
            sc.updateView();
        }
    }

    static void main() {
        MVCPatternDemo mvc = new MVCPatternDemo();
    }
}
