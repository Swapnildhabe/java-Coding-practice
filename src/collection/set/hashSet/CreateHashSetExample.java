package collection.set.hashSet;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSetExample  {
    public static void main(String[] args) {
          //Create HashSet using the HasghSet() constructor.
          // add new elements to it using the add() method.

        Set<String> programminglanguages = new HashSet<>();
        programminglanguages.add("C");
        programminglanguages.add("C++");
        programminglanguages.add("Java");
        programminglanguages.add("Python");
        programminglanguages.add("Scala");
        programminglanguages.add("JavaScript");

//        System.out.println(programminglanguages );
        Set<String> moreprograminglaguages = new HashSet<>();
        moreprograminglaguages.add("C#");
        moreprograminglaguages.add("Html");
        moreprograminglaguages.add("CSS");

        programminglanguages.addAll(moreprograminglaguages);
        System.out.println(programminglanguages);
    }
}
