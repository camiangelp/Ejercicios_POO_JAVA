/*
EJ 1:
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package ej01_poo_libros;

import Entidad.Libro;
import Servicio_Libro.LibroServicio;

public class Ej01_POO_Libros {

    public static void main(String[] args) {
        LibroServicio ls= new LibroServicio();
        Libro libro1= ls.crearLibro();
        ls.mostrarLibro(libro1);
    }
    
}
