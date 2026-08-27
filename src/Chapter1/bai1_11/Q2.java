package Chapter1.bai1_11;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius;
        double tempInFahrenheit = 0.0;
        celsius = (tempInFahrenheit - 32.0) * 5.0 / 9.0;
        System.out.println("Nhập độ F");
        tempInFahrenheit = input.nextDouble();
        System.out.printf("%10.2f là %2.2f", tempInFahrenheit, celsius);
    }
}
// Thiếu import java.util.Scanner; — lỗi biên dịch, Scanner không được nhận diện.
// Tính celsius trước khi nhập tempInFahrenheit — dòng celsius = (tempInFahrenheit - 32.0) * 5.0 / 9.0; chạy khi tempInFahrenheit vẫn là 0.0, nên celsius luôn bằng -17.78 bất kể người dùng nhập gì sau đó.
// Thứ tự lệnh sai — lời nhắc "Nhập độ F" và việc đọc input.nextDouble() phải xảy ra trước khi tính celsius, không phải sau.
// Định dạng %2.2f không nhất quán/thiếu độ rộng — nên dùng %10.2f giống cột đầu để bảng in ra thẳng hàng, dễ đọc.


// CODE ĐÃ SỮA
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius;
        double tempInFahrenheit;

        System.out.println("Nhập độ F");
        tempInFahrenheit = input.nextDouble();

        celsius = (tempInFahrenheit - 32.0) * 5.0 / 9.0;

        System.out.printf("%10.2f là %10.2f", tempInFahrenheit, celsius);
    }
}