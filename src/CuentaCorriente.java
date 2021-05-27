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

    public void ingreso(double adicion){
        this.saldo = this.saldo + adicion;
    }

    public void egreso(double substracion){
        this.saldo = this.saldo - substracion;
    }

    public void reitegro(double reintegro){
        this.ingreso(reintegro);
    }

    public void transferencia(double transferencia){
        this.egreso(transferencia);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
