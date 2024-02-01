package HW_4;

import java.util.List;

public class TeacherView implements UserView<Teacher> {
    
    private TeacherService teacherService;

    public TeacherView(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println(teacher.getFirstName() + " " + teacher.getLastName() + " " + teacher.getMiddleName());
        }
    }
}
