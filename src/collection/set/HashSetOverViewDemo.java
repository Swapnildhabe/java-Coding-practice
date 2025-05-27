package collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetOverViewDemo {
    public static void main(String[] args) {
        nullValueDemo();
        duplicateValueDemo();
        unorderedDemo();
    }

    private static void unorderedDemo() {


    }

    //Set cannot contain one null value
    private static void nullValueDemo() {
        Set<String> set = new HashSet<>();
        set.add(null);
        set.add(null);
        System.out.println(set.toString());
    }

    //it is not contain duplicate Elements
    private static void duplicateValueDemo(){
        Set<String> set = new HashSet<>();
        set.add("Element1");
        set.add("Element1");
    //Display the one element only
        System.out.println(set);
    }

}
