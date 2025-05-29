class A{
    void show() {
        System.out.println("In class A");
    }
}

public class AnonymousInnerClass{
    public static void main(String[] args) {
        A obj=new A() {
            @Override
            void show() {
                System.out.println("In anonymous inner class");
            }
        };
        obj.show(); // Calls the overridden method in the anonymous inner class
    }
}