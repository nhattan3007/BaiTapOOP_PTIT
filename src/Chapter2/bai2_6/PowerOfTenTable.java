package Chapter2.bai2_6;

public class PowerOfTenTable {
    public static void main(String[] args) {
        // Header in riêng, ngoài vòng lặp
        System.out.printf("%-6s%-10s%-10s%-10s%n", "N", "10*N", "100*N", "1000*N");

        for (int n = 1; n <= 5; n++) {
            System.out.printf("%-6d%-10d%-10d%-10d%n", n, 10 * n, 100 * n, 1000 * n);
        }
    }
}