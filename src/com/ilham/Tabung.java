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
 * Deskripsi Program : class Tabung dengan extends BangunRuang untuk menghitung
 *                     volume Tabung
 */
public class Tabung extends BangunRuang{
    
    private final float radius;
    private final float tinggi;

    public Tabung(int radius, int tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    @Override
    float hitungVolume() {
        return (float) (Math.PI * Math.pow(radius, 2) * tinggi);
    }
}
