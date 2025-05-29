class A{
    public void show1() {
        System.out.println("A's show1");
    }
}
class B extends A {
    public void show2() {
        System.out.println("B's show2");
    }
}
class UpDownCast {
    public static void main(String[] args) {
        A a = new B(); // Upcasting
        a.show1(); // Calls A's show1
        // a.show2(); // This would cause a compile-time error

        B b = (B) a; // Downcasting
        b.show1(); // Calls A's show1
        b.show2(); // Calls B's show2
    }
}