package ch04;

public class ArrayC {
    public static void main(String[] args) {
       int [] nilai = {82,12,41,38,19,26,9,48,20,55,8,32,3};

        System.out.print("Bilangan Ganjil = ");
        for(int a = 0; a < nilai.length; a++) {
            if(nilai[a] % 2 != 0) {
                System.out.print(nilai[a] + " ");   
            }
        }
    }
}