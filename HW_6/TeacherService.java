package HW_6;

import java.util.ArrayList;
import java.util.List;

// Класс для работы с учителями, реализующий интерфейс UserService
public class TeacherService implements UserService<Teacher> {
    private List<Teacher> teachers;

    public TeacherService() {
        teachers = new ArrayList<>();
    }

    @Override
    public void createUser(String firstName, String lastName, String middleName) {
        Teacher teacher = new Teacher(firstName, lastName, middleName);
        teachers.add(teacher);
    }

    @Override
    public void editUser(int index, String firstName, String lastName, String middleName) {
        if (index >= 0 && index < teachers.size()) {
            Teacher teacher = teachers.get(index);
            teacher.setFirstName(firstName);
            teacher.setLastName(lastName);
            teacher.setMiddleName(middleName);
        }
    }

    @Override
    public List<Teacher> getUsers() {
        return teachers;
    }
}



