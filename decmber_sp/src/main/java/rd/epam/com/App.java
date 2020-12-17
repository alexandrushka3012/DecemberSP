package rd.epam.com;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList();

        Student student = new Student("Андрей", "Юрьевич");
        student.setGroup(Group.FIRST);
        student.setSecondName("Иванов");
		
        Student student = new Student("Александра", "Борисовна");
        student.setGroup(Group.SECOND);
        student.setSecondName("Батурина");
		
        students.add(student);
		students.add(student2);
        students.forEach(System.out::println);
    }
}
