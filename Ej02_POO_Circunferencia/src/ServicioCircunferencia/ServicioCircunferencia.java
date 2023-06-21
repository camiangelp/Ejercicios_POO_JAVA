package ServicioCircunferencia;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
se deben crear los siguientes métodos:

c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
public class ServicioCircunferencia {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n"); //el delimiter es para usa espacio en cadena de caracter
    
    public Circunferencia crearCircunferencia(){
        System.out.println("Ingrese radio ");
        double radio = leer.nextDouble();
        
        return new Circunferencia(radio);
    }
    
    public void area(Circunferencia radio){
        System.out.println("El área de la circunferencia es: " + Math.PI * Math.pow(radio.getRadio(), 2));
    }
    
    public void perimetro(Circunferencia radio){
        System.out.println("El perímetro de la circunferencia es: " + 2 * Math.PI * radio.getRadio() );
        
    }
}
