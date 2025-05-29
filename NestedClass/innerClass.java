class A{
    public void Show() {
        System.out.println("This is class A");
    }
    class B{
        public void Show() {
            System.out.println("This is class B");
        }
    }
    static class C{
        public void Show() {
            System.out.println("This is class C");
        }
    }
}
public class innerClass {
    public static void main(String[] args) {
        A obj1 = new A(); // Create an instance of outer class A
        obj1.Show(); // Call method of outer class A
        
        A.B obj2 = obj1.new B(); // Create an instance of inner class B using outer class instance
        obj2.Show(); // Call method of inner class B

        A.C obj3 = new A.C(); // Create an instance of static nested class C
        obj3.Show(); // Call method of static nested class C
    }
}
