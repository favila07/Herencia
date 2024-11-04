/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Formas;

/**
 *
 * @author Real Madrid
 */
public class Formas {

    public static void main(String[] args) {
    
        Formas[] formas = new Formas[4];
        formas[0] = new Circulo(5);
        formas[1] = new Linea(10);
        formas[2] = new Triangulo(4, 6);
        formas[3] = new Cuadrado(3);
        
        for (Formas forma : formas){
            forma.dibujar();
            System.out.println("Area: " + forma.calcularArea());
        }
    }
}
    
    


public abstract class Formas {
        
public abstract void dibujar();
public abstract double calcularArea();
   
       
}
}
    