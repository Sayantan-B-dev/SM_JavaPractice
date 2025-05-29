public class Wrapper {
    public static void main(String[] args) {
        int a= 10;
        Integer b = a; // Autoboxing: converting primitive int to Integer objec
        Integer c=new Integer(a); // Boxing: converting int to Integer object
        int d = b; // Autounboxing: converting Integer object back to primitive int
        int e = c.intValue(); // Unboxing: converting Integer object back to primitive int
        
        String str = "123";
        Integer f = Integer.parseInt(str); // Parsing String to Integer

        System.out.println("Value of a: " + a);
        System.out.println("Value of b(autoboxing): " + b);
        System.out.println("Value of c(boxing): " + c);
        System.out.println("Value of d(auto-unboxing): " + d);
        System.out.println("Value of e(unboxing): " + e);
        System.out.println("Value of f(parsed from String): " + f);

    }
}
