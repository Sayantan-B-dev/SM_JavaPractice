class A extends Object{
    public A(){
        System.out.println("Constructor of A");
    }
    public A(int x){
        System.out.println("Constructor of A with parameter: " + x);
    }
}
class B extends A{
    B(){
        super(5);
        System.out.println("Constructor of B");
    }
    B(int x){
        this();
        System.out.println("Constructor of B with parameter: " + x);
    }
}
public class ThisAndSuper{
    public static void main(String[] args){
        B b = new B();
        System.out.println("________________________");
        B bb = new B(5);
    }
}