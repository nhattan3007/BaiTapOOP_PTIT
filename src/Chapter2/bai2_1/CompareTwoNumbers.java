package Chapter2.bai2_1;

import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        int a = sc.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int b = sc.nextInt();

        // Phiên bản 1: if-else
        System.out.println("--- Phiên bản if-else ---");
        if (a > b) {
            System.out.println(a + " lớn hơn");
        } else if (b > a) {
            System.out.println(b + " lớn hơn");
        } else {
            System.out.println("Hai số bằng nhau");
        }

        // Phiên bản 2: toán tử ba ngôi
        System.out.println("--- Phiên bản toán tử ba ngôi ---");
        String result = (a == b) ? "Hai số bằng nhau"
                : (a > b) ? a + " lớn hơn"
                : b + " lớn hơn";
        System.out.println(result);
    }
}