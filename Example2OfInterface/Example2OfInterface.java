//in inheritance its by default public and abstract, we cannot use private or protected
//we cannot instantiate an interface
//all variables are public, static and final by default

interface A{
    int x = 10; // public static final by default

    void methodA();
    void methodB();
}
interface A2 extends A {
    // This interface can extend another interface if needed
    void methodC();
}
class B implements A2 {
    //dont get the variable x from class B, it will always be from interface A
    @Override
    public void methodA() {
        System.out.println("Method A implemented in class B");
    }

    @Override
    public void methodB() {
        System.out.println("Method B implemented in class B");
    }
    @Override
    public void methodC() {
        System.out.println("Method C implemented in class B");
    }
}
public class Example2OfInterface {
    public static void main(String[] args) {
        A2 obj = new B(); // Creating an instance of class B which implements interface A
        obj.methodA(); // Calls methodA from class B
        obj.methodB(); // Calls methodB from class B
        obj.methodC(); // Calls methodC from class B

        System.out.println("Value of x: " + A.x); // Accessing the static variable from interface A
    }
}
