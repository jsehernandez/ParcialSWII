package com.unbosque.parcial;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;

/**
 *
 * @author user
 */
@ManagedBean(name = "ejercicio2")
public class Ejercicio2Bean {

    private int a;
    private int b;
    private int c;
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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public Ejercicio2Bean() {
    }

    public void Mayor() {
        if (a == b && b == c) {
            res = "deben ser diferentes";
        } else if (a > b && a > c) {
            res = "a es el mayor";
        } else if (b > a && b > c) {
            res = "b es el mayor";
        } else {
            res = "c es el mayor";
        }
    }

}
