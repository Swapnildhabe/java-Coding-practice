package collection.arrayList;

import java.util.ArrayList;
import java.util.List;
    // How to create an ArrayList from another collection using the
    // ArrayList (Collection c ) constructor.

    //How to add all the elements from an existing collection to the new
    //ArrayList using the addAll() method.
public class ArrayListExample {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Mango");

        System.out.println(fruits);

    }

}
