package Tarde.Ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        System.out.println("##### ##### ##### #####");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Creando circulo... ingrese diametro : ");
        double diametro = scanner.nextDouble();
        Circulo circulo = new Circulo(diametro);

        System.out.println("Creando triangulo... ingrese lado 1: ");
        double lado1 = scanner.nextDouble();
        System.out.println("ingrese lado 2: ");
        double lado2 = scanner.nextDouble();
        System.out.println("ingrese lado 3: ");
        double lado3 = scanner.nextDouble();
        System.out.println("ingrese la altura: ");
        double altura = scanner.nextDouble();
        Triangulo triangulo = new Triangulo(lado1,lado2,lado3, altura);

        System.out.println("Creando rectangulo... ingrese largo : ");
        double largo = scanner.nextDouble();
        System.out.println("ingrese ancho : ");
        double ancho = scanner.nextDouble();
        Rectangulo rectangulo = new Rectangulo(largo, ancho);

        FiguraGeometrica[] arr = {circulo, triangulo, rectangulo};
        System.out.println("El Area promedio de las figuras es " + AreaUtils.areaPromedio(arr));


        scanner.close();
    }
}
