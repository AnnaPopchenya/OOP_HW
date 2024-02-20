package HW_6;

import java.util.List;

// Класс для отображения учителей
public class TeacherView implements UserView<Teacher> {
    public void displayUsers(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println(teacher.getFirstName() + " " + teacher.getLastName() + " " + teacher.getMiddleName());
        }
    }
}






