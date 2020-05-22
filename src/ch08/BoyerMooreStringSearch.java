package ch08;

public class BoyerMooreStringSearch {
 static int NO_OF_CHARS = 789; 
     static int max (int a, int b) { return (a > b)? a: b; } 
     static void badCharHeuristic( char []test, int in,int badchar[]) 
     {   
      for (int c = 0; c < NO_OF_CHARS; c++) 
           badchar[c] = -1; 
  
      for (int c = 0; c < in; c++) 
           badchar[(int) test[c]] = c; 
     }
     static void search( char txt[],  char pat[]) 
     { 
      int d = pat.length; 
      int e = txt.length; 
  
      int badchar[] = new int[NO_OF_CHARS];
      badCharHeuristic(pat, d, badchar); 
  
      int f = 0; 
      while(f <= (e - d)) 
      { 
            int j = d-1; 
  
      
            while(j >= 0 && pat[j] == txt[f+j]) 
              j--; 
  
            if (j < 0) 
            { 
            System.out.println("Pola Yang Terjadi = " + f); 
             f += (f+d < e)? d-badchar[txt[f+d]] : 1; 
        } 
            else       
             f += max(1, j - badchar[txt[f+j]]); 
        } 
    }
    public static void main(String []args) { 
        char txt[] = "ABAAABCDEFG".toCharArray(); 
        char pat[] = "CDEFG".toCharArray(); 
        search(txt, pat); 
    } 
}  