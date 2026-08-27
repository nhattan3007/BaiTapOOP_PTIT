package Chapter1.bai1_4;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập nhiệt độ F: ");
        double fahrenheit = sc.nextDouble();   // nhập trước

        double celsius = (fahrenheit - 32) * 5.0 / 9.0;  // tính sau

        System.out.printf("%.1f°F = %.2f°C%n", fahrenheit, celsius);
    }
}
