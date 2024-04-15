import java.util.Random;

public class ModerationState extends DocumentState {
    private Random r;
    private boolean admin;
    public ModerationState(DocumentContext document) {
        super(document);
        r = new Random();
        admin = true;
    }

    @Override
    public void render() {
        System.out.println("Moderation Notes");
        System.out.println("\t" + document.hashCode());
        System.out.println("\t" + this.toString());
    }

    @Override
    public void publish() {
        if(admin) {
            if(!r.nextBoolean()) {
                document.changeState(new DraftState(document));
            } else {
                document.changeState(new PublishedState(document));
            }
        }
    }
}
