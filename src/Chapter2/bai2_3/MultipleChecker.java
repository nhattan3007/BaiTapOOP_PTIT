package Chapter2.bai2_3;

import java.util.Scanner;

public class MultipleChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất (a): ");
        int a = sc.nextInt();
        System.out.print("Nhập số thứ hai (b): ");
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("Không thể kiểm tra vì b = 0 (chia cho 0 không hợp lệ).");
            return;
        }

        if (a % b == 0) {
            System.out.println(a + " là bội của " + b);
        } else {
            System.out.println(a + " không phải là bội của " + b);
        }
    }
}