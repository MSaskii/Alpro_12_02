package ch05;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
public class LongestIncreasingSubsequence {
    public static void main(String[] args) throws FileNotFoundException {
        int nilai [] = {82,12,41,38,19,26,9,48,20,55,8,32,3};

        System.out.println("Urutan Nilai LIS = " + lis2(nilai));
	}

    private static int lis2(int[] nilai) {
        List<Integer> lis2 = new ArrayList<>();
        lis2.add(nilai[0]);
        for (int i = 1; i < nilai.length; i++)
            if (nilai[i] > lis2.get(lis2.size() - 1))
                lis2.add(nilai[i]);
            else if (nilai[i] < lis2.get(0))
                lis2.set(0, nilai[i]);
            else
                lis2.set(binarySearch(lis2, nilai[i]), nilai[i]);
        System.out.println("hasil LIS: " + lis2);
        return lis2.size();
    }
    private static int lis3(int[] nilai) {
        int[] lis3 = new int[nilai.length];
        int lastIndex = 0;
        lis3[lastIndex] = nilai[0];
        for (int i = 1; i < nilai.length; i++)
            if (nilai[i] > lis3[lastIndex])
                lis3[++lastIndex] = nilai[i];
            else if (nilai[i] < lis3[0])
                lis3[0] = nilai[i];
            else
                lis3[binarySearch(lis3, 0, lastIndex, nilai[i])] = nilai[i];
        return lastIndex + 1;
    }
    private static int lis(int[] arr) {
        int max = -1;
        int[] lis = new int[arr.length];
        lis[0] = 1;
        for (int i = 1; i < arr.length; i++)
            for (int a = 0; a < i; a++)
                if (arr[i] > arr[a] && lis[i] < lis[a] + 1) {
                    lis[i] = lis[a] + 1;
                    max = Math.max(max, lis[i]);
                }
        return max;
    }

    private static int binarySearch(int[] a, int sas, int ki, int key) {
        while (sas <= ki) {
            int me = (sas + ki) >>> 1;
            int mid = a[me];
            if (mid < key)
                sas = me + 1;
            else if (mid > key)
                ki = me - 1;
            else
                return me;
        }
        return sas;
    }

    private static int binarySearch(List<Integer> a, int key) {
        int sas = 0;
        int ki = a.size() - 1;
        while (sas <= ki) {
            int me = (sas + ki) >>> 1;
            int mid = a.get(me);
            if (mid < key)
                sas = me + 1;
            else if (mid > key)
                ki = me - 1;
            else
                return me;
        }
        return sas;
    }
}