import Tarde.Password;
import Tarde.PasswordFuerte;

import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {

        System.out.println("##### ##### ##### #####");
        Boolean salir = false;
        Scanner scanner = new Scanner(System.in);
        while(!salir){
            System.out.println("Ingrese una expresión regular : ");

            String regex = scanner.nextLine();
            Password password = new Password(regex);

            System.out.println("\nAhora ingrese una contraseña : ");
            String pwd = scanner.nextLine();
            password.setValue(pwd);

            System.out.println("\nDesea salir? (y/n) : ");
            String input = scanner.nextLine();
            salir = input.equals("y");
        }
        scanner.close();
    }
}
