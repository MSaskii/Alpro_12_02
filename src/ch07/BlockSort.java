package ch07;

public class BlockSort {
    private BlockSort(int[] nilai) {
        int x = nilai.length;
        for (int a = 1; a < x; a++) {
            int key = nilai [a];
            int y = a-1;
            while ((y > -1)&&(nilai[y]>key)){
                nilai[y+1] = nilai[y];
                y--;
            }
            nilai[y+1]=key;
        }
    }
    public static void main(String[] args) {
        int[] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        System.out.print("Sebelum Diurutkan = ");
        for (int y : nilai){
            System.out.print(y +" ");
        }
        System.out.println();
        new BlockSort(nilai);

        System.out.print("Setelah Diurutkan = ");
        for(int y : nilai){
            System.out.print(y + " ");
        }
    }
}  