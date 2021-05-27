import Tarde.Password;
import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {

        System.out.println("##### ##### ##### #####");
        System.out.println("Ingrese una expresión regular : ");

        Scanner scanner = new Scanner(System.in);
        String regex = scanner.nextLine();
        Password password = new Password(regex);

        System.out.println("\nAhora ingrese una contraseña : ");
        String pwd = scanner.nextLine();
        password.setValue(pwd);

    }
}
