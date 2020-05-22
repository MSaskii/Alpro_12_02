package ch08;

public class MillerRabin {

    static long root(int x, int y, int p) {
        long x1 = (long) x;
        long tes = 1;
        while (y > 0) {
            if (y % 2 != 0) {
                tes = (tes * x1) % p;
                y = y - 1;
            }
            x1 = (x1 * x1) % p;
            y = y / 2;
        }
        return tes;
    }
    private static void nilai(int n) {
        int i = 2;
        int k = 1;
        int r = 2;
        int x = 0;
        int z = 37;
        double m = 0;
        double b = 0;
        boolean prima = true;

        if (n <= 39) {
            z = n - 2;
        }

        if (n % 2 != 0) {
            while (r <= z) {
                x = 0;
                m = (n - 1) / Math.pow(2, k);

                while (m % 2 == 0) {
                    k++;
                    m = (n - 1) / Math.pow(2, k);
                }
                b = root(r, (int) m, n);
                if (b == 1 || b - n == -1) {
                    r++;
                    continue;
                } else {
                    while (b != 1 && b - n != -1.0) {
                        x++;
                        if (x >= k) {
                            prima = false;
                            break;
                        }
                        b = root((int) b, i, n);
                    }
                    if (b == 1) {
                        prima = false;
                        break;
                    }
                    if (b == -1) {
                        continue;
                    }
                }
                if (!prima) {
                    break;
                }
                r++;
            }
            if (prima) {
                System.out.println(n + " Bilangan Prima");
            } else {
                System.out.println(n + " Bukan Bilangan Prima");
            }
        } else {
            System.out.println(n + " Bukan Bilangan Prima");
        }
    }
    public static void main(String[] args) {
        nilai(7);
        nilai(8);
        nilai(17);
        nilai(24);
        nilai(3);
    }
}

