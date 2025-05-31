import java.util.Scanner;

sealed class A extends Thread implements Cloneable permits B, C {
    void methodA() {
        System.out.println("Method in A");
    }
}

non-sealed class B extends A {// this class needs to be final ,sealed or non-sealed
    void methodB() {
        System.out.println("Method in B");
    }
}

final class C extends A {
    void methodC() {
        System.out.println("Method in C");
    }
}
// class D extends A { // This will cause a compile-time error because D is not
// permitted
// void methodD() {
// System.out.println("Method in D");
// }
// }

class E extends B { // This is allowed because B is non-sealed
    void methodE() {
        System.out.println("Method in E");
    }
}


sealed interface X permits Y, Z {
    void methodX();
}

non-sealed interface Y extends X {
    void methodY();
}

sealed interface Z extends X permits W {
    void methodZ();
}

final class W implements Z {
    public void methodX() {
        System.out.println("Method in W implementing X");
    }

    public void methodZ() {
        System.out.println("Method in W implementing Z");
    }
}

public class SealedClasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select case (1 for Sealed Classes, 2 for Sealed Interfaces):");
        int sc = scanner.nextInt();
        System.out.println("--------------------");
        switch (sc) {
            case 1:
                try {
                    A a1 = new B();
                    A a2 = new C();

                    a1.methodA(); // Calls method in A
                    ((B) a1).methodB(); // Calls method in B
                    a2.methodA(); // Calls method in A
                    ((C) a2).methodC(); // Calls method in C
                    E e = new E();
                    e.methodA(); // Calls method in A

                    // Uncommenting the following line will cause a compile-time error
                    // because D is not permitted to extend A.
                    // A a3 = new D();
                } catch (Exception e) {
                    System.out.println("An error occurred: " + e.getMessage());
                }
                ;

                break;
            case 2:
                try {
                    X x = new W();
                    x.methodX(); // Calls method in W implementing X
                    ((W) x).methodZ(); // Calls method in W implementing Z
                    System.out.println("Sealed classes and interfaces example executed successfully.");
                } catch (Exception e) {
                    System.out.println("An error occurred: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid case selected.");
        }

    }
}