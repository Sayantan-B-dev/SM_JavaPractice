import java.util.Collection;
import java.util.Set;
import java.util.ArrayList;
import java.util.*;

public class MyArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        int sum = 0;
        
        Iterator<Integer> it= arr.iterator(); 
        while (it.hasNext()) {
            System.out.println(it.next());
        }



        Set<Integer> set1 = new HashSet<>(arr); // Convert ArrayList to Set
        System.out.println("Set1: " + set1);
        Set<Integer> set2 = new TreeSet<>(arr); // Convert ArrayList to TreeSet
        System.out.println("Set2: " + set2);
    }
}