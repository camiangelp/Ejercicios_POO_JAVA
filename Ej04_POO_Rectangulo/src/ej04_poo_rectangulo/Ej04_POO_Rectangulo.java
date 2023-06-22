
package ej04_poo_rectangulo;

import Entidad.Rectangulo;
import ServiciosRectangulo.ServiciosRectangulo;

/**
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
 */
public class Ej04_POO_Rectangulo {

    public static void main(String[] args) {
        ServiciosRectangulo sr= new ServiciosRectangulo();
        Rectangulo rec = sr.crearRectangulo();
        sr.calcularSuperficie(rec);
        sr.calcularPerimetro(rec);
        sr.DibujarRectangulo(rec);
    }
    
}
