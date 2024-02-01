package HW_3;


import java.util.Collections;
import java.util.List;

public class StreamService {
    public void sortStreamList(List<Stream> streamList) {
        Collections.sort(streamList, new StreamComparator());
    }
}


