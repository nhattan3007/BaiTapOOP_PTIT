package Chapter1.bai1_6;

import java.util.Scanner;

public class TwoNumberCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        double a = sc.nextDouble();
        System.out.print("Nhập số thứ hai: ");
        double b = sc.nextDouble();

        System.out.printf("Tổng     = %.4f%n", a + b);
        System.out.printf("Hiệu     = %.4f%n", a - b);
        System.out.printf("Tích     = %.4f%n", a * b);

        if (b == 0) {
            System.out.println("Thương   = không xác định (chia cho 0)");
            System.out.println("Phần dư  = không xác định (chia cho 0)");
        } else {
            System.out.printf("Thương   = %.4f%n", a / b);
            System.out.printf("Phần dư  = %.4f%n", a % b);
        }

        System.out.printf("Luỹ thừa (a^b) = %.4f%n", Math.pow(a, b));

        // Minh hoạ khác biệt int vs double khi chia 0
        System.out.println("\n--- Minh hoạ chia cho 0 ---");
        try {
            int x = 5, y = 0;
            System.out.println(x / y); // ném ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("int 5/0 -> ném ArithmeticException: " + e.getMessage());
        }

        double dx = 5.0, dy = 0.0;
        System.out.println("double 5.0/0.0 -> " + (dx / dy));   // Infinity
        System.out.println("double 0.0/0.0 -> " + (0.0 / 0.0)); // NaN
        System.out.println("double -5.0/0.0 -> " + (-dx / dy)); // -Infinity
    }
}
