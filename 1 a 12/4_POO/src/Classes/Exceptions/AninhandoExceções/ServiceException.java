package Classes.Exceptions.AninhandoExceções;

public class ServiceException extends Exception {
    //usamos para "encapsular" o erro vindo do InsuficientFundsException
    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    public ServiceException() {
    }
}
