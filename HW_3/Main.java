package HW_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание объектов Student
        Student student1 = new Student();
        student1.setFirstName("John");
        student1.setLastName("Doe");
        student1.setMiddleName("Smith");

        Student student2 = new Student();
        student2.setFirstName("Jane");
        student2.setLastName("Doe");
        student2.setMiddleName("Smith");

        // Создание объектов StudentGroup
        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(student1);
        StudentGroup studentGroup1 = new StudentGroup();
        studentGroup1.setStudentList(studentList1);

        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(student2);
        StudentGroup studentGroup2 = new StudentGroup();
        studentGroup2.setStudentList(studentList2);

        // Создание объекта Stream
        List<StudentGroup> studentGroups = new ArrayList<>();
        studentGroups.add(studentGroup1);
        studentGroups.add(studentGroup2);
        Stream stream = new Stream();
        stream.setStudentGroups(studentGroups);

        // Создание объекта Controller
        Controller controller = new Controller();
        controller.sortStreamList(stream.getStreamList());

        // Вывод отсортированных групп
        for (StudentGroup studentGroup : stream) {
            System.out.println("Group size: " + studentGroup.getStudentList().size());
        }
    }
}