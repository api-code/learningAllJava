package exception.com.exception;

public class ArithmaticEx extends Exception{
    public static int cal(int num) {

        try{
            int n = 0;
            int answer = num/n;
            return answer;
        }catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
        return 0;
    }
}
