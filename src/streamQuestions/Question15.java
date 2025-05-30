package streamQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//15) Given a list of strings, sort them according to increasing order of their length?
public class Question15 {
    public static void main(String[] args) {
        List<String> listofString = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin","C++", "COBOL", "C");
            listofString.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }
}
