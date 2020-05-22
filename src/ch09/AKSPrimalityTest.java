package ch09;

import java.util.Scanner;
public class AKSPrimalityTest {
    public static void main(String[] args) {

        try {
            System.out.print("Input Angka = ");
            Scanner in = new Scanner(System.in);

            int a; 
            int nilai = Integer.parseInt(in.nextLine());

            for (a = 1; nilai <= a;) {
                System.out.println(nilai + " Bukan Angka Prima!");
                break;
            }
            for (a = 2; a < nilai; a++) {  
                int b = nilai % a;         
                if (b == 0) {                 
                    System.out.println(nilai + " Bukan Angka Prima!");
                    break;
                }  
            }
            if(a == nilai) { 
                System.out.println(nilai + " Angka Prima!");
            }
        }
        catch(NumberFormatException nfe) {
            System.out.println("Ini Bukan Angka!");
        }
    }
}