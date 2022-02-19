package HangHoa;

import java.util.Scanner;



public class ThucPham {
    static Scanner input = new Scanner(System.in);
    public String name;
    public int sl;
    public int gia;
    public ThucPham(){
        super();
    }
    public ThucPham(String name, int sl, int gia){
        this.name = name;
        this.sl = sl;
        this.gia = gia;

    }
    public void nhapThongTin(){
        System.out.println("Nhap ten hang: ");
        name = input.nextLine();
        System.out.println("Nhap so luong: ");
        sl = input.nextInt();
        System.out.println("Nhap gia tien: ");
        gia = input.nextInt();
    }
    public void inThongTin(){
        System.out.println("Ten hang: " + name);
        System.out.println("So luong: " +sl);
        System.out.println("Gia: " +gia);
    }
}
