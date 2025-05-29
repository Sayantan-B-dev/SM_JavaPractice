import pk1.*;
import pk2.*;
import pk2.pk3.*;
public class Pack {
    public static void main(String[] args) {
        C1 c1 = new C1();
        C2 c2 = new C2();   
        C3 c3 = new C3();
        A1 a1 = new A1();
        A2 a2 = new A2();
        A3 a3 = new A3();
        B1 b1 = new B1();
        B2 b2 = new B2();
        B3 b3 = new B3();
        a1.show();
        a2.show();
        a3.show();
        b1.show();
        b2.show();
        b3.show();
        c1.show();
        c2.show();
        c3.show();
        System.out.println("All classes from different packages are successfully imported and used.");
    }
}
