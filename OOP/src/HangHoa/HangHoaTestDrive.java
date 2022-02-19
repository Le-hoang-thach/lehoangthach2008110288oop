package HangHoa;


import java.util.ArrayList;
import java.util.Scanner;

public class HangHoaTestDrive {
    public void nhapHangHoa(int soluong, ThucPham thucPham, ArrayList<ThucPham> dstp ){
       

        for(int i =0;i< soluong;i++){
            System.out.println("Nhap thong tin thuc pham thu " +  i +" : " );
            thucPham = new ThucPham();
            thucPham.nhapThongTin();
            dstp.add(thucPham);
       }
      
    }
    public static void main(String[] args) {
        ArrayList <ThucPham> dstp = new ArrayList<>();
        int soluong;
        int luachon;
        ThucPham thucPham;
        Scanner input = new Scanner(System.in);
        System.out.println("        MENU        ");
        System.out.println("1.Nhap hang ");
        System.out.println("2.In thong tin");
        System.out.println("MOI BAN LUA CHON");
        luachon =input.nextInt();
        switch(luachon){
           
            case 2:     ;break;
            case 3: System.out.println("Bye , See you later");
            default: System.out.println("Wrong, Please you input again");
        }while(luachon != 3);
       
        
    }
   
    
}
