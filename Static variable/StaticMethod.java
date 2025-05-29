class mobile {
    int price;
    String brand;
    static int ram;

    static void show(mobile m) {
        System.out.println(m.brand+ " mobile is available at a price of " + m.price + " with RAM: " + ram);
    }//can pass static variable normally but need other object variables as parameters
}
public class StaticMethod {
    public static void main(String[] args) {
        mobile m1 = new mobile();
        m1.brand = "Samsung";
        m1.price = 30000;
        mobile m2 = new mobile();
        m2.brand = "Apple";
        m2.price = 100000;

        mobile.ram = 8; 

        mobile.show(m1);
        mobile.show(m2);
    }
}
