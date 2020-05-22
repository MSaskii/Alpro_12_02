package ch05;

public class Kadane {
	public int Kandane(int[] data) {
		int run = 0, ran = 0;
		for (int a = 0; a < data.length; a++) {
			run += data[a];
			if (run < 0) {
                        run = 0;
			}
			if (ran < run) {
				ran = run;
			}
		}
		return ran;
	}
	public int KandaneModify(int[] nilai) {
		int run = nilai[0];
		int ran = nilai[0];
		for(int a = 1; a < nilai.length; a++){
			run = Math.max(nilai[a],run+nilai[a]);
			ran = Math.max(ran,run);
		}
		return ran;
	}
	public static void main(String args[]) {
		int nilaiA[] = { 82, 12, -41, - 38, 19, 26, -9,- 48, 20, 55 , -8, -32, 3 };
		Kadane a = new Kadane();
		System.out.println("Nilai Maksimum Array = " + a.Kandane(nilaiA));
		int nilaiB[] = { 42, -23, -64, -62, -7, 2, -3,-11 };
		System.out.println("Nilai Maksimum Array Jika Semua Element Negatif = " + a.KandaneModify(nilaiB));
	}
}


    
