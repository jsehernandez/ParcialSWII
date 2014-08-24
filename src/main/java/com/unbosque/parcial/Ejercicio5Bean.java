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
@ManagedBean(name = "ejercicio5")
public class Ejercicio5Bean {

    private int R;
    private int H;
    private String res;

    public int getR() {
        return R;
    }

    public void setR(int R) {
        this.R = R;
    }

    public int getH() {
        return H;
    }

    public void setH(int H) {
        this.H = H;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public void area() {
        if (R == 0 || H == 0) {
            res = "Los valores deben ser mayores que 0";
        } else if (R < 0 || H < 0) {
            res = "Los valores deben ser mayores que 0";
        } else {
            Double area = 2 * (Math.PI) * R * (H+R);
            res = area.toString();
        }
    }

    public void volumen() {
        if (R == 0 || H == 0) {
            res = "Los valores deben ser mayores que 0";
        } else if (R < 0 || H < 0) {
            res = "Los valores deben ser mayores que 0";
        } else {
            Double volumen = (Math.PI) * (Math.pow(R, 2)) * H;
            res=volumen.toString();
        }
    }
}
