package ch04;

public class ArrayI {
    public static void main(String[] args) {
        int[] nilai = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        int Hasil;
        
        for (int a = 0; a < nilai.length-1; a++) {
            Hasil = nilai[a] - nilai[a+1];
            if(Hasil % 1 == 0) {
                System.out.println("Angka Sebelum = " + nilai[a] + " Angka Sesudah = " + nilai[a+1] + " Selisih = " + Hasil);
                }
            }        
        }
    }  