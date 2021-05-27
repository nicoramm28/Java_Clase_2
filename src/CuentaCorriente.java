public class CuentaCorriente {

    private double saldo;

    public CuentaCorriente() {
        saldo = 0;
    }

    public CuentaCorriente(int saldo) {
        this.saldo = saldo;
    }

    public CuentaCorriente(CuentaCorriente cuenta) {
        this.saldo = cuenta.getSaldo();
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

}
