package ch03;

import java.util.Scanner;
public class NilaiTigaVariabel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        System.out.print("Input Nilai x = ");
        int x = in.nextInt();
        
        System.out.print("Input Nilai y = ");
        int y = in.nextInt();
        
        System.out.print("Input Nilai z = ");
        int z = in.nextInt();
        
        if (x > y && x > z) {
            System.out.println(x + " Merupakan Nilai Tertinggi");
        } else if (y > x && y > z) {
            System.out.println(y + " Merupakan Nilai Tertinggi");
        } else {
            System.out.println(z + " Merupakan Nilai Tertinggi");
        }
    }
}