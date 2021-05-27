import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

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
