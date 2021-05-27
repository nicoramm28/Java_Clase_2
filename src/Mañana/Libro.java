package Mañana;

public class Libro {

    private String titulo;

    private int isbn;

    private String autor;

    private Boolean disponible;

    public Libro(String titulo, int isbn, String autor, Boolean disponible) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.disponible = disponible;
    }

    public Libro() {
        this.titulo = "Mañana.Libro nuevo";
        this.isbn = 0;
        this.autor = "Autor pendiente";
        this.disponible = false;
    }

    public Libro(Libro libro) {
        this.titulo = libro.getTitulo();
        this.isbn = libro.getIsbn();
        this.autor = libro.getAutor();
        this.disponible = libro.getDisponible();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public void prestamo(){
        if(this.disponible)
            this.disponible = false;
        else
            throw new RuntimeException("EL LIBRO NO ESTA DISPONIBLE PARA PRESTAMO");
    }

    public void devolucion(){
        this.disponible = true;
    }

    @Override
    public String toString() {
        return this.titulo + ", " + this.isbn + ", " + this.autor;
    }


}
