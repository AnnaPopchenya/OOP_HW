package HW_4;



public class Main {
    public static void main(String[] args) {
        TeacherService teacherService = new TeacherService();
        TeacherView teacherView = new TeacherView(teacherService);
        TeacherController teacherController = new TeacherController(teacherService, teacherView);
        
        teacherController.create("John", "Doe", "Smith");
        teacherController.create("Jane", "Smith", "Doe");
        
        teacherController.displayTeachers();
        
        teacherController.editTeacher(1, "New First Name", "New Last Name", "New Middle Name");
        
        teacherController.displayTeachers();
    }
}