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
@ManagedBean(name="ejercicio7")
public class Ejercicio7Bean {

   private int nota;
   private String res;

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }
    
    public void calificacion(){
        if (nota == 0) {
            res = "Los valores deben ser mayores que 0";
        } else if (nota < 0 ) {
            res = "Los valores deben ser mayores que 0";
        } else {
          if(nota==19||nota==20){
              res="A";
          }else if(nota>=16 &&nota<=18){
              res="B";
          }else if(nota>=13 &&nota<=15){
              res="C";
          }else if(nota>=10 &&nota<=12){
              res="D";
          }else{
              res="E";
          }
        }
    }
   
    
}
