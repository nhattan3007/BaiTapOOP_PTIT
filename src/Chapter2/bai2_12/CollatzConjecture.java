package Chapter2.bai2_12;

public class CollatzConjecture {

    static long countSteps(long n) {
        long steps = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        int limit = 10_000;
        long maxSteps = -1;
        int numberWithMaxSteps = -1;

        for (int n = 1; n <= limit; n++) {
            long steps = countSteps(n);
            if (steps > maxSteps) {
                maxSteps = steps;
                numberWithMaxSteps = n;
            }
        }

        System.out.println("Số có chuỗi Collatz dài nhất trong 1.." + limit + " là: " + numberWithMaxSteps);
        System.out.println("Số bước: " + maxSteps);
    }
}