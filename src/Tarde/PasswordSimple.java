package Tarde;

public class PasswordSimple extends Password{

    private static final String REGEX = "[1-3]";

    public PasswordSimple() {
        super(REGEX);
    }
}
