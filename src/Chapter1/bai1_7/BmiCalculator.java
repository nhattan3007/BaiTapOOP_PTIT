package Chapter1.bai1_7;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cân nặng (kg): ");
        double weight = sc.nextDouble();
        System.out.print("Nhập chiều cao (m): ");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);
        System.out.printf("BMI của bạn là: %.2f%n", bmi);

        String classification;
        if (bmi < 18.5) {
            classification = "Thiếu cân";
        } else if (bmi < 23) {
            classification = "Bình thường";
        } else if (bmi < 25) {
            classification = "Thừa cân";
        } else if (bmi < 30) {
            classification = "Béo phì độ I";
        } else {
            classification = "Béo phì độ II trở lên";
        }

        System.out.println("Phân loại (WHO châu Á): " + classification);
    }
}
