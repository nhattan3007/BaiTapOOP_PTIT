package Chapter1.bai1_3;

import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        int a = sc.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int b = sc.nextInt();
        System.out.print("Nhập số thứ ba: ");
        int c = sc.nextInt();

        int sumInt = a + b + c;
        int productInt = a * b * c;

        System.out.println("Tổng (int) = " + sumInt);
        System.out.println("Tích (int) = " + productInt);

        // Sửa tràn số bằng long
        long productLong = (long) a * b * c;
        System.out.println("Tích (long, đã sửa) = " + productLong);

        // Thử nhập 3 số 2_000_000_000, 2, 2: tích thật là 8×10⁹,
        // vượt quá int (tối đa ~2.1×10⁹) nên productInt sẽ tràn số,
        // ra một giá trị âm vô nghĩa (do cơ chế wrap-around của số nguyên bù hai).
        // productLong ép kiểu a sang long trước khi nhân nên phép nhân được thực hiện ở kiểu long,
        // cho kết quả đúng. Lưu ý: (long)(a * b * c) sẽ KHÔNG sửa được lỗi vì phép nhân int*int*int đã tràn trước khi ép kiểu.
    }
}
