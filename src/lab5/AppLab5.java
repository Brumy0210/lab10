package lab5;

public class AppLab5 {
    public static void main(String[] args) {
        IntCalculator calculator = new IntCalculator(10);
        int result = calculator.add(5).subtract(3).multiply(2).result();
        System.out.println("IntCalculator result = " + result);

        AdvancedCalculator advanced = new AdvancedCalculator(10);
        int advancedResult = advanced.add(5).subtract(3).multiply(2).divide(2).power(3).root(3).result();
        System.out.println("AdvancedCalculator result = " + advancedResult);
    }
}