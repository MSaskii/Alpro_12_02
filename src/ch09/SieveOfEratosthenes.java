package ch09;

import java.util.Scanner;
public class SieveOfEratosthenes {
    void SieveOfEratosthenes(int c) 
    { 
        boolean prima[] = new boolean[c+1]; 
        for(int a = 0; a <c; a++)
            prima[a] = true; 
        for(int b = 2; b*b <= c; b++) { 
            
            if(prima[b] == true) 
            { 
                for(int a = b*2; a <= c; a += b) 
                    prima[a] = false; 
            } 
        } 
        for(int a = 2; a <= c; a++) 
        { 
            if(prima[a] == true) 
                System.out.print(a + " "); 
        } 
    } 
    public static void main(String args[])  { 
        
        Scanner in = new Scanner (System.in);
        System.out.print("Input Bilangan Prima = "); 
        int c = in.nextInt();
        
        System.out.println("Hasil SOE = " + c); 
        SieveOfEratosthenes g = new SieveOfEratosthenes(); 
        g.SieveOfEratosthenes(c); 
    } 
} 