package collection.map;

import java.util.Collection;
import java.util.HashMap;

import java.util.Map;
import java.util.Set;

public class CreatehashMapExample {
    public static void main(String[] args) {
        //example to map numbers to String
        Map<String,Integer> numberMapping = new HashMap<>();

        numberMapping.put("One", 1);
        numberMapping.put("Tow",2);
        numberMapping.put("Three", 3);
        numberMapping.put("Four", 4);
        numberMapping.put("Five", 5);
        numberMapping.put(null, 6);
        numberMapping.put(null, 7);

        System.out.println(numberMapping);

        //Check if a HashMap is Empty
        System.out.println(numberMapping.isEmpty()); //its return now false

        //Find the Size of HashMap
        System.out.println(numberMapping.size());

        //Check if a Key Exists in the HashMap
        if(numberMapping.containsKey("Four")){
            System.out.println("Exists");
        }else {
            System.out.println("Not Exists");
        }

        //Check if a value exists in HashMap
        if (numberMapping.containsKey("Four")) {
            System.out.println("Exists");
        }else {
            System.out.println("Not Exists");
        }

        //get value by Key
        Integer v1 = numberMapping.get("One");
        System.out.println(v1);

        //How to remove key from hashMap
         numberMapping.remove("One");
        System.out.println(numberMapping);

        // get only keys from HashMap
        final Set<String> keys = numberMapping.keySet();
        System.out.println(keys);

        // get only values from HashMap
        final Collection<Integer> values = numberMapping.values();
        System.out.println(values);


        //Different ways to iterate over Hashmap

        //For each Method
//        for (Map.Entry(String, Integer))
    }
}
