package ch07;

public class MergeSort {
    public static void main(String[] args) {
        int[] nilai = {82,12,41,38,19,26,9,48,20,55,8,32,3};
      
            System.out.println("Angka Sebelum Pengurutan = ");
            for(int a = 0; a < nilai.length; a++) {

                System.out.print(nilai[a]+ " ");
            }
            System.out.println();
            test(nilai, 0, nilai.length-1);
            System.out.println();   
            System.out.println("Angka Setelah Pengurutan = ");
            for(int a = 0; a < nilai.length; a++)
        {
            System.out.print(nilai[a] + " ");
    }
}
    public static void test(int[] test, int b, int c) { 
        int low  = b;
        int high = c;
        if (low >= high) {
        return;
    }
    int middle = (low+high)/2;
    test(test, low, middle);
    test(test, middle+1, high);
    int end_low = middle;
    int start_high = middle+1;
    while ((b <= end_low) && (start_high <= high))
    {
        if (test[low]<test[start_high]) {
           low++;
        }
        else {
            int data = test[start_high];
            for (int d = start_high-1;d >= low; d--) {
              test[d+1] = test[d];
           }
            test[low] = data;
            low++;
            end_low++;
            start_high++;
            }
        }
    }  
}