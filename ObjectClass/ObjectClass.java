class Smartphone {
    private String model;
    private double price;
    private String serialNumber;

    public Smartphone(String model, double price, String serialNumber) {
        this.model = model;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Smartphone that = (Smartphone) obj;
        return Double.compare(that.price, price) == 0 &&
                model.equals(that.model) &&
                serialNumber.equals(that.serialNumber);
    }

    @Override
    public int hashCode() {
        int result = model.hashCode();
        long temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + serialNumber.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("Galaxy S21", 799.99, "SN123456");
        Smartphone smartphone2 = new Smartphone("Galaxy S21", 799.99, "SN123456");
        Smartphone smartphone3 = new Smartphone("iPhone 13", 999.99, "SN654321");

        // Testing equals method
        System.out.println("smartphone1 equals smartphone2: " + smartphone1.equals(smartphone2)); // true
        System.out.println("smartphone1 equals smartphone3: " + smartphone1.equals(smartphone3)); // false

        // Testing hashCode method
        System.out.println("smartphone1 hashCode: " + smartphone1.hashCode());
        System.out.println("smartphone2 hashCode: " + smartphone2.hashCode());
        System.out.println("smartphone3 hashCode: " + smartphone3.hashCode());

        // Testing toString method
        System.out.println(smartphone1);
        System.out.println(smartphone2);
        System.out.println(smartphone3);
    }
}