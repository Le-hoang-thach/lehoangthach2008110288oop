package Tuan04.buoi06.GiuakyHK2;

import java.util.Scanner;

public class HoaDonTheoGio extends HoaDonKhachSan implements FuntionTinhTien {
    private double soGioiThue;
    
   
     
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
        return this.soGioiThue * getDonGia() ;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " so gio thue:" + soGioiThue;
    }
    

}
