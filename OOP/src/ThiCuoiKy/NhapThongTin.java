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
        int choose;
        HangHoa hangHoa = null;
        System.out.println("Please select the goods to import");
        System.out.println("-------------------------------------");
        System.out.println("1.Crockery goods ");
        System.out.println("2.Electrical goods");
        System.out.println("3.Food goods");
        System.out.println("4.Exit");
        System.out.println("Please choose:");
        choose = input.nextInt();
        switch(choose){
            case 1:
            input.nextLine();
            System.out.println("Enter item code:");
            String commodityCodes = input.nextLine();
            System.out.println("Enter item name:");
            String goodsName =input.nextLine();
            System.out.println("Enter the price:");
            Double price = input.nextDouble();
            System.out.println("Enter inventory quantity:");
            int quantityInStock = input.nextInt();
            System.out.println("Nhap ngay nhap kho theo dd-MM-yyyy: ");
            
            String date = input.next();
           
            Date date2 = null;
            try {
                //Parsing the String
                date2 = dateFormat.parse(date);
                input.nextLine();
                System.out.println("Nhap nha san xuat:");
                String nhaSX = input.nextLine();
                hangHoa = new HangSanhSu(commodityCodes, goodsName, price, quantityInStock, dateFormat.parse(date), nhaSX);
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                System.out.println("loi cach nhap");
            }
           
            break;
            case 2: 
            input.nextLine();
            System.out.println("Enter item code:");
            String commodityCodes2 = input.nextLine();
            System.out.println("Enter item name:");
            String goodsName2 =input.nextLine();
            System.out.println("Enter the price:");
            Double price2 = input.nextDouble();
            System.out.println("Enter inventory quantity:");
            int quantityInStock2 = input.nextInt();
            System.out.println("Nhap so thang bao hanh:");
            int thoiGianBaoHanhTheoThang = input.nextInt();
            System.out.println("Nhap cong suat:");
            double congSuat = input.nextDouble();
            hangHoa = new HangDienMay(commodityCodes2, goodsName2, price2, quantityInStock2, thoiGianBaoHanhTheoThang, congSuat);
            
            break;
            case 3:
            input.nextLine();
            System.out.println("Enter item code:");
            String commodityCodes3 = input.nextLine();
            System.out.println("Enter item name:");
            String goodsName3 =input.nextLine();
            System.out.println("Enter the price:");
            Double price3 = input.nextDouble();
            System.out.println("Enter inventory quantity:");
            int quantityInStock3 = input.nextInt();
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
           hangHoa = new HangThucPham(commodityCodes3, goodsName3, price3, quantityInStock3, dateFormat.parse(ngaySX), dateFormat.parse(ngayHetHan));
            break;
            case 4: System.out.println("HEn gap lai"); break;
            default: System.out.println("Ban da chon sai vui long chon lai");
        }

    
            return hangHoa;
       
    }
    
    
}
