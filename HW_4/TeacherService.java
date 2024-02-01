package HW_4;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserController<Teacher> {
    private List<Teacher> teachers;
    
    public TeacherService() {
        teachers = new ArrayList<>();
    }
    
    @Override
    public void create(String firstName, String lastName, String middleName) {
        Teacher teacher = new Teacher(firstName, lastName, middleName);
        teachers.add(teacher);
    }
    
    public void editTeacher(int index, String firstName, String lastName, String middleName) {
        if (index >= 0 && index < teachers.size()) {
            Teacher teacher = teachers.get(index);
            teacher.setFirstName(firstName);
            teacher.setLastName(lastName);
            teacher.setMiddleName(middleName);
        }
    }
    
    public List<Teacher> getTeachers() {
        return teachers;
    }
}