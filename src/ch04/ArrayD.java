package ch04;

public class ArrayD {
    public static void main(String[] args) {
    int [] nilai = {82,12,41,38,19,26,9,48,20,55,8,32,3};
    
    for(int a = 1; a < nilai.length; a++) {
        if (nilai[a] % 3 == 0) {
            System.out.println(nilai[a] + " Bilangan Kelipatan 3");
            }
        } 
    }
}