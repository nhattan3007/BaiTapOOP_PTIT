package Chapter2.bai2_14;

public class Fix {
}

//Đoạn mã sau lẽ ra in các số chẵn từ 2 đến 20 nhưng bị treo (vòng lặp vô hạn). Tìm và sửa

int i = 2;
while (i <= 20) {
        System.out.println(i);
    if (i % 4 == 0) continue;
i += 2;
        }
/*
* Khi i là bội của 4 (ví dụ i = 4), lệnh continue được thực thi.
* continue nhảy thẳng về đầu vòng lặp để kiểm tra lại điều kiện (i <= 20),
* bỏ qua hoàn toàn dòng i += 2; phía sau nó. Vì vậy khi i = 4,
* biến i không bao giờ được tăng lên nữa — chương trình in ra 4 liên tục vô hạn lần vì điều kiện i <= 20 vẫn luôn đúng và i không đổi.
* Cách sửa — đảm bảo i luôn được tăng trước khi vòng lặp quay lại, bất kể có continue hay không:
* int i = 2;
while (i <= 20) {
    if (i % 4 != 0) {
        System.out.println(i);
    }
    i += 2; // luôn tăng, đặt TRƯỚC mọi khả năng continue/return
}
* Hoặc nếu muốn giữ đúng cấu trúc gốc nhưng vẫn dùng continue, cần tăng i trước khi gọi continue:
* int i = 2;
while (i <= 20) {
    System.out.println(i);
    if (i % 4 == 0) {
        i += 2;
        continue;
    }
    i += 2;
}
* Cách đầu tiên gọn hơn và là thói quen tốt: tránh đặt lệnh cập nhật biến điều khiển vòng lặp sau một continue/break/return có điều kiện
* luôn đảm bảo biến đó được cập nhật ở một nơi chắc chắn được thực thi mỗi vòng lặp.
*/
