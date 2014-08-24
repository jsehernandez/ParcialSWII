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
@ManagedBean(name = "ejercicio8")
public class Ejercicio8Bean {

    private int a;
    private int b;
    private String res;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public void Ordenar() {
        if (a==b) {
            res ="ingrese valores diferentes";
        } else if (a > b) {
            res = "Orden: " + b + "," + a;
        } else {
            res = "Orden: " + a + "," + b;
        }
    }

}
