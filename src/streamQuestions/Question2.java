package streamQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//How do you remove duplicate elements from a list using Java 8 streams?
public class Question2 {
    public static void main(String[] args) {

    List<String> listOfString = Arrays.asList("C", "Java", "C#", "Phython", "Kotlin", "Phython", "Java");
        final List<String> uniqList = listOfString.stream().distinct().collect(Collectors.toList());

        System.out.println(uniqList);

    }
}
