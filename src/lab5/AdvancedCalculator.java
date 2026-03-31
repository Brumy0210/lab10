package lab5;

public class AdvancedCalculator extends IntCalculator {

    public AdvancedCalculator(int state) {
        super(state);
    }

    @Override public AdvancedCalculator add(int value) {
        super.add(value);
        return this;
    }

    @Override public AdvancedCalculator subtract(int value) {
        super.subtract(value);
        return this;
    }

    @Override public AdvancedCalculator multiply(int value) {
        super.multiply(value);
        return this;
    }

    @Override public AdvancedCalculator clear() {
        super.clear();
        return this;
    }

    public AdvancedCalculator divide(int value) {
        if (value ==0) {
            throw new ArithmeticException("Division by zero");
        }
        state /= value;
        return this;
    }

    public AdvancedCalculator power(int exponent) {
        state = (int) Math.round(Math.pow(state, exponent));
        return this;
    }

    public AdvancedCalculator root(int n) {
        if (n <=0) {
            throw new IllegalArgumentException("n must be >0");
        }
        state = (int) Math.round(Math.pow(state,1.0 / n));
        return this;
    }
}