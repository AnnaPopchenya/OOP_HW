package HW_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentGroup group1 = new StudentGroup();
        group1.addStudent(new Student("John", 20));
        group1.addStudent(new Student("Alice", 19));

        StudentGroup group2 = new StudentGroup();
        group2.addStudent(new Student("Bob", 21));
        group2.addStudent(new Student("Eve", 18));

        List<StudentGroup> groups = new ArrayList<>();
        groups.add(group1);
        groups.add(group2);

        Stream stream1 = new Stream(groups);
        Stream stream2 = new Stream(groups);

        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);

        Controller controller = new Controller();
        controller.sortStreams(streams);

        for (Stream stream : streams) {
            while (stream.hasNext()) {
                StudentGroup studentGroup = stream.next();
                List<Student> students = studentGroup.getStudents();
                for (Student student : students) {
                    System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
                }
            }
        }
    }
}
