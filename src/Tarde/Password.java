package Tarde;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Password {

    private Pattern pattern;

    private String password;

    public Password(String regex){
        this.pattern = Pattern.compile(regex);
    }

    public void setValue(String pwd){
        if(this.pattern == null){
            throw new RuntimeException("Regular expression must be defined to create a new password");
        }
        Matcher matcher = this.pattern.matcher(pwd);
        if(matcher.find()){
            this.password = pwd;
            System.out.println("Password changed successfully");
        }else{
            throw new PatternSyntaxException("The password doesn't match with the regular expression", this.pattern.toString(), -1);
        }
    }

}
