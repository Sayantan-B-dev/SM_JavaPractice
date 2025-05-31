import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        //HashTable is synchronized, HashMap is not
        //HashMap allows null keys and values, HashTable does not allow null keys or values
        //HashMap is faster than HashTable
        //HashMap allows duplicate keys, but the last value will overwrite the previous one
        //HashTable does not allow duplicate keys, it will throw an exception if you try to add a duplicate key
        //HashMap is not thread-safe, HashTable is thread-safe
        Map<String,Integer> map=new HashMap<>();
        map.put("Sayantan", 1);
        map.put("Sayan", 2);
        map.put("Sayan", 3); // This will overwrite the previous value for "Sayan"
        map.put("Sayani", 3); 
        map.put("Paramita", 4); 

        System.out.println("Map: " + map);
        System.out.println("Keys: " + map.keySet());

        for(String key : map.keySet()) {
            System.out.println("Student: " + key + ", Roll: " + map.get(key));
        }
    }
}