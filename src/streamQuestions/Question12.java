package streamQuestions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//Java 8 program to check if two strings are anagrams or not?
public class Question12 {
    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";

         s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
         s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        System.out.println(s1.toString()+" "+ s2.toString());
    if (s1.equals(s2)){
        System.out.println("String are anagrams: ");
    }else {
        System.out.println("String are not anagrams: ");
    }
    }
}
