package ch04;

public class ArrayB {
    public static void main(String[] args) {
      int[] nilai = {82,12,41,38,19,26,9,48,20,55,8,32,3};
      int search = 3;
      
        for (int a = 0; a < nilai.length; a++){
            if(nilai[a] == search ){
                System.out.println("Angka " + search + " Ditemukan di indeks " + a);
            }
        }
    }
}