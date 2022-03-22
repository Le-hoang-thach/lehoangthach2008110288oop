package Tuan04.buoi06.GiuakyHK2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class DanhSachHoaDon  {
    private int demTong = 0;
    private double gio;
    
    
    List<HoaDonTheoGio> listHoaDonTheoGio = new ArrayList<>();
    List<HoaDonTheoNgay> listHoaDonTheoNgay = new ArrayList<>();
    
    private double doanhThuTheoNgay;
    private double doanhThuTheoGio;
    
    
    
    
    public double getGio() {
        return gio;
    }


    public void setGio(double gio) {
      
        this.gio = gio;
    }


    public int getDemTong() {
        return demTong;
    }
    public void setDemTong(int demTong) {
        this.demTong = demTong;
    }
   
    public void xuatThongTinTheoGio(){
        
    }
    // public void doanhThuTheoNgay(){
    //     for (HoaDonTheoNgay hoaDonTheoNgay : listHoaDonTheoNgay) {
            
    //     }
    // }
    // public double doanhThuTheoGio(){
    //     for (HoaDonTheoGio hoaDonTheoGio : listHoaDonTheoGio) {
    //         this.doanhThuTheoGio += doanhThuTheoGio;
    //     }
    // }
    // public double doanhThuTheoNgay(){
    //     for (HoaDonTheoNgay hoaDonTheoNgay : listHoaDonTheoNgay) {
    //         this.doanhThuTheoNgay += doanhThuTheoNgay;
    //     }
    // }
    public void them(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter rental hours:");
        gio = input.nextDouble();
        if(this.gio <30){
            HoaDonTheoGio hoaDonTheoGio = new HoaDonTheoGio();
            hoaDonTheoGio.nhapThongTin();
            this.listHoaDonTheoGio.add(hoaDonTheoGio);
            System.out.println("_____hourly bill ______");
            for (HoaDonTheoNgay hoaDonTheoNgay : listHoaDonTheoNgay) {
                System.out.println(hoaDonTheoNgay);
            }
        }else{
            HoaDonTheoNgay hoaDonTheoNgay = new HoaDonTheoNgay();
           hoaDonTheoNgay.nhapThongTin();
           this.listHoaDonTheoNgay.add(hoaDonTheoNgay);
           System.out.println("_______Invoice by day_______");
           for (HoaDonTheoGio hoaDonTheoGio : listHoaDonTheoGio) {
            System.out.println(hoaDonTheoGio);
            }
        }
    }
}
