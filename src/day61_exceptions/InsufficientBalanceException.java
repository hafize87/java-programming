package day61_exceptions;

public class InsufficientBalanceException extends RuntimeException {


    //
    public InsufficientBalanceException() {
    }

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
