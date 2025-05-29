class mobile {
    int price;
    String brand;
    static int ram;//class member variable, shared across all instances
    // Static variable ram is shared by all instances of the class mobile

    void show() {
        System.out.println(this.brand+ " mobile is available at a price of " + this.price + " with RAM: " + ram);
    }
}
public class StaticVar {
    public static void main(String[] args) {
        mobile m1 = new mobile();
        m1.brand = "Samsung";
        m1.price = 30000;
        mobile m2 = new mobile();
        m2.brand = "Apple";
        m2.price = 100000;

        mobile.ram = 8; // Static variable shared across all instances
        // Changing the static variable ram will affect all instances
        m1.show();
        m2.show();
    }
}
