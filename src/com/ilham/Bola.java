/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham;

/**
 *
 * @author 
 * NAMA     : Ilham zaki
 * Kelas    : IF1
 * NIM      : 10119006
 * Deskripsi Program : class Bola dengan extends BangunRuang untuk menghitung
 *                     volume Bola
 */
public class Bola extends BangunRuang{
    
    private final float radius;

    public Bola(int radius) {
        this.radius = radius;
    }

    @Override
    float hitungVolume() {
        return (float) (1.3 * Math.PI * Math.pow(radius,3));
    }
}
