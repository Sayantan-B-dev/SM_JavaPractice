class A{
    public void showA() throws ArithmeticException, ClassNotFoundException{
        int i =100/0;
        System.out.println(i);
    }
}
class B extends A{
    public void showB() throws ClassNotFoundException{
        Class.forName("Bread");
    }
}

public class ThrowsExample{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        try {
            b.showB();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
            //e.printStackTrace();
        }
        try {
            a.showA();
        } catch (ArithmeticException | ClassNotFoundException e) {
            System.out.println("An exception occurred: " + e.getMessage());
            //e.printStackTrace();
        }


    }
}