/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Adria
 */
public class Discriminante {
    //Atributos
    private double x1;
    private double x2;
    // Constructor para guardar memoria dinamica para crear objetos
    public Discriminante() {
        
    }
    //Metodos de acceso getters y setters
    //Con los getters recuperaré el valor de mis atributos
    //Con los setters introduciré el valor a mis atributos

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }
    
    
    public String discriminante (double a,double b,double c) {
     String mensaje="";
     double discri;
     discri= (b*b)-4*a*c;
     if(discri>0) {
     mensaje = "Esta ecuacion tiene dos soluciones";
     this.x1= (-b+Math.sqrt((b*b)-4*a*c))/(2*a);
     this.x2= (-b-Math.sqrt((b*b)-4*a*c))/(2*a);
     }
     if (discri==0) {
     mensaje = "Esta ecuacion tiene una solucion";
     this.x1=(-b)/(2*a);;
     }
     if (discri<0) {
     mensaje = "Esta ecuacion no tiene soluciones";
     }
     return mensaje;
    }
    public int solucion(double a,double b,double c) {
    int solucion=0;
    double discri;
     discri= (b*b)-4*a*c;
     if(discri>0) {
     solucion=2;
     }
     if (discri==0) {
     solucion=1;
     }
    return solucion;
    }
}
