package Chapter2.bai2_5;

import java.util.Scanner;

public class FindMaxOfTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int largest = Integer.MIN_VALUE; // KHÔNG khởi tạo bằng 0
        int counter = 1;

        while (counter <= 10) {
            System.out.print("Nhập số thứ " + counter + ": ");
            int number = sc.nextInt();

            if (number > largest) {
                largest = number;
            }
            counter++;
        }

        System.out.println("Số lớn nhất là: " + largest);
    }
}