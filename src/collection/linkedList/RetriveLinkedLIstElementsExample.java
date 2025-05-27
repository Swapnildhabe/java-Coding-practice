package collection.linkedList;
//How to get the first element in the LinkedList.
//How to get the last element in the LinkedList.
//How to get the element at a given index in the LinkedLIst.
//How to get all the elements from LinkedList.

import java.util.LinkedList;

public class RetriveLinkedLIstElementsExample  {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("mango");
        fruits.add("Pinaple");

        //Getting first element from the LinkedList using getFirst()
        String firstelement = fruits.getFirst();
        System.out.println("initial LinkedList: "+ fruits);
        System.out.println("First element from LinkedList: "+firstelement);

        //Getting first element from the LinkedList using getLast();

        String lastElement  = fruits.getLast();
        System.out.println("Last element LinkedList: "+ lastElement );



    }
}
