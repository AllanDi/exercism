package exercisms.exceptions;

public class IllegalOperationException extends RuntimeException {
    public IllegalOperationException(String message) {
        super(message);
    }

    public IllegalOperationException(String errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }

}
