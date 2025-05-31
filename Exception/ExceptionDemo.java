public class ExceptionDemo {
    public static void main(String[] args) {
        int i=5;
        String s = "sss";
        int[] arr = new int[5];
        try {
            int j = 1999 / i; // This will throw ArithmeticException
            s.length(); // This will throw NullPointerException
            arr[10] = 5; // This will throw ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}