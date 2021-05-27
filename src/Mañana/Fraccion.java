package Mañana;

public class Fraccion {

    private int numerador;

    private int denominador;


    public Fraccion() {
        numerador = 0;
        denominador = 1;
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        if(denominador == 0){
            throw new RuntimeException("Denominador no puede ser cero");
        }
        this.denominador = denominador;
    }

    public Fraccion(Fraccion fraccion) {
        this.numerador = fraccion.getNumerador();
        this.denominador = fraccion.getDenominador();
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        if(denominador == 0){
            throw new RuntimeException("Denominador no puede ser cero");
        }
        this.denominador = denominador;
    }

    public void sumar(int x){
        this.numerador = this.numerador + (x * this.denominador);
    }

    public void sumar(Fraccion f2){
        this.adicionSubstraccion(true, f2);
    }

    public void restar(int x){
        this.numerador = this.numerador - (x * this.denominador);
    }

    public void restar(Fraccion f2){
        this.adicionSubstraccion(false, f2);
    }

    private void adicionSubstraccion(Boolean esSuma, Fraccion f2){
        int a = this.numerador * f2.getDenominador();
        int b = this.denominador * f2.getNumerador();
        int c = this.denominador * f2.getDenominador();
        this.denominador = c;
        if(esSuma)
            this.numerador = a + b;
        else
            this.numerador = a - b;
    }

    public void producto(int x){
        this.numerador = this.numerador * x;
    }

    public void producto(Fraccion f2){
        this.numerador = this.numerador * f2.getNumerador();
        this.denominador = this.denominador * f2.getDenominador();
    }

    public void cociente(int x){
        this.denominador = this.denominador * x;
    }

    public void cociente(Fraccion f2){
        this.numerador = this.numerador * f2.getDenominador();
        this.denominador = this.denominador * f2.getNumerador();
    }
}
