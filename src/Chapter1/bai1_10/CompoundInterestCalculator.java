package Chapter1.bai1_10;

import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vốn gốc: ");
        double principal = sc.nextDouble();
        System.out.print("Nhập lãi suất năm (%): ");
        double annualRatePercent = sc.nextDouble();
        System.out.print("Nhập số kỳ ghép lãi/năm: ");
        int compoundsPerYear = sc.nextInt();
        System.out.print("Nhập số năm: ");
        int years = sc.nextInt();

        double r = annualRatePercent / 100.0;

        System.out.printf("%-6s%-20s%n", "Năm", "Số dư");
        System.out.println("-".repeat(26));

        for (int year = 1; year <= years; year++) {
            double balance = principal * Math.pow(1 + r / compoundsPerYear, compoundsPerYear * (double) year);
            System.out.printf("%-6d%,20.2f%n", year, balance);
        }

        double fv = principal * Math.pow(1 + r / compoundsPerYear, compoundsPerYear * (double) years);
        System.out.printf("%nGiá trị tương lai sau %d năm: %,.2f%n", years, fv);
    }
}
