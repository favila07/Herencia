/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formas;

/**
 *
 * @author Real Madrid
 */
class Triangulo extends Formas{
    private double base;
    private double altura;
    
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void dibujar(){
        System.out.println("Dibujando un triangulo");
    }
    @Override
    public double calcularArea(){
        return (base * altura)/2;
    }
}
