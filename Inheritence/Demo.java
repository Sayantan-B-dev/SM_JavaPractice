
public class Demo {
    public static void main(String[] args) {
        AdvanceCalc calculator = new AdvanceCalc();
        int a = 10000;
        int b = 3;
        System.out.println("Addition: " + calculator.add(a, b));
        System.out.println("Subtraction: " + calculator.subtract(a, b));
        System.out.println("Multiplication: " + calculator.multiply(a, b));
        try {
            System.out.println("Division: " + calculator.divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Power: " + calculator.power(a, b));
        try {
            System.out.println("Modulus: " + calculator.modulus(a, b));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
