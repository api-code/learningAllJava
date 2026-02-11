package exception.com.exception;

public class JSONException extends RuntimeException{

    public JSONException(String messgae){
        super(messgae);
    }

    public JSONException(String message,Throwable cause){
        super(message,cause);
    }

}
