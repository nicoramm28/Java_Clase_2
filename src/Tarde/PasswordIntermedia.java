package Tarde;

public class PasswordIntermedia extends Password{

    private static final String REGEX = "[aeiou]";

    public PasswordIntermedia() {
        super(REGEX);
    }
}
