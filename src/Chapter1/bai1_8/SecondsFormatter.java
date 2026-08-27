package Chapter1.bai1_8;

import java.time.Duration;
import java.util.Scanner;

public class SecondsFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tổng số giây: ");
        long totalSeconds = sc.nextLong();

        long days = totalSeconds / 86400;
        long remainder = totalSeconds % 86400;
        long hours = remainder / 3600;
        remainder = remainder % 3600;
        long minutes = remainder / 60;
        long seconds = remainder % 60;

        System.out.printf("%d ngày %02d:%02d:%02d%n", days, hours, minutes, seconds);

        // So sánh với java.time.Duration
        Duration d = Duration.ofSeconds(totalSeconds);
        long dDays = d.toDays();
        long dHours = d.toHoursPart();
        long dMinutes = d.toMinutesPart();
        long dSeconds = d.toSecondsPart();
        System.out.printf("Duration: %d ngày %02d:%02d:%02d%n", dDays, dHours, dMinutes, dSeconds);
    }
}
