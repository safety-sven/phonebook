package phonebook;

public class MessageBuilder {
    //creates messages for each search type in main
    private final int requests;

    MessageBuilder(int requests) {
        this.requests = requests;
    }

    void produceMessage(int found, long start) {
        Message message = new NoSortMessage(requests);
        message.setFound(found);
        message.setSearchTime(start);
        message.print();
    }

    void produceMessage(int found, long start, long sortStart, int differ) {
        SortMessage message = new SortMessage(requests);
        message.setFound(found);
        message.setSearchTime(start);
        message.setSortTime(sortStart);
        message.setDiffer(differ);
        message.print();
    }
}
