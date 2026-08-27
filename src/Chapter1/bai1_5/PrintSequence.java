package Chapter1.bai1_5;

import java.util.stream.IntStream;

public class PrintSequence {
    public static void main(String[] args) {
        // a) một println
        System.out.println("1 2 3 4");

        // b) bốn print
        System.out.print(1 + " ");
        System.out.print(2 + " ");
        System.out.print(3 + " ");
        System.out.print(4);
        System.out.println();

        // c) một printf
        System.out.printf("%d %d %d %d%n", 1, 2, 3, 4);

        // d) String.join
        System.out.println(String.join(" ", "1", "2", "3", "4"));

        // e) IntStream (xem trước Buổi 9)
        String joined = IntStream.rangeClosed(1, 4)
                .mapToObj(String::valueOf)
                .reduce((x, y) -> x + " " + y)
                .orElse("");
        System.out.println(joined);
    }
}
