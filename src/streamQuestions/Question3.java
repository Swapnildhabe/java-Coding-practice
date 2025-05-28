package streamQuestions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//3) How do you find frequency of each character in a string using Java 8 streams?
public class Question3 {
    public static void main(String[] args) {
        String inputString = "Java Concept of The Day";
        Map<Character, Long> charCountMap = inputString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCountMap);
    }
}
