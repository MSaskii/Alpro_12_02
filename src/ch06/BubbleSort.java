package ch06;

public class BubbleSort {

    public static void main(String[] args) {
        int[] nilai = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        
        System.out.print("Nilai Array Urut = ");
        for (int a = 0; a < nilai.length-1; a++) {
            for (int b = a+1; b < nilai.length; b++) {
                if (nilai[a] > nilai[b]) {
                    int data = nilai[a];
                    nilai[a] = nilai[b];
                    nilai[b] = data;  
                }
            }
        }
        for (int a = 0; a < nilai.length; a++) {
            System.out.print(nilai[a] + " ");
            }
        }   
    }