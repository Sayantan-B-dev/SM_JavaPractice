class A{
    void display() {
        System.out.println("Display method of class A");
    }
}
class B extends A {
    void display() {
        System.out.println("Display method of class B");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A a = new B(); // Creating an object of class A
        a.display(); // Calls display method of class B due to dynamic method dispatch

        a= new A(); // Reassigning to a new object of class A
        a.display(); // Calls display method of class A

        A b = new A(); // Creating another object of class A
        b.display(); // Calls display method of class A
    }
}
