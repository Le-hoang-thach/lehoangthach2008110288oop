package BaiLab4;

import java.util.ArrayList;

public class SanPhamTestDriver {
    public static void main(String[] args) {
        // bai 1 va 2
        
        SanPham sp1 = new SanPham();
        sp1.nhap();
        sp1.xuat();
        SanPham sp2 = new SanPham();
        sp2.nhap();
        sp2.xuat();
        // bai 3
        SanPham sp3 = new SanPham("thit", 200000, 14.5);
        sp3.xuat();
        SanPham sp4 = new SanPham("rau muong", 15000, 33.7);
        sp4.xuat();
        //bai 4
        SanPham sp5 = new SanPham("gao", 300000, 20000);
        System.out.println("tien san truoc giam gia: " ); 
        sp5.xuat();
        sp5.setDonGia(300000);
        System.out.println("day tien san pham sau giam gia:" + sp5.getDonGia());
        sp5.xuat();
        
        




    }
}
