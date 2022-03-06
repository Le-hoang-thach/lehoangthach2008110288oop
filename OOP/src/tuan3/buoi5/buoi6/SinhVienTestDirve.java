package tuan3.buoi5.buoi6;

import java.util.Scanner;

public class SinhVienTestDirve {
    static Scanner input = new Scanner(System.in);
    static void nhapThongTinSinhVien(SinhVien sv){
        System.out.println("Nhap MSSV: ");
        sv.setMSSV(input.nextInt());
        System.out.println("Nhap ten sinh vien:");
        sv.setTenSV(input.nextLine());
        System.out.println("Diem Ly thuyet:");
        sv.setLT(input.nextFloat());
        System.out.println("Diem Thuc hanh:");
        sv.setTh(input.nextFloat());
    }
    public static void main(String[] args) {
        int n;
        SinhVien sinhVien1 = new SinhVien(2008110288, "Le Hoang Thach", 7, 8);
        SinhVien sinhVien2 = new SinhVien(2008110233, "le thai tong", 10, 10);
        SinhVien sinhVien3[] = null;
        System.out.println(sinhVien1);
        System.out.println(sinhVien2);
        System.out.println("nhap so luong sinh vien can nhap thong tin:");
        n = input.nextInt();
        sinhVien3 = new SinhVien[n];
        for(int i=0;i<n;i++){
            System.out.println("Sinh vien thu" + (i+1));
            sinhVien3[i] = new SinhVien();
            nhapThongTinSinhVien(sinhVien3[i]);
        }
        for(int i = 0;i<n;i++){
            sinhVien3[i].tinhDiemTB();
        }

    }
}
