class A{
    void masdgsdgasdgasdgasdgasdgasdg() {
        System.out.println("Method in class A");
    }
}
class B extends A{
    @Override
    // This method overrides the method in class A
    void masdgsdgasdgsdgasdgasdgasdg() {
        System.out.println("Method in class B");
    }
}
public class Annotation {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println(a instanceof A); // true
        System.out.println(b instanceof A); // true
        System.out.println(b instanceof B); // true
        System.out.println(a instanceof B); // false
    }
}
// all annotations are:
// 1. Override : it is used to indicate that a method is intended to override a method in a superclass.
// 2. Deprecated : it is used to indicate that a method or class is deprecated and should not be used.
// 3. SuppressWarnings : it is used to suppress compiler warnings for a specific code block.
// 4. FunctionalInterface : it is used to indicate that an interface is a functional interface, which means it has exactly one abstract method. 
// 5. SafeVarargs : it is used to indicate that a method with varargs does not perform unsafe operations on its varargs parameter.
// 6. Native : it is used to indicate that a method is implemented in native code using JNI (Java Native Interface).
// 7. Retention : it is used to specify how long an annotation should be retained (e.g., SOURCE, CLASS, RUNTIME).
// 8. Target : it is used to specify the kinds of program elements to which an annotation type is applicable (e.g., METHOD, FIELD, CLASS).
// 9. Documented : it is used to indicate that an annotation type should be documented by the Javadoc tool.
// 10. Repeatable : it is used to indicate that an annotation type can be applied more than once to the same declaration or type use.
// 11. Inherited : it is used to indicate that an annotation type can be inherited by subclasses of the annotated class.
// 12. PostConstruct : it is used to indicate that a method should be executed after dependency injection is done to perform any initialization.
// 13. PreDestroy : it is used to indicate that a method should be executed before the bean is removed from the container.
// 14. Resource : it is used to indicate that a field or method should be injected with a resource (e.g., a database connection).
// 15. Transactional : it is used to indicate that a method should be executed within a transaction context.
// 16. Entity : it is used to indicate that a class is an entity in the context of JPA (Java Persistence API).
// 17. Table : it is used to specify the table name for an entity in JPA.
// 18. Column : it is used to specify the column name for a field in an entity in JPA.
// 19. Id : it is used to indicate that a field is the primary key of an entity in JPA.
// 20. GeneratedValue : it is used to specify how the primary key value should be generated (e.g., AUTO, IDENTITY, SEQUENCE).
// 21. ManyToOne : it is used to indicate a many-to-one relationship between entities in JPA.
// 22. OneToMany : it is used to indicate a one-to-many relationship between entities in JPA.
// 23. ManyToMany : it is used to indicate a many-to-many relationship between entities in JPA.
// 24. JoinColumn : it is used to specify the column used for joining two entities in a relationship in JPA.
// 25. JoinTable : it is used to specify the join table for a many-to-many relationship in JPA.