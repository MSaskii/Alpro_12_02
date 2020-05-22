package ch08;

import java.util.Scanner;
public class LongestCommonSubstringProblem {
    static void printLCSubStr(String A, String B, int c, int d) 
    { 
        int[][] LCSuff = new int[c + 1][d + 1]; 
        int test = 0, coba = 0, bre = 0; 
  
        for (int e = 0; e <= c; e++) { 
            for (int f = 0; f <= d; f++) { 
                if (e == 0 || f == 0) 
                    LCSuff[e][f] = 0; 
  
                else if (A.charAt(e - 1) == B.charAt(f - 1)) { 
                    LCSuff[e][f] = LCSuff[e - 1][f - 1] + 1; 
                    if (test < LCSuff[e][f]) { 
                        test = LCSuff[e][f]; 
                        coba = e; 
                        bre = f; 
                    } 
                } 
                else
                    LCSuff[e][f] = 0; 
            } 
        } 
        if (test == 0) { 
            System.out.println("Tidak Ada Substring"); 
            return; 
        } 
        String resultStr = ""; 

        while (LCSuff[coba][bre] != 0) { 
            resultStr = A.charAt(coba - 1) + resultStr;  
            --test; 
  
            coba--; 
            bre--; 
        }    
        System.out.println(resultStr); 
    }
    public static void main(String args[])  { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Kata 1 = ");
        String A = sc.nextLine();
        System.out.print("Input Kata 2 = ");
        String B = sc.nextLine();
  
        int c = A.length(); 
        int d = B.length(); 
  
        printLCSubStr(A, B, c, d); 
    } 
} 

