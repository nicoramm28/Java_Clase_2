import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

    /*
    Ejercicio 6
Partiendo de la clase StringUtil (que usamos para resolver Radix Sort), agregar los siguientes métodos estáticos:
● public static String rpad(String s,char c,int n); idem lpad, pero agregando caracteres a la derecha.

● public static String ltrim(String s); Retorna una cadena idéntica a s pero sin espacios a la izquierda.
● public static String rtrim(String s); idem ltrim, pero sin espacios a la derecha.
● public static String trim(String s); idem lpad, pero sin espacios a derecha ni izquierda.
● public static int indexOfN(String s,char c,int n); Retorna la posición de la n-ésima
ocurrencia del carácter c dentro de s, o -1 si s no contiene a c. Por ejemplo, si s = “John|Paul|George|Ringo”, c = ‘|’ y n=2, la función debe retornar la posicióon de la
segunda ocurrencia del carácter ‘|’ (pipe) dentro de la cadena s. Que, en este caso, es: 9.

     */

    private GregorianCalendar gregorianCalendar;

    public Fecha() {
        this.gregorianCalendar = new GregorianCalendar();
    }

    public Fecha(int dia, int mes, int año) {
        this.gregorianCalendar = new GregorianCalendar(año, mes, dia);
    }

    public Fecha(Fecha fecha) {
        this.gregorianCalendar = new GregorianCalendar(fecha.getAño(), fecha.getMes(), fecha.getDia());
    }

    public int getDia() {
        return this.gregorianCalendar.get(Calendar.DATE);
    }

    public void setDia(int dia) {
        this.gregorianCalendar.set(Calendar.DATE, dia);
    }

    public int getMes() {
        return this.gregorianCalendar.get(Calendar.MONTH);
    }

    public void setMes(int mes) {
        this.gregorianCalendar.set(Calendar.MONTH, mes);
    }

    public int getAño() {
        return this.gregorianCalendar.get(Calendar.YEAR);
    }

    public void setAño(int año) {
        this.gregorianCalendar.set(Calendar.YEAR, año);
    }

    @Override
    public String toString() {
        return this.gregorianCalendar.get(Calendar.DATE) + "/" +
                this.gregorianCalendar.get(Calendar.MONTH) + "/" +
                this.gregorianCalendar.get(Calendar.YEAR);
    }

    public void sumarDia(){
        this.gregorianCalendar.add(Calendar.DATE, 1);
    }
}
