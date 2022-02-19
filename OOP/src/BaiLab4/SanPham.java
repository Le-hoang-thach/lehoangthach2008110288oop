package BaiLab4;

import java.util.Scanner;

public class SanPham {
    static Scanner input = new Scanner(System.in);
    //data
    private String tenSP;
    private double donGia;
    private double giamGia;
    // contruction
    public SanPham(){

    }
    public SanPham(String tenSP, double donGia, double giamGia){
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;

    }
    public String getTenSp(){
        return this.tenSP;
    }
    public void setTenSP(String tenSP){
        this.tenSP = tenSP;
    }
    public double getDonGia(){
        return donGia;
    }
    public void setDonGia(double donGia){
        if(donGia <= 100000){
            this.donGia = donGia - 10000;
        }else 
        if( donGia > 200000){
            this.donGia = donGia -20000;
        }
    }
   
   
    public void nhap(){
        System.out.println("nhap ten sp: " );
        tenSP = input.nextLine();
        System.out.println("nhap gia tien: " );
        donGia = input.nextDouble();
        System.out.println("giam gia: " );
        giamGia = input.nextDouble();
    }
    public void xuat(){
        System.out.println("ten sp:" + tenSP);
        System.out.println("gia cu:" + donGia);
        System.out.println("giam gia:" + giamGia);
    }
}
