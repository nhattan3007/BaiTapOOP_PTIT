package Chapter1.bai1_9;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class BillSplitter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tổng hoá đơn (VNĐ): ");
        double bill = sc.nextDouble();
        System.out.print("Nhập số người: ");
        int people = sc.nextInt();
        System.out.print("Nhập % tip: ");
        double tipPercent = sc.nextDouble();

        double total = bill * (1 + tipPercent / 100.0);
        double perPersonRaw = total / people;
        double perPersonRounded = Math.ceil(perPersonRaw / 1000.0) * 1000.0;

        System.out.printf("Mỗi người trả (double, làm tròn lên 1.000đ): %,.0f VNĐ%n", perPersonRounded);

        // Minh hoạ tại sao double không phù hợp với tiền tệ
        System.out.println("\n--- Vấn đề với double ---");
        System.out.println("0.1 + 0.2 = " + (0.1 + 0.2)); // 0.30000000000000004

        // Dùng BigDecimal để tính chính xác
        BigDecimal billBd = BigDecimal.valueOf(bill);
        BigDecimal tipMultiplier = BigDecimal.ONE.add(
                BigDecimal.valueOf(tipPercent).divide(BigDecimal.valueOf(100)));
        BigDecimal totalBd = billBd.multiply(tipMultiplier);
        BigDecimal perPersonBd = totalBd.divide(BigDecimal.valueOf(people), 10, RoundingMode.HALF_UP);
        BigDecimal roundedBd = perPersonBd
                .divide(BigDecimal.valueOf(1000), 0, RoundingMode.CEILING)
                .multiply(BigDecimal.valueOf(1000));

        System.out.println("Mỗi người trả (BigDecimal): " + roundedBd + " VNĐ");
    }
}
