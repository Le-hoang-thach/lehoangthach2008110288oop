package Kteam;

public class EpKieuTrongJava_bai8 {
    /* Ép kiểu là chuyển biến có kiẻu dữ liệu này thành biến có kiểu dữ liệu kia
    Ép kiểu có hai loại ép: kiểu reference tyes ( kiểu tham chiếu đối tượng) và primited data tyes (kiểu tham chiếu nguyên thủy)
    kiểu nguyên thủy (primited data tyes): gồm có hai kiểu
    kiểu chuyển đổi ngầm định
    viêc chuyển đổi của compiler
    bytes short int long float double
    
    kiểu chuyển đổi tường minh

    */
    public static void main(String[] args) {
        // kiểu chuyển đổi ngầm định từ nhỏ  sàng lớn
        int a =5;
        long b =a;
        System.out.println(b);
        System.out.println("Nên nhớ đây là kiểu chuyển đổi ngầm định mà compiler làm ");
        // kiểu chuyển đổi từ lớn hơn sang nhỏ hơn kiểu tường minh
        long c = 5;
        int h = (int ) c;
        System.out.println(b);
    }
}
