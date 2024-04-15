public class DocumentContext {
    private State state;

    public DocumentContext(State initialState) {
        this.state = initialState;
    }

    public DocumentContext() {

    }

    public void render() {
        state.render();
    }
    public void publish() {
        state.publish();
    }

    public String getState() {
        return state.toString();
    }

    public void changeState(State state) {
        this.state = state;
    }

    public boolean isExpired() {
        return false;
    }
}
