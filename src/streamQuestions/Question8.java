package streamQuestions;

//8) Given a list of integers, find maximum and minimum of those numbers?


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question8 {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
         int max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Maximul number : "+ max);
        final Integer min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Minimum Number :"+ min  );

    }
}
