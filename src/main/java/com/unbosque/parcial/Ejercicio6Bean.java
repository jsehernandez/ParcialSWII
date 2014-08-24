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
@ManagedBean(name="ejercicio6")
public class Ejercicio6Bean {

    private int N;
    private String res;

    public String getRes() {
        return res;
    }

    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
    }
    
    public void parImpar(){
        if(N%2==0){
            res="El numero es par";
        }else{
            res="El numero es impar";
        }
    }
}
