abstract class A{
    abstract void methodA_abstract();
    public void methodA() {
        System.out.println("Method A in class A");
    }
}
class B extends A {
    @Override
    void methodA_abstract() {
        System.out.println("Abstract method implemented in class B");
    }
    
    public void methodB() {
        System.out.println("Method B in class B");
    }
}
class C extends B{ //concrete class C extends B
    @Override
    void methodA_abstract() {
        System.out.println("Abstract method implemented in class C");
    }
    
    public void methodC() {
        System.out.println("Method C in class C");
    }
}
public class AbstractClass {     public static void main(String[] args) {
        A a = new B(); // Upcasting
        a.methodA(); // Calls the method in class A
        a.methodA_abstract(); // Calls the overridden abstract method in class B

        B b = new C(); // Upcasting
        b.methodA(); // Calls the method in class A
        b.methodA_abstract(); // Calls the overridden abstract method in class C
        b.methodB(); // Calls methodB() in class B
    }
}
