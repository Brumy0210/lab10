package lab5.advanced;

public class Main {
    public static void main(String[] args) {
        int intResult = new NewIntCalculator(10)
                .add(5)
                .subtract(3)
                .multiply(2)
                .result();

        double doubleResult = new DoubleCalculator(10.0)
                .add(5.0)
                .subtract(3.3)
                .multiply(2.2)
                .result();

        System.out.println(intResult);
        System.out.println(doubleResult);
    }
}