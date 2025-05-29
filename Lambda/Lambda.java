@FunctionalInterface
interface A{
    void show(int a, int b);
}
interface B{
    int show(int a, int b);
}
public class Lambda {
    public static void main(String[] args) {
        A a = (int x, int y) -> System.out.println("Sum: " + (x + y));
        a.show(5, 10); // Output: Sum: 15
        
        B b = (x, y) -> x * y;
        b.show(5, 10); // Output: 50

    }
}