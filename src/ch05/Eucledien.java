package ch05;

import java.util.Scanner;
public class Eucledien {
    public static void main(String[] args) {
        int a, b, c;
       Scanner in = new Scanner(System.in);
       
        System.out.print("Input Nilai 1 = ");
        a = in.nextInt();
        
        System.out.print("Input Nilai 2 = ");
        b = in.nextInt();
        
        c = a % b;
        while (c != 0) {
            a = b;
            b = a;
            c = a % b;
        }
        System.out.println("Eucledien = " + b); 
    } 
}
