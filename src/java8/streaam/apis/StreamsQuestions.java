package java8.streaam.apis;

import java.util.Arrays;
import java.util.Comparator;

public class StreamsQuestions {
    public static String highestLength(String s){
        String count = Arrays.stream(s.split(" "))
                .max(Comparator.comparing(String::length))
                .get();
        return  count;
    }

    public static void removeDuplicate(String s){
        s.chars().distinct().mapToObj(x->(char)x).forEach(System.out::print);
    }
}
