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
@ManagedBean(name = "ejercicio1")
public class Ejercicio1Bean {

    private int a;
    private int b;
    private String res;

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

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

    public Ejercicio1Bean() {
    }

    public void Mayor() {

        if (a == b) {
            res="los Argumentos deben ser diferentes";
        } else if (a > b) {
            res="a es mayor que b";
        } else {
            res="b es mayor que a";
        }

    }

}
