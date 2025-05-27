package collection.linkedList;
//Find the index of the first occurrence of an element in the LinkedList.
//How to find the index of the last occurrence of an element in the LinkedList
//Iterator
//forEach using lambda
//for Each Advance loop

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class LinkedListSearchIterationExample {
    public static void main(String[] args) {
        LinkedList<String> progLangs = new LinkedList<>();

        progLangs.add("C");
        progLangs.add("C++");
        progLangs.add("Core Java");
        progLangs.add("java EE");
        progLangs.add("spring Boot");
        progLangs.add("Hibernate");

        final boolean result = progLangs.contains("C");
        System.out.println("Result: "+ result);

        //Find the index of the first occurrence of an element in the LinkedList.
        final int index = progLangs.indexOf("Core Java");
        System.out.println("Index: "+ index     );

        //How to find the index of the last occurrence of an element in the LinkedList
        final int lastIndex = progLangs.lastIndexOf("spring Boot");
        System.out.println("Last Occurrence Index of : "+ lastIndex);

        //Iterator
        final Iterator<String> iterator = progLangs.iterator();
        while (iterator.hasNext()){
            final String next = iterator.next();
            System.out.println(next);
        }

        //forEach using lambda
        progLangs.forEach((element)-> {
            System.out.println(element);
        });

        //for Each Advance loop
        for (String elements : progLangs) {
            System.out.println(elements);
        }



        Vector<String> list = new Vector<>();
        list.add("C");
        list.add("C++");
        list.add("Core Java");
        list.add("java EE");
        list.add("spring Boot");
        list.add("Hibernate");

    }
}
