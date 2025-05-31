import java.util.*;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{age=" + age + ", name='" + name + '\'' + '}';
    }

    @Override
    public int compareTo(Student that) {
        return this.age - that.age;
    }
}

public class ComparatorVsComparable {
    public static void main(String[] args) {

        Comparator<Student> compareByAge = (i, j)->  i.age - j.age;//optional if using Comparable interface


        List<Student> students = new ArrayList<>();
        students.add(new Student(25, "Sayantan"));
        students.add(new Student(21, "Sayan"));
        students.add(new Student(20, "Paramita"));
        students.add(new Student(26, "Sourav"));

        //Collections.sort(students, compareByAge);
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student.name + " - " + student.age);
        }

        // Comparator<String> compare = new Comparator<String>() {
        //     @Override
        //     public int compare(String o1, String o2) {
        //         return o1.length() - o2.length();
        //     }
        // };
        // List<String> arr = new ArrayList<>();
        // arr.add("apple");
        // arr.add("banana");
        // arr.add("cherry");
        // arr.add("date");
        // arr.add("elderberry");

        // System.out.println("Original List: " + arr);
        // Collections.sort(arr, compare);
        // System.out.println("Sorted List by Length: " + arr);
    }
}