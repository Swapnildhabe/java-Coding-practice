package streamQuestions;
//1) Given a list of integers, separate odd and even numbers?

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Question1 {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        final Map<Boolean, List<Integer>> oddEvenNumberMap = listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
       Set<Entry<Boolean, List<Integer>>> entrySet = oddEvenNumberMap.entrySet();
        for (Entry<Boolean, List<Integer>> entry:entrySet){
            if(entry.getKey()){
                System.out.println("even Numbers : "+ entry.getValue());
            }else{
                System.out.println("Odd Numbers : "+ entry.getValue());
            }
        }


    }   
}
