package streamQuestions;
//6) Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question6 {
    public static void main(String[] args) {
        List<String> listofStrings = Arrays.asList("FaceBook", "Twitter", "YouTube", "WhatsApp", "LinkdIn");
        final String joinedStream = listofStrings.stream().collect(Collectors.joining(", ", "[", "]"));
        System.out.println(joinedStream);
    }
}
