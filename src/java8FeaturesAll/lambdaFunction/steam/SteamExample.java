package java8FeaturesAll.lambdaFunction.steam;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SteamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Akshit","Ram","Shaym","Ghanshym");
        final Stream<String> filteredStream = list.stream().filter(x-> x.startsWith("A")).map(String::toUpperCase);
        filteredStream.forEach(x-> System.out.println(x));
//        System.out.println(filteredStream);
    }
}
