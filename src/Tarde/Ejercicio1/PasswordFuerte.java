package Tarde.Ejercicio1;

public class PasswordFuerte extends Password{

    private static final String REGEX = "[A-C1-5\\s]";

    public PasswordFuerte() {
        super(REGEX);
    }
}
