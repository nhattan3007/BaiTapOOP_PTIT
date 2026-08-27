package Chapter2.bai2_4;

import java.util.Scanner;

public class GradeClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập điểm (0-10): ");
        double score = sc.nextDouble();

        int band = (int) score; // lấy phần nguyên để dùng switch

        String rank = switch (band) {
            case 9, 10 -> "Xuất sắc";
            case 8 -> "Giỏi";
            case 7 -> "Khá";
            case 5, 6 -> "Trung bình";
            default -> "Yếu";
        };

        System.out.println("Điểm " + score + " -> Xếp loại: " + rank);
    }
}