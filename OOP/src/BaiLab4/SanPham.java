package BaiLab4;

import java.util.Scanner;

public class SanPham {
   
    //attribute
    // implementation
    private Scanner input = new Scanner(System.in);
    private String tenSP;
    private double donGia;
    private double giamGia;
    private double tongtien;
    //interfaces
    public  SanPham(){

    }
    public SanPham(String tenSp, double donGia){
        this.tenSP = tenSp;
        this.donGia = donGia;
    }
    public SanPham(String tenSP, double donGia , double giamGia, double tongtien){
        this(tenSP, donGia);
        this.giamGia = giamGia;
        this.tongtien = tongtien;
    }
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }
    public String getTenSP() {
        return this.tenSP;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getDonGia() {
        return this.donGia;
    }
    public void setGiamGia(double giaGiam, double tongtien) {
        this.giamGia = (donGia*100)/10;
        this.tongtien = donGia - giaGiam;
    }
    public double getGiamGia() {
        return this.tongtien;
    }
    public void getThueNhapKhau(double thueNhapKhau) {
        thueNhapKhau = 10 * donGia / 100;
        System.out.println("Thuế nhập khẩu: " + thueNhapKhau);
    }

    public void nhap(){
        System.out.println("Nhap ten san pham: ");
        tenSP = input.nextLine();
        System.out.println("Nhap gia san pham: ");
        donGia = input.nextDouble();
        System.out.println("Giam gia");
        giamGia = input.nextDouble();
     
    }
    public void xuat(){
        System.out.println("Tenm san pham la: " + tenSP );
        System.out.println("Don gia: " + donGia);
        System.out.println("Giam gia: " + giamGia);
        System.out.println("Tong tien:" + (donGia-giamGia));
    }
    
    
   
   
   
}
