package HW_6;

import java.util.List;

// Контроллер для управления учителями
public class TeacherController {
    private UserService<Teacher> userService;
    private UserView<Teacher> userView;

    public TeacherController(UserService<Teacher> userService, UserView<Teacher> userView) {
        this.userService = userService;
        this.userView = userView;
    }

    public void createTeacher(String firstName, String lastName, String middleName) {
        userService.createUser(firstName, lastName, middleName);
    }

    public void editTeacher(int index, String firstName, String lastName, String middleName) {
        userService.editUser(index, firstName, lastName, middleName);
    }

    public void displayTeachers() {
        List<Teacher> teachers = userService.getUsers();
        userView.displayUsers(teachers);
    }
}





