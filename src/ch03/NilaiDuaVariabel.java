package ch03;

import java.util.Scanner;
public class NilaiDuaVariabel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input Nilai x = ");
        int x = in.nextInt();
        
        System.out.print("Input Nilai y = ");
        int y = in.nextInt();
        
        if (x > y) {
            System.out.println(x + " Lebih besar dari " + y);
        } else {
            System.out.println(y + " Lebih besar dari " + x);
        }
    } 
}