package KiemTraGiuaKyHk2;

import java.util.Scanner;

public class HoaDonTheoGio extends HoaDonKhachSan implements FuntionTinhTien {
    private double soGioiThue;
    
   
     
    public HoaDonTheoGio(String maHoaDon, String tenKhachHang, String maPhong, double donGia, double doanhThu,
            double soGioiThue) {
        super(maHoaDon, tenKhachHang, maPhong, donGia, doanhThu);
        this.soGioiThue = soGioiThue;
    }
    public HoaDonTheoGio(double soGioiThue) {
        this.soGioiThue = soGioiThue;
    }
    public void setSoGioiThue(double soGioiThue) {
        this.soGioiThue = soGioiThue;
    }
    public double getSoGioiThue() {
        return soGioiThue;
    }

   

    @Override
    public double getDonGia() {
        // TODO Auto-generated method stub
        return super.getDonGia();
    }
    

    @Override
    public void nhapThongTin() {
        // TODO Auto-generated method stub
        super.nhapThongTin();
        Scanner input =new Scanner(System.in);
        System.out.println("Enter rental hours:");
        this.soGioiThue = input.nextDouble();
    }
    public double tinhTien(){
        double tinhTien  = 0;
        if(soGioiThue <= 24){
            tinhTien = soGioiThue * getDonGia() ;
        }else if(soGioiThue > 24 && soGioiThue < 30){
            tinhTien = getDoanhThu() *24;
        }
        return tinhTien;
        
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " so gio thue:" + soGioiThue;
    }
    

}
