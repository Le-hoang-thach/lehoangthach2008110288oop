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
            System.out.println("Enter the warehouse date in the format dd-MM-yyyy: ");
            
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
                e.printStackTrace();
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
            System.out.println("Enter the number of months of warranty:");
            int thoiGianBaoHanhTheoThang = input.nextInt();
            System.out.println("Enter capacity:");
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
            System.out.println("Enter production date according to dd-MM-yyyy: ");
            String ngaySX = input.nextLine();
            Date date3 = null;
            try {
                //Parsing the String
                date3 = dateFormat.parse(ngaySX);
               } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Enter the expiration date by dd-MM-yyyy: ");
            String ngayHetHan = input.nextLine();
            try {
                date2 = dateFormat.parse(ngayHetHan);
               
            } catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
            }
           hangHoa = new HangThucPham(commodityCodes3, goodsName3, price3, quantityInStock3, dateFormat.parse(ngaySX), dateFormat.parse(ngayHetHan));
            break;
            case 4: System.out.println("See you!!!"); break;
            default: System.out.println("You made the wrong choice, try again!!!");
        }

    
            return hangHoa;
       
    }
    
    
}
