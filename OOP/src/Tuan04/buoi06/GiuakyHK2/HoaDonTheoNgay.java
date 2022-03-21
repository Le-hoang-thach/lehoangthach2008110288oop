package Tuan04.buoi06.GiuakyHK2;

import java.util.Scanner;

public class HoaDonTheoNgay extends HoaDonKhachSan implements FuntionTinhTien {
    private float soNgayThue;

    @Override
    public double getDonGia() {
        // TODO Auto-generated method stub
        return super.getDonGia();
    }

    public float getSoNgayThue() {
        return soNgayThue;
    }
    
    
    @Override
    public void nhapThongTin() {
        // TODO Auto-generated method stub
        super.nhapThongTin();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rental days: ");
        this.soNgayThue = input.nextFloat();

    }

    public void setSoNgayThue(float soNgayThue) {
        this.soNgayThue = soNgayThue;
    }
    public double tinhTien(){
        
        if(soNgayThue > 7){
           return (((soNgayThue -7) *getDonGia())*20)/100;
        }else{
            return soNgayThue * getDonGia();
        }
    }
    
}
