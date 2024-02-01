package HW_4;

public class TeacherController {

    
    private TeacherService teacherService;
    private TeacherView teacherView;
    
    public TeacherController(TeacherService teacherService, TeacherView teacherView) {
        this.teacherService = teacherService;
        this.teacherView = teacherView;
    }
    
    public void create(String firstName, String lastName, String middleName) {
        teacherService.create(firstName, lastName, middleName);
    }
    
    public void editTeacher(int index, String firstName, String lastName, String middleName) {
        teacherService.editTeacher(index, firstName, lastName, middleName);
    }
    
    public void displayTeachers() {
        teacherView.sendOnConsole(teacherService.getTeachers());
    }
}
