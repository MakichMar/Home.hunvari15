import javax.naming.NamingException;

public class WrongPasswordException extends Exception {

    public WrongPasswordException(String message) {
        super(message);
    }
}
