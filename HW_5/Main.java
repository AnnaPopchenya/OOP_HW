import java.util.ArrayList;
import java.util.List;

import controller.StudyGroupController;
import model.Student;
import model.StudyGroup;


public class Main {
    public static void main(String[] args) {
        StudyGroupController studyGroupController = new StudyGroupController();

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Жилич", "Семен", "Павлович"));
        students.add(new Student(2, "Попченя", "Даниил", "Иванович"));

        StudyGroup studyGroup = studyGroupController.createStudyGroup(1, students);

        System.out.println("Teacher ID: " + studyGroup.getTeacher().getId());
        System.out.println("Teacher Name: " + studyGroup.getTeacher().getFullName());

        System.out.println("Student IDs:");
        for (Student student : studyGroup.getStudents()) {
            System.out.println(student.getId());
        }
    }
}
