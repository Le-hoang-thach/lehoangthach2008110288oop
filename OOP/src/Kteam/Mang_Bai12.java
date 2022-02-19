package Kteam;

public class Mang_Bai12 {
    /*
    ưu điểm: tối ưu gom các phần tử 1 cách gọn gàng 
    nhược điểm: khi khai báo kích thước mảng lưu trữ của mảng và không thay đổi kích thước cho lúc chạy .
    Mảng có 2 loại: mảng 1 chiều và mảng đa chiều
    Mảng 1 chiều:
    Cú pháp khai báo:
    <kiểu dữ liệu>[]<tên mảng>;
    Cú pháp cấp pháp bộ nhớ tạo mảng:
    <tên mảng> = new < kiểu dữ liệu >[kích cỡ mảng ];
    Cú pháp gọn hơn:
    <kiểu dữ liệu>[]<tên mảng> = new <kiểu dữ liệu >[kích cỡ mảng];
    a.length là một thuộc tính của mảng giúp ta biết kích cỡ của mảng nó giúp ta sửa dụng vòng lặp for
    Cú pháp khai báo mảng đa chiều:
    <kiểu dữ liệu>[][] <tên mảng>= new <kiểu dữ liệu>[kích cỡ hàng][kích cỡ cột];
    cú pháp khởi tọa mảng 
    <kiểu dữ liệu >[][]<tên mảng> = {{các giá trị 1},{các giá trị 2},{Các giá trị 3}};
    */
    public static void main(String[] args) {
        int []a;
        a = new int [4];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        System.out.println(a);
        for(int i =0;i<a.length;i++ ){
            System.out.println("a["+i+"]: " + a[i] );
        }
        System.out.println("two dimensional array:");
        int b[][] ={{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print( b[i][j] + " ");

            }
            System.out.println();
        }

    }
}
