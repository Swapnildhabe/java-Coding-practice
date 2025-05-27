package collection.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWayIterateOverList {
    public static void main(String[] args) {

        List<String> courses = Arrays.asList("C", "C++", "Java", "Spring", "Hibernate");

        //basic for loop
        for(int i=0; i< courses.size();i++)
        {
            System.out.println(courses.get(i));
        }

        //Enhance for each loop
        for(String course: courses){
            System.out.println(course);

        }
        for(Iterator iterator = courses.iterator(); iterator.hasNext();){
            String  next = (String) iterator.next();
            System.out.println(next );
        }
        System.out.println(" "); System.out.println(" ");

        //java 8 Stream + lambda example
        courses.stream().forEach((course -> System.out.println(course)));
    }
}
