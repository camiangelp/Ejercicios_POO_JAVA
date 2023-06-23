
package ServiciosVehiculo;

import Entidades.Vehiculo;
import java.util.Scanner;

public class ServiciosVehiculo {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Vehiculo createVehiculo(){
        System.out.println("Ingrese marca: ");
        String marca= leer.next();
        //System.out.println("Ingrese modelo: ");
        //String modelo= leer.next();
        System.out.println("Ingrese año: ");
        int año = leer.nextInt();
        System.out.println("Ingrese tipo: ");
        String tipo= leer.next();
        
        return new Vehiculo(marca,año,tipo);
    }
    
    public double Moverse(Vehiculo v1, int seg){
        double avance;
        switch (v1.getTipo()) {
            case "automovil":
                System.out.println("El automovil avanzó: "+ 3*seg+ " metros");
                avance=3*seg;
                break;
            case "motocicleta":
                System.out.println("La moto avanzó: "+ 2*seg+ " metros");
                avance=2*seg;
                break;  
            case "bicicleta":
                System.out.println("La bici avanzó: "+ 1*seg+ " metros");
                avance=1*seg;
                break;
            default:
                System.out.println("Ingrese una opción correcta");
                avance=0;
        }
        
        return avance;
    }
    
    public void Frenar(Vehiculo v1, double av){
        if (v1.getTipo().equals("bicicleta")) {
            System.out.println("La bicicleta avanzó " + av + " metros en total");
        } else if(v1.getTipo().equals("motocicleta")){
            System.out.println("El vehículo "+ v1.getTipo()+ " avanzó "+ (av+2)+" metros en total");
        }else{
            System.out.println("El vehículo "+ v1.getTipo()+ " avanzó "+ (av+2)+" metros en total");
        }
            
    }
    
    public void Avance(Vehiculo v1,Vehiculo v2,Vehiculo v3,double av1, double av2, double av3){
        double max = Math.max(av1, Math.max(av2, av3));
        
        if (max == av1) {
            System.out.println("El vehiculo "+v1.getTipo()+ " fue el que más avanzó");
            
        }else if(max== av2){
            System.out.println("El vehiculo "+v2.getTipo()+ " fue el que más avanzó");
        }else{
            System.out.println("El vehiculo "+v3.getTipo()+ " fue el que más avanzó");
        }            
        
    }
}
