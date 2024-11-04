/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formas;

/**
 *
 * @author Real Madrid
 */
public class Linea extends Formas {
    private double longitud;
    
    public Linea(double logitud) {
     this.longitud = longitud;   
    }
    @Override
    public void dibujar(){
        System.out.println("Dubujar una Linea");
    }
    @Override
    public double calcularArea(){
        return 0;
    }
}
