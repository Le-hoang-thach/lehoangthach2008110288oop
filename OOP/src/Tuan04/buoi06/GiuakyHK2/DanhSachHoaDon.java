package Tuan04.buoi06.GiuakyHK2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class DanhSachHoaDon  {
    private int demTong = 0;
    
    
    List<HoaDonTheoGio> listHoaDonTheoGio = new ArrayList<>();
    List<HoaDonTheoNgay> listHoaDonTheoNgay = new ArrayList<>();
    
    private double doanhThuTheoNgay;
    private double doanhThuTheoGio;
    
    
    public int getDemTong() {
        return demTong;
    }
    public void setDemTong(int demTong) {
        this.demTong = demTong;
    }
    public void xuatThongTinTheoNgay(){
        for (HoaDonTheoNgay hoaDonTheoNgay : listHoaDonTheoNgay) {
            System.out.println(hoaDonTheoNgay);
        }
        
    }
    public void xuatThongTinTheoGio(){
        for (HoaDonTheoGio hoaDonTheoGio : listHoaDonTheoGio) {
            System.out.println(hoaDonTheoGio);
        }
    }
    public void doanhThuTheoNgay(){
        for (HoaDonTheoNgay hoaDonTheoNgay : listHoaDonTheoNgay) {
            
        }
    }
    public double doanhThuTheoGio(){
        for (HoaDonTheoGio hoaDonTheoGio : listHoaDonTheoGio) {
            this.doanhThuTheoGio += doanhThuTheoGio;
        }
    }
    public double doanhThuTheoNgay(){
        for (HoaDonTheoNgay hoaDonTheoNgay : listHoaDonTheoNgay) {
            this.doanhThuTheoNgay += doanhThuTheoNgay;
        }
    }
    public void them(){
        int gio;
        
        if(gio <30){
            HoaDonTheoGio.nhapThongTin();
            this.listHoaDonTheoGio.add(HoaDonTheoGio);
        }else{
            HoaDonTheoNgay.nhapThongTin();
            this.listHoaDonTheoNgay.add(HoaDonTheoNgay);
        }
    }
}
