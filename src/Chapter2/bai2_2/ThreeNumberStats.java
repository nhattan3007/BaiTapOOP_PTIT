package Chapter2.bai2_2;

import java.util.Scanner;

public class ThreeNumberStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        int a = sc.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int b = sc.nextInt();
        System.out.print("Nhập số thứ ba: ");
        int c = sc.nextInt();

        int sum = a + b + c;
        double average = (a + b + c) / 3.0; // ép sang double để không cắt phần thập phân
        long product = (long) a * b * c;    // đề phòng tràn số như bài 1.3
        int smallest = Math.min(a, Math.min(b, c));
        int largest = Math.max(a, Math.max(b, c));

        System.out.println("Tổng      = " + sum);
        System.out.printf("Trung bình = %.2f%n", average);
        System.out.println("Tích      = " + product);
        System.out.println("Nhỏ nhất  = " + smallest);
        System.out.println("Lớn nhất  = " + largest);
    }
}