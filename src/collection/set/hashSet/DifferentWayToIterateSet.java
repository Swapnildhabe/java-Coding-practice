package collection.set.hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DifferentWayToIterateSet {
    public static void main(String[] args) {
        Set<String> courses = new HashSet<>();
        courses.add("Java");
        courses.add("C");
        courses.add("C++");
        courses.add("Pythod");
        courses.add("Scala");

        //Enhance for loop
        for (String course : courses){
            System.out.println(course);
        }
        //Basic Loop with iterator
        for (Iterator iterator = courses.iterator();iterator.hasNext();){
            String  course =(String) iterator.next();
            System.out.println(course );
        }
        //While loop with iterator
        Iterator<String> iterator = courses.iterator();
        while (iterator.hasNext()){
            final String course = iterator.next();
            System.out.println(course);
            System.out.println();
        }
        //JDK 8 forEach() method with lambda
        courses.forEach(course-> System.out.println(course));

        //JDK 8 Streaming + forEach()  + lambda expression.
        System.out.println();
        courses.stream().filter(course-> !"Java".equals(course)).
                forEach(course-> System.out.println(course));
    }
}
