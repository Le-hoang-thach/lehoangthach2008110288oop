package KiemTraGiuaKy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.Scanner;

public class HoaDon {
    // attributte
    //emplementation
    static Scanner input = new Scanner(System.in);
    protected long maHoaDon;
    protected Date ngayHoaDon;
    protected String tenKhachHang;
    protected String maPhong;
    protected float donGia;
    protected float thanhTien;
    SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

    
    //method
    //interface
    // constructor mac dinh
   
    
    public HoaDon() {
    }
    public HoaDon(long maHoaDon, Date ngayHoaDon, String tenKhachHang, String maPhong, float donGia, float thanhTien) {
        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
		try {
			ngayHoaDon = ngayVietNam.parse(ngayHoaDon);
		} catch (ParseException e) {
		    e.printStackTrace();
		}
        this.maHoaDon = maHoaDon;
        this.ngayHoaDon = ngayHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.maPhong = maPhong;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }
    public long getMaHoaDon() {
        return maHoaDon;
    }
    public void setMaHoaDon(long maHoaDon) {
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
    public float getDonGia() {
        return donGia;
    }
    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
    
    public float getThanhTien() {
        return thanhTien;
    }
    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }
    
    public void xuatHoaDon(){
        System.out.println("-----------Output Information---------");
        System.out.println("Code bill: " + maHoaDon );
        System.out.println("Check in date : " + ngayHoaDon );
        System.out.println("Nane client: " + tenKhachHang);
        System.out.println("room code: " + maPhong);
        System.out.println("Unit price: " + donGia);
    }
    @Override
    public String toString() {
        return "HoaDon [date=" + date + ", donGia=" + donGia + ", maHoaDon=" + maHoaDon + ", maPhong=" + maPhong
                + ", ngayHoaDon=" + ngayHoaDon + ", tenKhachHang=" + tenKhachHang + ", thanhTien=" + thanhTien + "]";
    }
    
}
