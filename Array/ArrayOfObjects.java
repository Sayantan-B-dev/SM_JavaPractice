
class Student {
    String name;
    int age;
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student();
        students[0].name = "Sayantan";
        students[0].age = 26;

        students[1] = new Student();
        students[1].name = "Paramita";
        students[1].age = 20;

        students[2] = new Student();
        students[2].name = "Sayan";
        students[2].age = 19;

        for(Student student :students){
            System.out.println("Name: " + student.name + ", Age: " + student.age);
        }
    }
}
