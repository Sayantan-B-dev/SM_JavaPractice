public class StringIntro {
    public static void main(String[] args) {
        String str = new String("HelloWorld");
        System.out.println("String 2: " + str);
        System.out.println(str.hashCode());
        System.out.println("str.toUpperCase(): " + str.toUpperCase());
        System.out.println("str.toLowerCase(): " + str.toLowerCase());
        System.out.println("str.replace('o', 'a'): " + str.replace('o', 'a'));
        System.out.println("str.substring(1, 4): " + str.substring(1, 4));
        System.out.println("str.substring(1): " + str.substring(1));
        System.out.println("str.indexOf('o'): " + str.indexOf('o'));
        System.out.println("str.lastIndexOf('o'): " + str.lastIndexOf('o'));
        System.out.println("str.length(): " + str.length());
        System.out.println("str.charAt(1): " + str.charAt(1));
        System.out.println("str.contains(\"or\"): " + str.contains("or"));
        System.out.println("str.startsWith(\"Wo\"): " + str.startsWith("Wo"));
        System.out.println("str.endsWith(\"ld\"): " + str.endsWith("ld"));
        System.out.println("str.isEmpty(): " + str.isEmpty());
        System.out.println("str.equals(\"World\"): " + str.equals("World"));
        System.out.println("str.equalsIgnoreCase(\"world\"): " + str.equalsIgnoreCase("world"));
        System.out.println("str.compareTo(\"World\"): " + str.compareTo("World"));
        System.out.println("str.compareToIgnoreCase(\"world\"): " + str.compareToIgnoreCase("world"));
        System.out.println("str.trim(): " + str.trim());
        System.out.println("str.split(\"o\").length: " + str.split("o").length);
        System.out.println("str.split(\"o\")[0]: " + str.split("o")[0]);
        System.out.println("str.split(\"o\")[1]: " + str.split("o")[1]);







    }
}
