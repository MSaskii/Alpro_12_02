/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02;

import java.util.Date;
public class Produk {
    String barcode;
    String nama;
    Date tanggalKedaluarsa;
    double harga;
    
    public String getBarcode() {
        return barcode;
    }
    public String getNama() {
        return nama;
    }
    public Date getTanggalKedaluarsa() {
        return tanggalKedaluarsa;
    }
    public double getHarga() {
        return harga;
    }
}
