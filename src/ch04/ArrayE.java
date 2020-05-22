package ch04;

public class ArrayE {
    public static void main(String[] args) {
        int[] nilai = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        
        System.out.print("Array Yang memiliki Angka 2 = ");
        for (int a = 0; a < nilai.length; a++) {
            if (nilai[a] % 10 == 2 || nilai[a] / 10 == 2) {
                
                System.out.print(nilai[a] + " ");
                }
            }
        }
    }