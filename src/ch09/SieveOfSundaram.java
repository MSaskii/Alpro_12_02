package ch09;

import java.util.Arrays; 
import java.util.Scanner;
public class SieveOfSundaram {
    static int SieveOfSundaram(int c) { 
 
    int cNew = (c - 2) / 2; 
    boolean marked[] = new boolean[cNew + 1];    
    Arrays.fill(marked, false); 
    for (int a = 1; a <= cNew; a++) 
    for (int b = a; (a + b + 2 * a * b) <= cNew; b++) 
        marked[a + b + 2 * a * b] = true; 
  
        if (c > 2) 
            System.out.print(2 + " "); 
        
        for (int a = 1; a <= cNew; a++) 
            if (marked[a] == false) 
                System.out.print(2 * a + 1 + " "); 
        return -1; 
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner (System.in);
        System.out.println("Input Bilangan = ");
        int c = sc.nextInt(); 
        SieveOfSundaram(c); 
        } 
    }     