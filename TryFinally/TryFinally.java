import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class TryFinally {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);

        System.out.println("___________________________");

        try {
            System.out.println("Enter a number:");
            int num = Integer.parseInt(reader.readLine());
            System.out.println("You entered: " + num);

            System.out.println("___________________________");


            System.out.println("Enter a string:");
            String str = scanner.nextLine();
            System.out.println("You entered: " + str);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                if (reader != null && scanner != null) {
                    reader.close();
                    scanner.close();
                }
            } catch (Exception e) {
                System.out.println("Error closing BufferedReader: " + e.getMessage());
            }
        }
    }
}