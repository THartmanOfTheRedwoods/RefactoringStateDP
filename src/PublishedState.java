public class PublishedState extends DocumentState {

    public PublishedState(DocumentContext document) {
        super(document);
    }

    @Override
    public void render() {
        System.out.println("Published");
        System.out.println("\t" + document.hashCode());
        System.out.println("\t" + this.toString());
    }

    @Override
    public void publish() {
        if(document.isExpired()) {
            document.changeState(new DraftState(document));
        }
    }
}
