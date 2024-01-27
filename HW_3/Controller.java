package HW_3;


import java.util.List;

public class Controller {
    private StreamService streamService;

    public Controller() {
        streamService = new StreamService();
    }

    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams);
    }
}