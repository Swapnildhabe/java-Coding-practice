package collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Akshit");
        hashMap.put(2,"Neha");
        hashMap.put(3, "Shubham");

        final int i = System.identityHashCode(hashMap);
        System.out.println(i);
        Map<Integer,String> hashMap1 = new HashMap<>();
        hashMap1 = hashMap;
        System.out.println(hashMap1);

        final int i1 = System.identityHashCode(hashMap1);
        System.out.println(i1);

//        final String student = hashMap.get(1);
//        System.out.println(student);
//
//        System.out.println(hashMap.containsKey(2));
//        System.out.println(hashMap.containsValue("Shubham"));

    }
}
