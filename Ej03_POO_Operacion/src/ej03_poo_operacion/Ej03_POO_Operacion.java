package ej03_poo_operacion;

import Entidad.Operacion;
import Servicios_Operaciones.ServiciosOperaciones;

/**
 Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. 
A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
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
public class Ej03_POO_Operacion {

    public static void main(String[] args) {
        ServiciosOperaciones opServ= new ServiciosOperaciones();
        Operacion op = opServ.crearOperacion();
        System.out.println(op.getNumero1() + " + " + op.getNumero2() + " = "+opServ.sumar(op));
        System.out.println(op.getNumero1() + " - " + op.getNumero2() + " = "+opServ.resta(op));
        int mult = opServ.multiplicar(op);
        double div = opServ.dividir(op);
        if(mult == 0)
            System.out.println("Error al intentar multiplicar por 0");
        else
            System.out.println(op.getNumero1() + " * " + op.getNumero2() + " = "+ mult);
        if(div == 0)
            System.out.println("Error al intentar dividir por 0");
        else
            System.out.println(op.getNumero1() + " / " + op.getNumero2() + " = "+ div);
    }
    
}
