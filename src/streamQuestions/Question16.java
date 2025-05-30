package streamQuestions;

import java.util.Arrays;

//16) Given an integer array, find sum and average of all elements?
public class Question16 {
    public static void main(String[] args) {
        int[] a = new int[] {45, 12, 56, 24, 75, 31, 89};
        final int sum = Arrays.stream(a).sum();
        System.out.println("Sum : "+ sum);

        final double asDouble = Arrays.stream(a).average().getAsDouble();
        System.out.println("Average: "+ asDouble);
    }
}
