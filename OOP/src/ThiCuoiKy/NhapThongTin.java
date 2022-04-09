package ThiCuoiKy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NhapThongTin   {
    static  
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    static HangHoa hangHoa = new HangSanhSu();
    public Scanner input = new Scanner(System.in);

    public HangHoa inputHangHoa() throws ParseException  {
        int luachon;
        HangHoa hangHoa = null;
        
        System.out.println("1.Hang Sanh Su ");
        System.out.println("2.Hang Dien May");
        System.out.println("3.HangThuc pham");
        System.out.println("4.Thoat");
        System.out.println("moi ban lua chon:");
        luachon = input.nextInt();
        switch(luachon){
            case 1:
            input.nextLine();
            System.out.println("Nhap ma hang");
            String maHang = input.nextLine();
            System.out.println("Nhap ten san pham");
            String tenHang =input.nextLine();
            System.out.println("Nhap gia tien");
            Double donGia = input.nextDouble();
            System.out.println("Nhap so luong ton kho");
            int soLuongTonKho = input.nextInt();
            System.out.println("Nhap ngay nhap kho theo dd-MM-yyyy: ");
            
            String date = input.next();
           
            Date date2 = null;
            try {
                //Parsing the String
                date2 = dateFormat.parse(date);
                input.nextLine();
                System.out.println("Nhap nha san xuat:");
                String nhaSX = input.nextLine();
                hangHoa = new HangSanhSu(maHang, tenHang, donGia, soLuongTonKho, dateFormat.parse(date), nhaSX);
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                System.out.println("loi cach nhap");
            }
           
            break;
            case 2: 
            input.nextLine();
            System.out.println("Nhap ma hang");
            String maHang2 = input.nextLine();
            System.out.println("Nhap ten san pham");
            String tenHang2 =input.nextLine();
            System.out.println("Nhap gia tien");
            Double donGia2 = input.nextDouble();
            System.out.println("Nhap so luong ton kho");
            int soLuongTonKho2 = input.nextInt();
            System.out.println("Nhap so thang bao hanh:");
            int thoiGianBaoHanhTheoThang = input.nextInt();
            System.out.println("Nhap cong suat:");
            double congSuat = input.nextDouble();
            hangHoa = new HangDienMay(maHang2, tenHang2, donGia2, soLuongTonKho2, thoiGianBaoHanhTheoThang, congSuat);
            break;
            case 3:
            input.nextLine();
            System.out.println("Nhap ma hang");
            String maHang3 = input.nextLine();
            System.out.println("Nhap ten san pham");
            String tenHang3 =input.nextLine();
            System.out.println("Nhap gia tien");
            Double donGia3 = input.nextDouble();
            System.out.println("Nhap so luong ton kho");
            int soLuongTonKho3 = input.nextInt();
            input.nextLine();
            System.out.println("Nhap ngay nhap san xuat theo dd-MM-yyyy: ");
            String ngaySX = input.nextLine();
            Date date3 = null;
            try {
                //Parsing the String
                date3 = dateFormat.parse(ngaySX);
               } catch (ParseException e) {
                // TODO Auto-generated catch block
                System.out.println("loi cach nhap");
            }
            System.out.println("Nhap ngay nhap het han theo dd-MM-yyyy: ");
            String ngayHetHan = input.nextLine();
            try {
                date2 = dateFormat.parse(ngayHetHan);
               
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("loi cach nhap");
            }
           hangHoa = new HangThucPham(maHang3, tenHang3, donGia3, soLuongTonKho3, dateFormat.parse(ngaySX), dateFormat.parse(ngayHetHan));
            break;
            case 4: System.out.println("HEn gap lai"); break;
            default: System.out.println("Ban da chon sai vui long chon lai");
        }

    
            return hangHoa;
       
    }
    
    
}
