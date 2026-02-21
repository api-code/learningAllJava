package java8.streaam.apis;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String s = "I am learning stream api in java";
        String count = StreamsQuestions.highestLength(s);
//        System.out.println(count);

        String sRemoveDup = "dabcadefg";
//        StreamsQuestions.removeDuplicate(sRemoveDup);

        String secondHighLen = "I am learning streams api in java";
        String secondHighestLength = StreamsQuestions.secondHighestLen(secondHighLen);
//        System.out.println(secondHighestLength);

        String secondHighLenCount = "I am learning streams api in java";
        int secondHighestLengthCount = StreamsQuestions.secondHighestLenCount(secondHighLenCount);
//        System.out.println(secondHighestLengthCount);

        String wordOccurence = "I am api learning streams java api in java";
//        StreamsQuestions.wordOccurrence(wordOccurence);

        String wordVowel = "I am learning streams api in java";
        StreamsQuestions.wordVowel2(wordVowel);
    }
}
