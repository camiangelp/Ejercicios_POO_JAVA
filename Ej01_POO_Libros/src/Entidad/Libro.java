package Entidad;
/**
 * ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío.
 */
public class Libro {
    public String ISBN;
    public String titulo;
    public String autor;
    public int numPaginas;

    public Libro() {
    }
    
    public Libro(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    
    
}
