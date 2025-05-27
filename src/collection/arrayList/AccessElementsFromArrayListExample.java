package collection.arrayList;

//How to check if an ArrayList is expty using the isEmpty() Method.
//How to find size of an ArrayList using the size() method.
//How to acccess the elements at a particular index in an ArrayList usiing the get() method.
//How to modify the element at a particular index in an ArrayList using the set() method.

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExample {
    public static void main(String[] args) {

        List<String>    topProgrammingLanguages = new ArrayList<>();
        //Check the if ArrayList is Empty?
        System.out.println("Is the topProgrammingLanguages list empty? : "
                + topProgrammingLanguages.isEmpty());

        topProgrammingLanguages.add("C");
        topProgrammingLanguages.add("JAVA");
        topProgrammingLanguages.add("C++");
        topProgrammingLanguages.add("Python");
        topProgrammingLanguages.add(".Net");

        //find the Size of the ArrayList.
        System.out.println("here are the top "+ topProgrammingLanguages.size()
                + " Programing languages in the world..");

        //Retrive the element at the given index.
        final String toplang = topProgrammingLanguages.get(1);
        System.out.println("Top Language in The World "+ toplang);

        //Modify the element at given index
    final  String modifyLang = "JavaScript";
    topProgrammingLanguages.set(0, modifyLang);

        System.out.println(topProgrammingLanguages);
    }

}
