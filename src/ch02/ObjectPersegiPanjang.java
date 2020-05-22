/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02;

public class ObjectPersegiPanjang {
    public static void main(String[] args) {
        PersegiPanjang y = new PersegiPanjang();
        y.panjang = 16;
        y.lebar = 15;
        System.out.println("Luas Persegi Panjang = " + y.luas());
        
    }
}
