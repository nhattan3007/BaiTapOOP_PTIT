package Chapter2.bai2_7;

import java.util.Scanner;

public class CalculatorMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Cộng");
            System.out.println("2. Trừ");
            System.out.println("3. Nhân");
            System.out.println("4. Chia");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            // Xử lý nhập sai kiểu (ví dụ gõ chữ thay vì số)
            while (!sc.hasNextInt()) {
                System.out.println("Vui lòng nhập số nguyên!");
                sc.next(); // "xả" giá trị sai khỏi bộ đệm
                System.out.print("Chọn: ");
            }
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Tạm biệt!");
                continue; // bỏ qua phần tính toán, quay lại kiểm tra điều kiện while
            }

            if (choice < 1 || choice > 4) {
                System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
                continue;
            }

            System.out.print("Nhập số thứ nhất: ");
            double x = sc.nextDouble();
            System.out.print("Nhập số thứ hai: ");
            double y = sc.nextDouble();

            String result = switch (choice) {
                case 1 -> x + " + " + y + " = " + (x + y);
                case 2 -> x + " - " + y + " = " + (x - y);
                case 3 -> x + " * " + y + " = " + (x * y);
                case 4 -> (y == 0)
                        ? "Không thể chia cho 0"
                        : x + " / " + y + " = " + (x / y);
                default -> "Lỗi không xác định";
            };

            System.out.println(result);

        } while (choice != 0);
    }
}