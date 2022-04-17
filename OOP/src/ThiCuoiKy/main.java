package ThiCuoiKy;


import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class main {
    static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    static NhapThongTin nhapThongTin = new NhapThongTin(); 
    public static void main(String[] args)    {
        
        int choose;
        DanhSachHangHoa danhSachHangHoa = new DanhSachHangHoa();
        try {
            String ngayNhapKho = "17-03-2021";
            String ngaySX = "20-03-2020";
            String ngayHetHan = "17-03-2012";
        
            HangHoa hangHoa0 = new HangSanhSu("2002", "chen su", 20_000, 51,dateFormat.parse(ngayNhapKho) , "Le Huynh Phuoc");
            HangHoa hangHoa1 = new HangDienMay("2001", "bong den",20-000, 2, 12, 34);
            HangHoa hangHoa2 = new HangThucPham("2005","xuc xich", 30_000, 3, dateFormat.parse(ngaySX), dateFormat.parse(ngayHetHan));
            HangHoa hangHoa3 = new HangSanhSu("2004", "to su", 40_000, 4,dateFormat.parse(ngayNhapKho), "Le Huynh Phuoc");
            HangHoa hangHoa4 = new HangDienMay("2003", "den pin mini", 50_000, 5, 12, 34);
            HangHoa hangHoa5 = new HangThucPham("2006", "thit heo 456gam", 60_000,6, dateFormat.parse(ngaySX), dateFormat.parse(ngayHetHan));
            HangHoa hangHoa6 = new HangSanhSu("2007", "dia su",20_000, 7, dateFormat.parse(ngayNhapKho),"Le Huynh Phuoc");
            HangHoa hangHoa7 = new HangDienMay("2008", "but thu dien", 20_000, 8,12, 34);
            HangHoa hangHoa8 = new HangThucPham("2009", "thit heo 1kg",90_000,9,dateFormat.parse(ngaySX), dateFormat.parse(ngayHetHan));
            HangHoa hangHoa9 = new HangSanhSu("2010", "binh su", 100_000, 10, dateFormat.parse(ngayNhapKho), "Le Huynh Phuoc");
            HangHoa hangHoa10 = new HangDienMay("2011", "may quat",110_000, 11, 12, 34);
            danhSachHangHoa.input(hangHoa0);
            danhSachHangHoa.input(hangHoa1);
            danhSachHangHoa.input(hangHoa2);
            danhSachHangHoa.input(hangHoa3);
            danhSachHangHoa.input(hangHoa4);
            danhSachHangHoa.input(hangHoa5);
            danhSachHangHoa.input(hangHoa6);
            danhSachHangHoa.input(hangHoa7);
            danhSachHangHoa.input(hangHoa8);
            danhSachHangHoa.input(hangHoa9);
            danhSachHangHoa.input(hangHoa10);
       
            } catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
            }
        

        do{
            System.out.println("      MENU      ");
            System.out.println("------------------");
            System.out.println("1.Enter information");
            System.out.println("2.Print the list");
            System.out.println("3.Find goods ");
            System.out.println("4.Delete row");
            System.out.println("5.Sua hang hoa");
            System.out.println("6.Statistical");
            System.out.println("7.Sorting goods");
            System.out.println("8.Save file");
            System.out.println("9.Exit");
            System.out.println("Please choose:");
            
            choose = danhSachHangHoa.input.nextInt();
            switch(choose){
                
                case 1: 
                try {
                    HangHoa hangHoa = nhapThongTin.inputHangHoa();
                    danhSachHangHoa.input(hangHoa);
                } catch (Exception e) {
                    //TODO: handle exception
                    e.printStackTrace();
                }
               
               break;
                case 2:
                System.out.println(); danhSachHangHoa.printList();
                break;
                case 3 : 
                danhSachHangHoa.search();
                break;
                case 4: 
                danhSachHangHoa.delete();
                break;
                case 5:
                danhSachHangHoa.input.nextLine();
                System.out.println("Enter the code to correct:");
                String maHang1 = danhSachHangHoa.input.nextLine();
                danhSachHangHoa.suThongTin(maHang1);
                System.out.println("Menu sua thong tin:");
                try {
                    HangHoa hangHoa3HangHoa = nhapThongTin.inputHangHoa();
                    danhSachHangHoa.input(hangHoa3HangHoa);
                } catch (Exception e) {
                    //TODO: handle exception
                }
                
                break;
                
                 
                case 6: danhSachHangHoa.statistical();break;
                case 7 : danhSachHangHoa.arrangeGoods();break;
                case 8 :  break;
               
                case 9:  System.out.println("Goodbye");break;
                default: System.out.println("Error please re-enter!!!");break;
            }
        }while(choose != 9);
        // nhap
       
      
       
        
      
       
    }

        
    
}
