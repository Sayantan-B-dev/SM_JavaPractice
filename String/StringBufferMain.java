
public class StringBufferMain {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Sayantan");
        System.out.println("StringBuffer: " + sb);
        System.out.println("sb.capacity()" + sb.capacity());
        System.out.println("sb.hashCode(): " + sb.hashCode());
        sb.append("Bharati");
        System.out.println("sb after append: " + sb);
        System.out.println("sb.capacity() after append: " + sb.capacity());
        System.out.println("sb.length(): " + sb.length());
        System.out.println("sb.charAt(0): " + sb.charAt(0));
        System.out.println("sb.indexOf(\"Bharati\"): " + sb.indexOf("Bharati"));
        System.out.println("sb.substring(0, 5): " + sb.substring(0, 5));
        System.out.println("sb.reverse(): " + sb.reverse());
        System.out.println("sb after reverse: " + sb);
        sb.reverse(); // reverse back to original
        System.out.println("sb.insert(0, \"Mr. \"): " + sb.insert(0, "Mr. "));
        System.out.println("sb.delete(0, 4): " + sb.delete(0, 4));
        System.out.println("sb.replace(0, 3, \"Dr\"): " + sb.replace(0, 3, "Dr"));
        String str = sb.toString();
        System.out.println("String from StringBuffer: " + str);
    }   
}
