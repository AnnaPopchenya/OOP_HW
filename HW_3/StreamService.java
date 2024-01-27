package HW_3;

import java.util.Collections;
import java.util.List;

class StreamService {
    public void sortStreams(List<Stream> streams) {
        StreamComparator comparator = new StreamComparator();
        Collections.sort(streams, comparator::compare);
    }
}