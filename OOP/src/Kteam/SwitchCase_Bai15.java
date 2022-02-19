package Kteam;

import java.util.Scanner;

public class SwitchCase_Bai15 {
    /*
    Switch thuộc dạng rẽ nhánh kiểm tra các dữ liệu với nhau
    cú pháp:
    switch<biến cần kiểm tra>
    Case <giá trị>: break;
    Case <giá trị>: break;
    Case <giá trị>: break;
    default:
    <không đúng các trường hợp trên>
    */
    public static void main(String[] args) {
        String gt;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap gioi tinh cua ban");
        gt = input.nextLine();
        switch(gt){
            case "boy" : System.out.println("hello boy"); break;
            case "girl" : System.out.println("hello girl"); break;
            case "thoat" : System.out.println("Bye");
            default:System.out.println( "nhap sai nhap lai di");break;
        }
    }
}
