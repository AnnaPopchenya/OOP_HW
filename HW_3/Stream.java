package HW_3;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {

    private List<StudentGroup> studentGroups;

    private List<Stream> stream;

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    public List<Stream> getStreamList() {
        return stream;
    }

    public void setStudentGroups(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroups.iterator();
    }
}