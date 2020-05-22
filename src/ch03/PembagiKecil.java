package ch03;

import java.util.Scanner;
public class PembagiKecil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input Bilangan = ");
        int bil = in.nextInt();
        
        if (bil > 0 && bil <= 2) {
            System.out.println("Pembagi Terkecil = " + bil);
        } else {
            for (int a = 4; a <= bil; a ++) {
                if (bil % a == 0) {
                    System.out.println("Pembagi Terkecil = " + a);
                    break;
                }
            }
        }
    }
}