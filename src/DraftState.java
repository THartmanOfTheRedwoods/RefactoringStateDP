public class DraftState extends DocumentState {

    public DraftState(DocumentContext document) {
        super(document);
    }

    @Override
    public void render() {
        System.out.println("Draft Notes");
        System.out.println("\t" + document.hashCode());
        System.out.println("\t" + this.toString());
    }

    @Override
    public void publish() {
        State moderation = new ModerationState(document);
        document.changeState(moderation);
    }
}
