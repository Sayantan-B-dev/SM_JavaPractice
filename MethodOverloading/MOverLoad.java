class A {
    void show() {
        System.out.println("Class A");
    }
}

class B extends A {
    void show() {
        System.out.println("Class B");
    }
}

class C extends B {
    void show() {
        System.out.println("Class C");
    }
}

public class MOverLoad {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.show(); // Class A
        b.show(); // Class B
        c.show(); // Class C
    }
}