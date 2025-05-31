import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {

        System.out.println("___________________________");

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        System.out.println("Enter a number:");
        try {
            int num = Integer.parseInt(reader.readLine());
            System.out.println("You entered: " + num);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        System.out.println("___________________________");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        System.out.println("You entered: " + str);
    }
}