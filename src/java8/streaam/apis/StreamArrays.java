package java8.streaam.apis;

public class StreamArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(StreamArraysQuestions.checkEvenOdd(arr));

        System.out.println(StreamArraysQuestions.checkEvenOdds(arr));
    }
}
