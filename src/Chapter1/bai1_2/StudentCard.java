package Chapter1.bai1_2;

public class StudentCard {
    public static void main(String[] args) {
        // dùng phương pháp textblock thay vì dùng print như cũ (tránh lệch dòng vài dê căn chỉnh)
        String s = """
                =============================
                |       Thẻ Sinh Viên       |
                | Họ tên : %-17s|
                | MSSV   : %-17s|
                | Lớp    : %-17s|
                | Email  : %-17s|
                | Sở Thích: %-16s|
                =============================
                """;
        String template = s;

        //Nếu muốn chèn giá trị biến (tên, MSSV...) vào trong text block
        //không thể viết trực tiếp "Họ tên: " + name bên trong """...""" một cách gọn gàng.
        //Cách làm là: Gọi .formatted(...) trên chuỗi đó, truyền vào các giá trị theo đúng thứ tự để thay thế từng placeholder.
        String card = template.formatted(
                "Tân",
                "N24DVCN042",
                "D24VHCN01-N",
                "tan@example.com",
                "Backend Dev"
        );

        System.out.println(card);
    }
}
