/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.unbosque.parcial;


import javax.faces.bean.ManagedBean;

/**
 *
 * @author user
 */
@ManagedBean(name="ejercicio3")
public class Ejercicio3Bean {
    
    private int N;
    private int Suma;
    private int sumaT;

    public int getSumaT() {
        return sumaT;
    }
    
    public Ejercicio3Bean() {
    }
    public void sumatoria(){  
        while(N<=10){
            Suma+=N;
            N++;
        }
        sumaT=Suma;
    }
    
}
