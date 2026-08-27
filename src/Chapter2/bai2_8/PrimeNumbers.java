package Chapter2.bai2_8;

public class PrimeNumbers {

    // (a) Kiểm tra một số có phải số nguyên tố
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // (b) In tất cả số nguyên tố <= N bằng cách kiểm tra từng số
    static void printPrimesUpTo(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // (c) Sàng Eratosthenes — hiệu quả hơn nhiều với N lớn
    static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isComposite = new boolean[n + 1]; // true = hợp số
        for (int i = 2; i * i <= n; i++) {
            if (!isComposite[i]) {
                for (int multiple = i * i; multiple <= n; multiple += i) {
                    isComposite[multiple] = true;
                }
            }
        }
        return isComposite;
    }

    public static void main(String[] args) {
        // (a) Thử với vài số
        System.out.println("17 là số nguyên tố? " + isPrime(17));
        System.out.println("18 là số nguyên tố? " + isPrime(18));

        // (b) In số nguyên tố nhỏ, kiểm tra trực quan
        System.out.println("Các số nguyên tố <= 50:");
        printPrimesUpTo(50);

        // (c) Đo thời gian với N = 1.000.000
        int n = 1_000_000;

        long start1 = System.nanoTime();
        int countMethod1 = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) countMethod1++;
        }
        long end1 = System.nanoTime();
        System.out.printf("Cách kiểm tra từng số: %d số nguyên tố, mất %.3f ms%n",
                countMethod1, (end1 - start1) / 1_000_000.0);

        long start2 = System.nanoTime();
        boolean[] isComposite = sieveOfEratosthenes(n);
        int countMethod2 = 0;
        for (int i = 2; i <= n; i++) {
            if (!isComposite[i]) countMethod2++;
        }
        long end2 = System.nanoTime();
        System.out.printf("Sàng Eratosthenes: %d số nguyên tố, mất %.3f ms%n",
                countMethod2, (end2 - start2) / 1_000_000.0);
    }
}