package streamQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.IntStream;

//10) How do you merge two unsorted arrays into single sorted array without duplicates?
public class Question10 {
    public static void main(String[] args) {
        int [] a = new int[] {4, 2, 5, 1};
        int [] b = new int[] {8, 1, 5, 9};

        final int[] newArrya = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
//        IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().forEach(System.out::print);
        System.out.println(Arrays.toString(newArrya));
    }
}
