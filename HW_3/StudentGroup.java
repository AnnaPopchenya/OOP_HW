package HW_3;

import java.util.ArrayList;
import java.util.List;

class StudentGroup {
    private List<Student> students;

    public StudentGroup() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}
