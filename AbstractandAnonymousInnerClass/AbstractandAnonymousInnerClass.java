abstract class A{
    abstract void show();
}

public class AbstractandAnonymousInnerClass{
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