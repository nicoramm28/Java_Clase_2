package Tarde.Ejercicio2;

public class Circulo extends FiguraGeometrica{

    private double diametro;

    public Circulo(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public double area() {
        double radio = this.diametro/2;
        return Math.PI * Math.pow(radio, 2);
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
}
