package Tarde.Ejercicio2;

public class AreaUtils {

    public static double areaPromedio(FiguraGeometrica[] arr){
        double areaTotal = 0;
        for (FiguraGeometrica figura : arr) {
            areaTotal += figura.area();
        }
        return areaTotal/arr.length;
    }
}
