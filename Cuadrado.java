/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formas;

/**
 *
 * @author Real Madrid
 */
public class Cuadrado extends Formas {
    private double lado;
    
    public Cuadrado(double lado){
        this.lado = lado;
    }
    @Override
    public void dibujar(){
        System.out.println("Dibujando un Cuadrado");
    }
    @Override
    public double calcularArea(){
        return lado * lado;
    }
}
