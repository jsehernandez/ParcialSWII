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
@ManagedBean(name="ejercicio4")
public class Ejercicio4Bean {

    private int catA;
    private int catB;
    private String res;
    public int getCatA() {
        return catA;
    }

    public void setCatA(int catA) {
        this.catA = catA;
    }

    public int getCatB() {
        return catB;
    }

    public void setCatB(int catB) {
        this.catB = catB;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }
    
    public void hipotenusa(){
        if(catA==0 || catB==0){
            res="Los Catetos deben ser diferentes de 0";
        }else if(catA<0||catB<0){
            res="Los Catetos deben ser mayores que 0";
        }else{
            Double hip=Math.sqrt((Math.pow(catA, 2))+(Math.pow(catB, 2)));
            res=hip.toString();
            
        }
    }
}
