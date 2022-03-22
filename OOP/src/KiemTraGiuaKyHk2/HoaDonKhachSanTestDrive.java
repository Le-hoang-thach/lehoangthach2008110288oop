package KiemTraGiuaKyHk2;

import java.util.Scanner;

public class HoaDonKhachSanTestDrive {
    public static void main(String[] args) {
        DanhSachHoaDon danhSachHoaDon = new DanhSachHoaDon();
        int luachon;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("____________MENU_____________");
            System.out.println("1.Input and output bill room ");
            System.out.println("2.Calculating quantity for different types of rooms to rent ");
            System.out.println("3.Average monthly rental bill 9");
            System.out.println("4.Exit");
            System.out.print("Please you selection: ");
            luachon = input.nextInt();
            switch(luachon){
                case 1: danhSachHoaDon.them(); break;
                case 2: break;
                case 3: break;
                case 4: System.out.println("Thank you uesd");
            }
        }while(luachon != 4);
       
    }
}
