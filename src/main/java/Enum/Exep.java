package Enum;

public class Exep extends Exception {     // класс в котором создаю личные исключения


    public Exep() {
    }

    public Exep(String message) {
        super(message);
    }

    public Exep(String message, Throwable cause) {
        super(message, cause);
    }

    public Exep(Throwable cause) {
        super(cause);
    }

    public Exep(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
