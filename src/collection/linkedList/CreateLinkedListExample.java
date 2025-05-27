package collection.linkedList;

import java.util.LinkedList;
import java.util.List;

//add()
    //add(2, element)
    //addFirst()
    //addLast()
public class CreateLinkedListExample {
        public static void main(String[] args) {
            LinkedList<String> fruits = new LinkedList<>();
            fruits.add("Banana");
            fruits.add("Apple");
            fruits.add("Mango");

            System.out.println("Initial LinkedList -> "+ fruits);

            //Adding an elements at the specific position in the LinkedList
            fruits.add(2, "Watermelon");

            System.out.println("After adding Watermelon => "+fruits );
            //Adding an elements at the Begining of the linkedList

            fruits.addFirst("Strawberry");
            System.out.println(fruits);

            //Adding an elements at the End of the linkedList
            fruits.addLast("Orange");
            System.out.println(fruits   );
        }
}
