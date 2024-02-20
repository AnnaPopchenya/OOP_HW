package HW_6;

//В данном задании были учтены следующие принципы SOLID:
//1. Принцип единственной обязанности (SRP): Классы были разделены на отдельные сущности, каждая из которых отвечает за конкретные задачи.
//2. Принцип открытости/закрытости (OCP): Логика сравнения пользователей была вынесена в отдельный класс `UserComparator`, который может быть легко расширен или заменен другой реализацией.
//3. Принцип подстановки Барбары Лисков (LSP): Реализации интерфейса `UserService` могут быть использованы вместо базового типа `UserService`.
//4. Принцип разделения интерфейса (ISP): Интерфейс `UserService` содержит только методы, необходимые для работы с пользователями.
//5. Принцип инверсии зависимостей (DIP): Класс `TeacherController` теперь зависит от абстракций `UserService` и `UserView`, а не от конкретных реализаций.



public class Main {
    public static void main(String[] args) {
        UserService<Teacher> teacherService = new TeacherService();
        UserView<Teacher> teacherView = new TeacherView();
        TeacherController teacherController = new TeacherController(teacherService, teacherView);
        
        teacherController.createTeacher("John", "Doe", "Smith");
        teacherController.createTeacher("Jane", "Smith", "Doe");
        
        teacherController.displayTeachers();
        
        teacherController.editTeacher(1, "New First Name", "New Last Name", "New Middle Name");
        
        teacherController.displayTeachers();
    }
}

