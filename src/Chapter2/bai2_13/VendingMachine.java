package Chapter2.bai2_13;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giá món hàng (VNĐ): ");
        long price = sc.nextLong();
        System.out.print("Nhập số tiền khách đưa (VNĐ): ");
        long paid = sc.nextLong();

        if (paid < price) {
            System.out.println("Số tiền không đủ! Còn thiếu: " + (price - paid) + " VNĐ");
            return;
        }

        long change = paid - price;
        System.out.println("Tiền thối: " + change + " VNĐ");

        int[] denominations = {500_000, 200_000, 100_000, 50_000, 20_000, 10_000, 5_000, 2_000, 1_000};

        System.out.println("Chi tiết tiền thối:");
        long remaining = change;
        boolean hasChange = false;

        for (int denom : denominations) {
            int count = (int) (remaining / denom);
            if (count > 0) {
                System.out.println("- " + count + " tờ/xu mệnh giá " + denom + " VNĐ");
                remaining -= (long) count * denom;
                hasChange = true;
            }
        }

        if (!hasChange) {
            System.out.println("(Không cần thối tiền)");
        }

        if (remaining > 0) {
            System.out.println("Lưu ý: còn dư " + remaining + " VNĐ không thể quy đổi bằng các mệnh giá hiện có.");
        }
    }
}