//also known as enhanced for loop or for-each loop.
// The for-each loop is a control flow statement for traversing elements in a collection or array.
//only work with array and array type of data structure.
// ForEach is a method that allows you to iterate over elements in a collection or array.
// It is commonly used in programming languages like Java, JavaScript, and Python.

import java.util.*;
public class ForEachExample {
    public static void main(String[] args) {
            int[] nums={1, 2, 3, 4, 5};
            for(int n:nums){
                System.out.print(n);
            }

            System.out.println();

            List<String> numsList = Arrays.asList("one", "two", "three", "four", "five");
            numsList.forEach(n -> System.out.print(n));
    }
}
