package Chapter2.bai2_10;

public class ShapeDrawer {

    // Tam giác vuông
    static void rightTriangle(int n) {
        System.out.println("--- Tam giác vuông ---");
        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
    }

    // Tam giác cân
    static void isoscelesTriangle(int n) {
        System.out.println("--- Tam giác cân ---");
        for (int i = 1; i <= n; i++) {
            String spaces = " ".repeat(n - i);
            String stars = "*".repeat(2 * i - 1);
            System.out.println(spaces + stars);
        }
    }

    // Kim tự tháp rỗng
    static void hollowPyramid(int n) {
        System.out.println("--- Kim tự tháp rỗng ---");
        for (int i = 1; i <= n; i++) {
            String spaces = " ".repeat(n - i);
            if (i == n) {
                // đáy đặc hoàn toàn
                System.out.println(spaces + "*".repeat(2 * i - 1));
            } else if (i == 1) {
                System.out.println(spaces + "*");
            } else {
                String innerSpaces = " ".repeat(2 * i - 3);
                System.out.println(spaces + "*" + innerSpaces + "*");
            }
        }
    }

    // Hình thoi
    static void diamond(int n) {
        System.out.println("--- Hình thoi ---");
        // nửa trên (bao gồm hàng giữa)
        for (int i = 1; i <= n; i++) {
            System.out.println(" ".repeat(n - i) + "*".repeat(2 * i - 1));
        }
        // nửa dưới
        for (int i = n - 1; i >= 1; i--) {
            System.out.println(" ".repeat(n - i) + "*".repeat(2 * i - 1));
        }
    }

    // Bàn cờ vua 8x8
    static void chessBoard(int size) {
        System.out.println("--- Bàn cờ vua " + size + "x" + size + " ---");
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if ((row + col) % 2 == 0) {
                    System.out.print("■");
                } else {
                    System.out.print("□");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rightTriangle(5);
        System.out.println();
        isoscelesTriangle(5);
        System.out.println();
        hollowPyramid(5);
        System.out.println();
        diamond(5);
        System.out.println();
        chessBoard(8);
    }
}