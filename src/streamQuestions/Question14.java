package streamQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//14) Find second largest number in an integer array?
public class Question14 {
    public static void main(String[] args) {

    List<Integer> listofInteger = Arrays.asList(45,12,56,24,75, 31, 89);
        final Integer i = listofInteger.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        System.out.println(i);
    }
}
