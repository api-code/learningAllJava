package java8.streaam.apis;

public class Main {
    public static void main(String[] args) {
        String s = "I am learning stream api in java";
        String count = StreamsQuestions.highestLength(s);
//        System.out.println(count);

        String sRemoveDup = "dabcadefg";
        StreamsQuestions.removeDuplicate(sRemoveDup);
    }
}
