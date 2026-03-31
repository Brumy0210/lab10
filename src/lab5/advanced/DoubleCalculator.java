package lab5.advanced;
public class DoubleCalculator extends ACalculator {

    public DoubleCalculator(Double initialState) {
        super(initialState);
    }

    @Override protected Object init() {
        return 0.0;
    }

    public DoubleCalculator add(double value) {
        state = (Double) state + value;
        return this;
    }

    public DoubleCalculator subtract(double value) {
        state = (Double) state - value;
        return this;
    }

    public DoubleCalculator multiply(double value) {
        state = (Double) state * value;
        return this;
    }

    @Override public Double result() {
        return (Double) state;
    }

    @Override public DoubleCalculator clear() {
        state = init();
        return this;
    }
}