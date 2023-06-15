import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import controller.Controller;
import model.Disciplines;
import model.Group;
import model.Student;
import model.Teacher;

public class program {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Teacher master = new Teacher("Anton", 1988, Disciplines.PROGRAMMING);
        Student student1 = new Student("Andrei", 1990);
        Student student2 = controller.createStudent("Anastasia", 1980);
        // Проверка, что через контроллер тоже создается
        Student student3 = new Student("Maria", 1998);
        List<Student> list = new ArrayList<>(Arrays.asList(student1, student2, student3));
        Group jedi = controller.createGroup(list, master);
        controller.readGroup(jedi);

        Teacher lord = new Teacher("Nikolai", 1975, Disciplines.LITERATURE);
        Student student4 = new Student("Olga", 1970);
        Student student5 = new Student("Vasilii", 1980);
        Student student6 = new Student("Oleg", 1978);
        List<Student> list2 = new ArrayList<>(Arrays.asList(student4, student5, student6));
        Group sith = controller.createGroup(list2, lord);
        controller.readGroup(sith);

    }
}