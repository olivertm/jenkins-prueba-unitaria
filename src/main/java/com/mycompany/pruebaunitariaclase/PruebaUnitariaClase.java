/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebaunitariaclase;

/**
 *
 * @author olivertm
 */
public class PruebaUnitariaClase {
    public int numero_mayor(int a, int b, int c) { 
        if (a > b && a > c) {
            return a;
        } else if (c > b) {
            return c; 
        } else {
            return b; 
        }
    }
    
}
