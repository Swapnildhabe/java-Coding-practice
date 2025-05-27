package java8FeaturesAll.lambdaFunction.steam;


import java.util.List;
import java.util.stream.Stream;

public class ParallerStreamExample {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x-> x+1).limit(20000).toList();
        List<Long> factorialList = list.stream().map(ParallerStreamExample::factorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with steram "+(endTime - startTime)+ "ms" );


         startTime = System.currentTimeMillis();
         list = Stream.iterate(1, x-> x+1).limit(20000).toList();
         factorialList = list.parallelStream().map(ParallerStreamExample::factorial).toList();
         endTime = System.currentTimeMillis();
         System.out.println("Time taken with steram "+(endTime - startTime)+ "ms" );

         List<Integer> list1;
        list1 = Stream.iterate(1, x-> x+1).limit(20000).toList();
        startTime = System.currentTimeMillis();
         list1.parallelStream().forEach(System.out::println);
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with steram "+(endTime - startTime)+ "ms" );

        System.out.println("\n");
        startTime = System.currentTimeMillis();
         list1.parallelStream().forEachOrdered(System.out::println);
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with steram "+(endTime - startTime)+ "ms" );
//        System.out.println(Runtime.getRuntime().availableProcessors());

    }

    private static long factorial(int n){
        long result = 1;
        for(int i = 2; i<=n;i++){
            result *=1;
        }
        return result;

    }
}
