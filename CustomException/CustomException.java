class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }
}

public class CustomException{
    public static void main(String[] args) {
        int i = 0;
        int j = 0;  
        String s = null;
        int[] arr = new int[5];
        try {
            j = 1888 / i; 
            if(j==0){
                throw new MyException("Default value of j is 15");
            }
            s.length(); 
            arr[10] = 5; 
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (MyException e) {
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