package java8.streaam.apis;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamArraysQuestions {
    // from array separate the even and odd integer
    public static Map<Boolean, List<Integer>> checkEvenOdd(int[] array){
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

        Map<Boolean,List<Integer>> checkList = list.stream()
                .collect(Collectors.groupingBy(x->x%2==0,Collectors.toList()));
        return checkList;
    }
    // instead of groupingBy we can use partitioningBy()
    public static List<List<Integer>> checkEvenOdds(int[] array){
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

        List<List<Integer>> checkedList = list.stream()
                .collect(Collectors.groupingBy(x -> x%2==0,Collectors.toList()))
                .entrySet().stream().map(s->s.getValue())
                .collect(Collectors.toList());

        return checkedList;
    }
}
