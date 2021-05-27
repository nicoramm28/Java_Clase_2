public class CuentaCorriente {

    private int numero;

    private double saldo;

    public CuentaCorriente() {
        saldo = 0;
    }

    public CuentaCorriente(int saldo, int numero) {
        this.saldo = saldo;
        this.numero = numero;
    }

    public CuentaCorriente(CuentaCorriente cuenta) {
        this.saldo = cuenta.getSaldo();
        this.numero = cuenta.getNumero();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingreso(){

    }

    public void egreso(){

    }

    public void reitegro(){

    }

    public void transferencia(){

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
