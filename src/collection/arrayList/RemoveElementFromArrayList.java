package collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementFromArrayList     {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        List<String>  newfruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Pinepple");
        fruits.add("Pinepple");
        fruits.add("Pinepple");
//        newfruits.add(fruits.get(1));
//        newfruits.add(fruits.get(3));

        System.out.println(fruits);

        final String remove = fruits.remove(4);
        System.out.println(remove);
        fruits.remove("Mango");
        System.out.println(fruits);


        fruits.removeAll(newfruits);

        System.out.println(fruits+" after remov -> "+newfruits );

        fruits.clear();
        System.out.println("after cleare() called :- "+fruits);

    }
}
