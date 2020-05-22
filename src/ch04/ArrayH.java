package ch04;

public class ArrayH {
    public static void main(String[] args) {
        int [] nilai = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        int Jumlah = 0;
        
        for (int a = 0; a < nilai.length; a++) {
            Jumlah = Jumlah + nilai[a];
        }
        System.out.println("Jumlah Seluruh Angka = " + Jumlah);
        }      
    }