package collection.set.hashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetRemoveExample {
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();
        //creating HashSet

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        //using remove() method.
        final boolean result = numbers.remove(1);
        System.out.println("Remove method Result -> "+result);
        System.out.println(numbers);

        //using removeAll() method.

        Set<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        evenNumbers.add(8);
        evenNumbers.add(10);
        numbers.removeAll(evenNumbers);

        System.out.println("After removing All Even Numbers :-"+numbers);
        //Using clear() method.

        numbers.clear();
        System.out.println("After clear Method Called :- "+numbers);
    }
}
