package Chapter2.bai2_11;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int target = random.nextInt(100) + 1; // 1 đến 100
            int attempts = 0;
            int maxAttempts = 7;
            boolean guessedCorrectly = false;

            System.out.println("\nMáy đã chọn một số từ 1 đến 100. Bạn có " + maxAttempts + " lần đoán.");

            while (attempts < maxAttempts) {
                System.out.print("Đoán lần " + (attempts + 1) + ": ");

                while (!sc.hasNextInt()) {
                    System.out.println("Vui lòng nhập số nguyên!");
                    sc.next();
                    System.out.print("Đoán lần " + (attempts + 1) + ": ");
                }

                int guess = sc.nextInt();
                attempts++;

                if (guess == target) {
                    System.out.println("Chính xác! Bạn đoán đúng sau " + attempts + " lần.");
                    guessedCorrectly = true;
                    break;
                } else if (guess < target) {
                    System.out.println("Số cần tìm lớn hơn.");
                } else {
                    System.out.println("Số cần tìm nhỏ hơn.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Bạn đã hết lượt! Số đúng là: " + target);
            }

            System.out.print("Chơi lại không? (y/n): ");
            String answer = sc.next();
            playAgain = answer.equalsIgnoreCase("y");
        }

        System.out.println("Cảm ơn đã chơi!");
    }
}