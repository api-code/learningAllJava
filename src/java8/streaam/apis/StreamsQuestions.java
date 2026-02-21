package java8.streaam.apis;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsQuestions {
    public static String highestLength(String s){
        String count = Arrays.stream(s.split(" "))
                .max(Comparator.comparing(String::length))
                .get();
        return  count;
    }

    public static void removeDuplicate(String s){
//        s.chars().distinct().mapToObj(x->(char)x).forEach(System.out::print);
        Arrays.stream(s.split("")).distinct().forEach(System.out::print);
    }

    public static String secondHighestLen(String s){
        String answer = Arrays.stream(s.split(" ")).
                sorted(Comparator.comparing(String::length).reversed())
                .skip(0).findFirst().get();

        return answer;
    }

    public static int secondHighestLenCount(String s) {
        int count = Arrays.stream(s.split(" ")).
                sorted(Comparator.comparing(String::length).reversed())
                .skip(1).findFirst().get().length();

        return count;
    }

    public static void wordOccurrence(String s){

        Map<String,Long> map = Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map);
    }

    public static void wordVowel2(String s){
        Arrays.stream(s.split(" ")).
                filter(x->x.replaceAll("[^aeiouAEIOU]","").length()==2)
                .forEach(System.out::println);
    }
}
