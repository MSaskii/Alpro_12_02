/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02;

public class ObjectMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nim = "10201";
        mhs.nama = "Andi";
        mhs.alamat = "Jl. Sudirman No.123";
        mhs.hp = "081234567890";
        mhs.cetak();
    }
   
}
