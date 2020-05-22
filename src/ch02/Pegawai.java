/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02;

public class Pegawai {
    String nik;
    String nama;
    String jabatan;
    boolean isAktif;
    
    public String getNik() {
        return nik;
    }
    public String getNama() {
        return nama;
    }
    public String getJabatan() {
        return jabatan;
    }
    public boolean isAktif() {
        return isAktif;
    }
    public void cetak() {
        System.out.println("NIK : " + nik);
        System.out.println("Nama : " + nama);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Status : " + isAktif);
        
    }
}
