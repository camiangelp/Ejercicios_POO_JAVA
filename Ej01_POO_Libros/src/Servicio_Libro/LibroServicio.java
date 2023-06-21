
package Servicio_Libro;

import Entidad.Libro;
import java.util.Scanner;

/**
Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
public class LibroServicio {
    public Scanner leer = new Scanner(System.in).useDelimiter("\n"); //el delimiter es para usa espacio en cadena de caracter
    
    public Libro crearLibro(){
        
        
        System.out.println("Por favor ingrese el ISBN");
        String ISBN = leer.next();
        System.out.println("Por favor ingrese el título");
        String titulo = leer.next();
        System.out.println("Por favor ingrese el autor");
        String autor = leer.next();
        System.out.println("Por favor ingrese el número de páginas");
        int numPaginas = leer.nextInt();
        Libro l1= new Libro(ISBN, titulo, autor, numPaginas);
        
        return l1;
    }
    
    public void mostrarLibro(Libro l1){
        System.out.println("El ISBN del libro es: " + l1.ISBN);
        System.out.println("El títulodel libro es: " + l1.titulo);
        System.out.println("El autor del libro es: " + l1.autor);
        System.out.println("El número de páginas del libro es: " + l1.numPaginas);
    }
}
