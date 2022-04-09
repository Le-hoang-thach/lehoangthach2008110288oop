package ThiCuoiKy;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

import java.util.Scanner;

public class main {
    static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); 
    public static void main(String[] args) throws ParseException   {
        
        int luachon;
        DanhSachHangHoa danhSachHangHoa = new DanhSachHangHoa();
        String ngayNhapKho = "21-03-2020";
        String ngaySX = "20-03-2020";
        String ngayHetHan = "20-03-2022";
        HangHoa hangHoa0 = new HangSanhSu("2002", "chen su", 10_000, 1,dateFormat.parse(ngayNhapKho) , "Le Huynh Phuoc");
        HangHoa hangHoa1 = new HangDienMay("2001", "bong den",20-000, 2, 12, 34);
        HangHoa hangHoa2 = new HangThucPham("2005","xuc xich", 30_000, 3, dateFormat.parse(ngaySX), dateFormat.parse(ngayHetHan));
        HangHoa hangHoa3 = new HangSanhSu("2004", "to su", 40_000, 4,dateFormat.parse(ngayNhapKho), "Le Huynh Phuoc");
        HangHoa hangHoa4 = new HangDienMay("2003", "den pin mini", 50_000, 5, 12, 34);
        HangHoa hangHoa5 = new HangThucPham("2006", "thit heo 456gam", 60_000,6, dateFormat.parse(ngaySX), dateFormat.parse(ngayHetHan));
        HangHoa hangHoa6 = new HangSanhSu("2007", "dia su",70_000, 7, dateFormat.parse(ngayNhapKho),"Le Huynh Phuoc");
        HangHoa hangHoa7 = new HangDienMay("2008", "but thu dien", 80_000, 8,12, 34);
        HangHoa hangHoa8 = new HangThucPham("2009", "thit heo 1kg",90_000,9,dateFormat.parse(ngaySX), dateFormat.parse(ngayHetHan));
        HangHoa hangHoa9 = new HangSanhSu("2010", "binh su", 100_000, 10, dateFormat.parse(ngayNhapKho), "Le Huynh Phuoc");
        HangHoa hangHoa10 = new HangDienMay("2011", "may quat",110_000, 11, 12, 34);
        danhSachHangHoa.nhap(hangHoa0);
        danhSachHangHoa.nhap(hangHoa1);
        danhSachHangHoa.nhap(hangHoa2);
        danhSachHangHoa.nhap(hangHoa3);
        danhSachHangHoa.nhap(hangHoa4);
        danhSachHangHoa.nhap(hangHoa5);
        danhSachHangHoa.nhap(hangHoa6);
        danhSachHangHoa.nhap(hangHoa7);
        danhSachHangHoa.nhap(hangHoa8);
        danhSachHangHoa.nhap(hangHoa9);
        danhSachHangHoa.nhap(hangHoa10);
       

        do{
            System.out.println("1.Nhap Thong tin");
            System.out.println("2.In danh sach");
            System.out.println("3.Tim hang hoa theo ma");
            System.out.println("4. Xoa hang");
            System.out.println("5.Sua hang hoa");
            System.out.println("6. Thong ke");
            System.out.println("7.Sap xep");
            System.out.println("8.Thong ke");
            System.out.println("9.Thoat");
            
            luachon = danhSachHangHoa.input.nextInt();
            switch(luachon){
                
                case 1: NhapThongTin nhapThongTin = new NhapThongTin();
                HangHoa hangHoa = nhapThongTin.inputHangHoa();
                danhSachHangHoa.nhap(hangHoa);break;
                case 2: danhSachHangHoa.inDanhSach();
               
                        
                break;
                    
                case 3 : 
                System.out.println("Nhap ma hang can tim");
                danhSachHangHoa.input.nextLine();
                String maHang = danhSachHangHoa.input.nextLine();
                danhSachHangHoa.timKiemHangTheoMa(maHang);
                
                break;
                case 4: 
                System.out.println("Nhap ma hang can xoa:");
                danhSachHangHoa.input.nextLine();
                int vitri = danhSachHangHoa.input.nextInt();
                danhSachHangHoa.xoa(vitri);
               
                
                break;
                case 5:
                System.out.println("Nhap vi tri ban can sua:");
                danhSachHangHoa.input.nextLine();
                int vitri1 = danhSachHangHoa.input.nextInt();
                danhSachHangHoa.suThongTin(vitri1);
                 break;
                case 6: System.out.println("Goodbye");break;
                case 7 : danhSachHangHoa.sapXep();
                System.out.println("Sap xep thanh cong vui long bam in danh sach de kiem tra lai");break;
                case 8:  danhSachHangHoa.thongKe();break;
            }
        }while(luachon != 9);
        // nhap
       
      
       

      
      
       
       

        
    }
}
