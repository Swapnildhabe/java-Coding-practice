package streamQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//11) How do you get three maximum numbers and three minimum numbers from the given list of integers?
public class Question11 {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45,12,56,24,75,31,89);

        System.out.println("______________________");
        System.out.println("Min 3 numbers : ");
        listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);

        System.out.println();
        System.out.println("______________________");
        System.out.println("Max 3 numbers : ");
        listOfIntegers.stream().sorted((a,b)-> b-a ).limit(3).forEach(System.out::println);
        System.out.println("______________________");
        System.out.println("Using sorted Comparator.reverseOrder() method");
        listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}
