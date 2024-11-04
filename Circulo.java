/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formas;

/**
 *
 * @author Real Madrid
 */
public class Circulo extends Formas {
    private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    @Override
    public void dibujar(){
        System.out.println("Dibujando un Cinculo");
    }
    
    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }
}

