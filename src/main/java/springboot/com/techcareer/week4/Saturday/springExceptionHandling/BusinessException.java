package springboot.com.techcareer.week4.Saturday.springExceptionHandling;

public class BusinessException extends Exception{

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable throwable) {
        super(message, throwable);

    }
}
