package ThiCuoiKy;

import java.io.File;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.print.Doc;

public class DanhSachHangHoa {
    static public Scanner input = new Scanner(System.in);
    public List<HangHoa> danhSach = new ArrayList<>();
    

    public void nhap(HangHoa hangHoa){
        this.danhSach.add(hangHoa);
        
    }
    public void inDanhSach(){
        for (HangHoa hangHoa : danhSach) {
            System.out.println(hangHoa);
            hangHoa.kiemTraHSD();
        }
    }
    public void xoa(int  vitri){
        for (int j = 0; j < danhSach.size(); j++) {
            if(j == vitri){
                danhSach.remove(j);
            }
        }
    }
    public void timKiemHangTheoMa(String maHang){
        
       
        for (HangHoa hangHoa : danhSach) {
           
            if(maHang.equals(hangHoa.getMaHang())){
                System.out.println(hangHoa);
            }
        }
        
    }
    public void suThongTin(int vitri) {
        
        for (int j = 0; j < danhSach.size(); j++) {
            if(j == vitri){
                input.nextLine();
                System.out.println("Nhap ma hang");
                String maHang = input.nextLine();
                System.out.println("Nhap ten san pham");
                String tenHang =input.nextLine();
                System.out.println("Nhap gia tien");
                Double donGia = input.nextDouble();
                System.out.println("Nhap so luong ton kho");
                int soLuongTonKho = input.nextInt();
                danhSach.get(j).setTenHang(tenHang);
                danhSach.get(j).setMaHang(maHang);
                danhSach.get(j).setDonGia(donGia);
                danhSach.get(j).setSoLuongTonKho(soLuongTonKho);
               
            }
        }
    }
    public void thongKe(){
        HangHoa hangHoa = new HangSanhSu();
        HangHoa hangHoa2 = new HangThucPham();
        HangHoa hangHoa3 = new HangDienMay();
        int tongHangSanhSu = 0;
        int tongHangThucPham = 0;
        int tongHangDienMay = 0;
        for (HangHoa hangHoa4 : danhSach) {
            if(danhSach.toString().contains("Hang Sanh Su")){
                tongHangSanhSu = tongHangSanhSu + hangHoa.getSoLuongTonKho();
           }else if(danhSach.toString().contains("Hang Thuc Pham")){
            tongHangThucPham = tongHangThucPham + hangHoa2.getSoLuongTonKho();
           }else if(danhSach.toString().contains("Hang Dien May")){
            tongHangDienMay = tongHangDienMay + hangHoa3.getSoLuongTonKho();
           } 
        }
        System.out.println("Tong hnag sanh su ton kho: " + tongHangSanhSu);
        System.out.println("Tong hnag thuc pham ton kho: " + tongHangThucPham);
        System.out.println("Tong hang dien may ton kho: " +tongHangDienMay);
      
       
    }
    public void sapXep(){
       Collections.sort(danhSach, new HangHoa() {
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
            // TODO Auto-generated method stub
            return o1.getMaHang().compareTo(o2.getMaHang()) ;
            
            }
            
       });
    }
   
}
