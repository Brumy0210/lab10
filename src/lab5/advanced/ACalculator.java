package lab5.advanced;

public abstract class ACalculator {
    protected Object state;

    protected ACalculator(Object initialState) {
        this.state = initialState;
    }

    public Object result() {
        return state;
    }

    public ACalculator clear() {
        state = init();
        return this;
    }

    protected abstract Object init();
}