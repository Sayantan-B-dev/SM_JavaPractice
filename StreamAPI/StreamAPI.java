import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Operation no (1,2,3):");
        int input = scanner.nextInt();
        System.out.println("--------------------");
        switch (input) {
            case 1:
                try {
                    
                    List<String> str = Arrays.asList("one", "two", "three", "four", "five");

                    Stream<String> s1 = str.stream();
                    s1.filter(n -> n.length() % 2 != 0)
                            .map(n -> n.toUpperCase())
                            .forEach(n -> System.out.print(" " + n));

                    Stream<String> s2 = str.stream();
                    int result = s2.reduce(0, (total, n) -> total + n.length(), Integer::sum);
                    System.out.println("\nTotal length of all strings: " + result);
                } catch (Exception e) {
                    System.out.println("An error occurred: " + e.getMessage());
                }
                break;
            case 2:
                try {
                    Stream<Integer> s3 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
                    int max = s3.filter(n -> n % 2 == 0)
                            .mapToInt(n -> n)
                            .reduce(0, (c, e) -> c + e);// carry amd element
                    System.out.println("Sum of even numbers: " + max);
                } catch (Exception e) {
                    System.out.println("An error occurred: " + e.getMessage());
                }
                break;
            case 3:
                try {
                    // Predicate<Integer> isEven = new Predicate<Integer>() {
                    // @Override
                    // public boolean test(Integer n) {
                    // return n % 2 == 0;
                    // }
                    // };
                    Stream<Integer> s3 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

                    Predicate<Integer> isEven = n -> n % 2 == 0; // Predicate to check if a number is even
                    Function<Integer, Integer> cube = n -> n * n * n; // accepting a number and returning its square

                    Stream<Integer> sortedValues = s3.filter(isEven)
                            .map(cube)
                            .sorted();
                    sortedValues.forEach(n -> System.out.print(n + " "));
                } catch (Exception e) {
                    System.out.println("An error occurred: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid input, please enter a number between 1 and 3.");
        }
        scanner.close();
    }
}