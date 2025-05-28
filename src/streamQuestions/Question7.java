package streamQuestions;

import java.util.Arrays;
import java.util.List;

public class Question7 {
    public static void main(String[] args) {
        List<Integer> listofInteger = Arrays.asList(95,105,45,12,56,15,24,75,31,89);
        listofInteger.stream().sorted().filter(i -> i % 5 == 0).forEachOrdered(System.out::println);
    }
}
