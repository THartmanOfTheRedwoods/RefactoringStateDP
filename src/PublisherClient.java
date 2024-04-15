public class PublisherClient {
    public static void main(String[] args) {
        DocumentContext document = new DocumentContext();
        document.changeState(new DraftState(document));
        while(true) {
            document.render();
            if(document.getState().equals("PublishedState")) {
                break;
            }
            document.publish();
        }
    }
}
