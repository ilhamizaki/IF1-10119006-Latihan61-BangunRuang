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
 * Deskripsi Program : class Kerucut dengan extends BangunRuang untuk menghitung
 *                     volume Kerucut
 */
public class Kerucut extends BangunRuang{
    private final float tinggi;
    private final float radius;

    public Kerucut(int tinggi, int radius) {
        this.tinggi = tinggi;
        this.radius = radius;
    }

    @Override
    float hitungVolume() {
        return (float) (0.3 * Math.PI * Math.pow(radius, 2) * tinggi);
    }
}
