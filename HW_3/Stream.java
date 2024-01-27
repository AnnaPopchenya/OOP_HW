package HW_3;

import java.util.Iterator;
import java.util.List;

class Stream implements Iterator<StudentGroup> {
    private List<StudentGroup> groups;
    private int index;

    public Stream(List<StudentGroup> groups) {
        this.groups = groups;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < groups.size();
    }

    @Override
    public StudentGroup next() {
        return groups.get(index++);
    }
}