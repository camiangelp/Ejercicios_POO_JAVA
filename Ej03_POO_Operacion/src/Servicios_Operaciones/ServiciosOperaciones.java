package Servicios_Operaciones;

import Entidad.Operacion;
import java.util.Scanner;

/**
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
public class ServiciosOperaciones {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n"); //el delimiter es para usa espacio en cadena de caracter
    
    public Operacion crearOperacion(){
        System.out.println("Ingrese primer número: ");
        int numero1= leer.nextInt();
        System.out.println("Ingrese segundo número: ");
        int numero2= leer.nextInt();
        
        return new Operacion(numero1, numero2);
    }
    
    public int sumar(Operacion oper){
        return oper.getNumero1()+oper.getNumero2();
    }
    public int resta(Operacion oper){
       return oper.getNumero1() - oper.getNumero2();
   }
   
   public int multiplicar(Operacion oper){
       if(oper.getNumero1()==0 || oper.getNumero2()==0)
           return 0;
       else
           return oper.getNumero1()*oper.getNumero2();
   }
   
   public double dividir(Operacion oper){
       if(oper.getNumero1()==0 || oper.getNumero2()==0)
           return 0;
       else
           return (double)oper.getNumero1()/oper.getNumero2();
   }
}
