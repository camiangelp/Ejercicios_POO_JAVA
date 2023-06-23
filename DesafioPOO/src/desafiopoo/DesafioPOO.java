
package desafiopoo;

import Entidades.Vehiculo;
import ServiciosVehiculo.ServiciosVehiculo;
import java.util.Scanner;

public class DesafioPOO {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ServiciosVehiculo sv= new ServiciosVehiculo();
        Vehiculo v1= sv.createVehiculo();
        Vehiculo v2= sv.createVehiculo();
        Vehiculo v3= sv.createVehiculo();
         
       
         double av1=sv.Moverse(v1, 300);
         sv.Frenar(v1, av1 );
         double av2=sv.Moverse(v2, 300);
         sv.Frenar(v1, av2 );
         double av3=sv.Moverse(v3, 300);
         sv.Frenar(v3, av3 );
         
         sv.Avance(v1, v2, v3, av1, av2, av3);
    }
    
}
