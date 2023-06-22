
package ServiciosRectangulo;

import Entidad.Rectangulo;
import java.util.Scanner;


public class ServiciosRectangulo {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n"); //el delimiter es para usa espacio en cadena de caracter
    
    public Rectangulo crearRectangulo(){
        System.out.println("Ingrese la base:");
        double base= leer.nextDouble();
        System.out.println("Ingrese la altura: ");
        double altura = leer.nextDouble();
        
        return new Rectangulo(base, altura);
    }
    
    public void calcularSuperficie(Rectangulo r1){
        System.out.println("La superficie es: " + (r1.getAltura()*r1.getBase()));
    }
    
    public void calcularPerimetro(Rectangulo r1){
        System.out.println("El perimetro es: " + ((r1.getAltura()+r1.getBase())*2));
    }
    
    public void DibujarRectangulo(Rectangulo r1){
        System.out.println("Rectángulo de base " + r1.getBase() + " y altura " + r1.getAltura());
        for (int i = 0; i < r1.getAltura(); i++) {
            for (int j = 0; j < r1.getBase(); j++) {
                if(i==0 || i==r1.getAltura()-1 || j== 0 || j==r1.getBase()-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }    
}
    
