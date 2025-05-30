package streamQuestions;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//13) Find sum of all digits of a number in Java 8?
public class Question13 {
    public static void main(String[] args) {
        int i = 15623;

        final Integer collect1 = Stream.of(String.valueOf(i).split(""))
                .collect(Collectors.summingInt(Integer::parseInt));
//        final IntSummaryStatistics collect1 = Stream.of(String.valueOf(i).split(""))
//                .collect(Collectors.summarizingInt(Integer::parseInt));
//        final R collect = collect1;
//        final Integer collect1 = (Integer) collect;


        System.out.println(collect1.toString());
    }
}
