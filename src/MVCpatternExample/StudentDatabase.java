package MVCpatternExample;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class StudentDatabase {

    private static final ArrayList<Student> studentList = new ArrayList<>();
    @Getter
    static final StudentDatabase instance = new StudentDatabase();

    private StudentDatabase(){
        studentList.add(new Student("Niklas","1"));
        studentList.add(new Student("Viktor", "2"));
        studentList.add(new Student("Ivan","3"));
    }

    public Student retrieveStudentFromDatabase(String name) {
        for (Student s : studentList) {
            if (name.equalsIgnoreCase(s.getName())) {
                return s;
            }
        }
        throw new NoSuchElementException();
    }
}
