package ch04;

public class ArrayM {
    public static void main(String[] args) {
        int [] nilai = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        int a, b, c, Hasil;
        
        for(int d = 0; d < nilai.length; d++) {
        }
        System.out.print("Angka Selisih Pada Poin I = ");
        a = nilai[0] - nilai[1];
        System.out.print(a + " ");
        
        b = nilai[7] - nilai[8];
        System.out.print(b + " ");
        
        c = nilai[10] - nilai[11];
        System.out.print(c + " ");
        System.out.println();
        
        Hasil = a + b + c;
        System.out.println("Jumlah Angka Selisih = " + Hasil);
    }
}