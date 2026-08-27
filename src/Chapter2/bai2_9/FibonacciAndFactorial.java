package Chapter2.bai2_9;

import java.math.BigInteger;

public class FibonacciAndFactorial {

    static void printFibonacci(int count) {
        long a = 0, b = 1;
        System.out.print("Dãy Fibonacci: ");
        for (int i = 0; i < count; i++) {
            System.out.print(a + " ");
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    static long factorialLong(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static BigInteger factorialBigInteger(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        printFibonacci(10);

        System.out.println("\n--- Giai thừa với long (bị tràn) ---");
        for (int n = 15; n <= 21; n++) {
            System.out.println(n + "! (long) = " + factorialLong(n));
        }

        System.out.println("\n--- Giai thừa với BigInteger (chính xác) ---");
        for (int n = 15; n <= 21; n++) {
            System.out.println(n + "! (BigInteger) = " + factorialBigInteger(n));
        }
    }
}