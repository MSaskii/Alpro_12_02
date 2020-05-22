package ch07;

import java.util.Arrays;
public class CocktailShakerSort {
     void CocktailShakerSort(int []nilai) {
	  boolean ganti;
	  do {
		ganti = false;
		for (int a = 0; a <=  nilai.length - 2; a++) {
			if (nilai[a] > nilai[ a + 1 ]) {
				int data = nilai[a];
				nilai[a] = nilai[a+1];
				nilai[a+1] = data;
				ganti = true;
			}
		}
		if (!ganti) {
			break;
		}
		ganti = false;
		for (int a = nilai.length -2; a >= 0; a--) {
			if (nilai[a] > nilai[a+1]) {
				int data = nilai[a];
				nilai[a] = nilai[a+1];
				nilai[a+1]= data;
				ganti = true;
                            }
                    }
                    } while (ganti);
    }
        public static void main(String[] args) {
            CocktailShakerSort ob = new CocktailShakerSort();
            int nilai[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
            System.out.println("Angka Sebelum Pengurutan =");
            System.out.println(Arrays.toString(nilai));
            ob.CocktailShakerSort(nilai);
            System.out.println("Angka Sesudah Pengurutan =");
            System.out.println(Arrays.toString(nilai));
        }
    }