package Kteam;



public class Hang_bai7 {
    /* hằng là 1 biến mà giá trị suốt chương trình không đổi, tất nhiên đã khởi tạo giá trị ngay từ đầuu
    .cú pháp final <kiểu dữ liệu> <tên biến> = <giá trị của hằng>;
    .tác dụng tạo ra giá trị mà không thể thay đổi để an toàn hơn
    vd:
    */
    public static void main(String[] args) {
        final double Pi = 3.14;
        int r = 3;
        System.out.println("Chu vi : 2 *r*pi = " + 2*r*Pi );

    }
}
