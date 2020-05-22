/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02;

public class Trapesium {
    double alasBawah, alasAtas, tinggi;
    double luas() {
        return tinggi * (alasAtas + alasBawah) / 2;
    }
}
