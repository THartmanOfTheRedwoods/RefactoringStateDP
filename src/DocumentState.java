public abstract class DocumentState implements State {
    protected DocumentContext document;

    public DocumentState(DocumentContext document) {
        this.document = document;
    }

    @Override
    public String toString() {
        return this.getClass().toString().replace("class ", "");
    }
}
