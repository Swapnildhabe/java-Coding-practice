package collection.linkedList;
//How to remove the first element from linkedList.
//How to remove the last element from LinkedList.
//HOw to remove the first occurrenct of a given element in the LinkedList.
//How to cleare the LinkedList completely.

import java.util.LinkedList;

public class RemoveElementFromLinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Pinapple");

        System.out.println("Initial LinkedList: "+fruits);

        //Remove First Element in the LinkedList.
        String element = fruits.removeFirst();
        System.out.println("After Removing First Element From List: "+ fruits);

        //Remove Last Element in the LinkedList.
        String element1 = fruits.removeLast();
        System.out.println("After Removing Last element From List: "+ fruits);

        // Remove the first occurrenct of a given element in the LinkedList.
        fruits.remove("Apple");
        System.out.println("After Apple Remove : "+ fruits);
    }
}
