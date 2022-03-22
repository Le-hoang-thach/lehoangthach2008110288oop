package KiemTraGiuaKyHk2;

import java.util.Date;
import java.util.Scanner;

public class HoaDonKhachSan {
    // emplementation
    // attribute

    private String maHoaDon; 
    private Date ngayHoaDon;
    private String tenKhachHang;
    private String maPhong;
    private double donGia;
    private double doanhThu;
    //method
    //interface
    
    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    @Override
    public String toString() {
        return "HoaDon [donGia=" + donGia + ", maHoaDon=" + maHoaDon + ", maPhong=" + maPhong + ", ngayHoaDon="
                + ngayHoaDon + ", tenKhachHang=" + tenKhachHang + "]";
    }

    

    public HoaDonKhachSan(String maHoaDon, String tenKhachHang, String maPhong, double donGia,
            double doanhThu) {
        this.maHoaDon = maHoaDon;
       
        this.tenKhachHang = tenKhachHang;
        this.maPhong = maPhong;
        this.donGia = donGia;
        this.doanhThu = doanhThu;
    }

    public HoaDonKhachSan() {
        // constructor mặc định
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Date getNgayHoaDon() {
        return ngayHoaDon;
    }

    public void setNgayHoaDon(Date ngayHoaDon) {
        this.ngayHoaDon = ngayHoaDon;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public void nhapThongTin( ){
        Scanner input = new Scanner(System.in);
        System.out.println("Please, input code bill: ");
        this.maHoaDon = input.nextLine();
        System.out.println("Please, input name client: ");
        this.tenKhachHang = input.nextLine();
        System.out.println("Please, input code room: ");
        this.maPhong = input.nextLine();
        System.out.println("Please, unit price: ");
        this.donGia = input.nextDouble();

    }
}
