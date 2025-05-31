record Person(String name, int age) {}//canonical constructor
//Equivalent to:
// import java.util.Objects;

// public final class Person {
//     private final String name;
//     private final int age;

//     public Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     public String name() {
//         return name;
//     }

//     public int age() {
//         return age;
//     }

//     @Override
//     public boolean equals(Object o) {
//         if (this == o) return true;
//         if (!(o instanceof Person)) return false;
//         Person that = (Person) o;
//         return age == that.age &&
//                Objects.equals(name, that.name);
//     }

//     @Override
//     public int hashCode() {
//         return Objects.hash(name, age);
//     }

//     @Override
//     public String toString() {
//         return "Person[name=" + name + ", age=" + age + "]";
//     }
// }

record Address(String street, String city) {
    public Address {
        if (street == null || city == null) {
            throw new IllegalArgumentException("Street and city cannot be null");
        }
    }
}
public class RecordClasses{
    public static void main(String[] args) {
        
    }
}