package lab5.advanced;

public class NewIntCalculator extends ACalculator {

    public NewIntCalculator(Integer initialState) {
        super(initialState);
    }

    @Override protected Object init() {
        return 0;
    }

    public NewIntCalculator add(int value) {
        state = (Integer) state + value;
        return this;
    }

    public NewIntCalculator subtract(int value) {
        state = (Integer) state - value;
        return this;
    }

    public NewIntCalculator multiply(int value) {
        state = (Integer) state * value;
        return this;
    }

    @Override public Integer result() {
        return (Integer) state;
    }

    @Override public NewIntCalculator clear() {
        state = init();
        return this;
    }
}