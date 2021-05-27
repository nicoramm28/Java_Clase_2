public class Contador {

    private int i;

    public Contador() {
        this.i = 0;
    }

    public Contador(int i) {
        this.i = i;
    }

    public Contador(Contador contador) {
        this.i = contador.getI();
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void incrementar(){
        this.i++;
    }

    public void decrementar(){
        this.i--;
    }
}
