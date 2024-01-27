package HW_3;

class StreamComparator {
    public int compare(Stream stream1, Stream stream2) {
        int count1 = 0;
        int count2 = 0;

        while (stream1.hasNext()) {
            stream1.next();
            count1++;
        }

        while (stream2.hasNext()) {
            stream2.next();
            count2++;
        }

        return Integer.compare(count1, count2);
    }
}
