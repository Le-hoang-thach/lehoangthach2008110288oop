package tuan3.buoi5.buoi6;

import java.util.Scanner;

public class VehicleTestDrive {
    static Scanner input = new Scanner(System.in);
    static void NhapThongTin(Vehicle car){
        System.out.println("Nhap ten chu xe:");
        car.setName(input.nextLine());
        System.out.println("Loai xe:");
        car.setLoaiXe(input.nextLine());
        System.out.println("Dung tich:");
        car.setDungTich(input.nextInt());
        System.out.println("Tri gia:");
        car.setTriGia(input.nextDouble());
    }
    public static void main(String[] args) {
        Vehicle car[] = null ;
        int luachon,n =0;
        boolean thoat = true;
        do{
            System.out.println("MENU");
            System.out.println("1.Tao doi tuong xe va nhap thong tin:");
            System.out.println("2.Xuat bang ke khia tien thue cua cac xe:");
            System.out.println("3.Thoat.");
            luachon = input.nextInt();
            switch(luachon){
                case 1: 
                System.out.println("Nhap so luong xe ban muon khai thue:");
                n = input.nextInt();
                // khai bao mang car[] de chua so luong xe
                car = new Vehicle[n];
                for(int i=0; i<n;i++){
                    System.out.println("Xe thu" + (i+1));
                    car[i] = new Vehicle();
                    NhapThongTin(car[i]);

                }
                break;
                case 2:
                System.out.println("Chủ xe   "+"Dung tích   "+"Trị giá  "+"Thuế  1");
                for(int i = 0;i<n;i++){
                    car[i].inThue();
                }
                break;
                default: System.out.println("hen gap lai.");
                thoat = false;
                break;
            }
        }while(thoat);
    }
}
