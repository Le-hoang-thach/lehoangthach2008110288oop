package ThiCuoiKy;

import java.util.Date;
import java.text.SimpleDateFormat;

public class HangThucPham extends HangHoa {
    private Date ngaySX;
    private Date ngayHetHan;
    
    public HangThucPham(String maHang, String tenHang, double donGia, int soLuongTonKho, Date ngaySX,
    Date ngayHetHan) {
        super(maHang, tenHang, donGia, soLuongTonKho);
        this.setNgaySX(ngaySX);
        this.setNgayHetHan(ngayHetHan);
        
    }
        public HangThucPham() {

    }
    public Date getNgaySX() {
        return ngaySX;
    }
   
   
    public void setNgaySX(Date ngaySX) {
        this.ngaySX = ngaySX;
    }
    public Date getNgayHetHan() {
        return ngayHetHan;
    }
    public void setNgayHetHan(Date ngayHetHan) {
        if(ngayHetHan.after(ngaySX)){
            this.ngayHetHan = ngayHetHan;
           
        }else{
            System.out.println("Ngay het han phai sau ngay san xuat");
            
        }
           
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
        return "Hang thuc pham "+ super.toString() + ", ngayHetHan=" + ngayHetHan + ", ngaySX="
        +ngaySX + " thue: " + tinhTien() + "]" ;
    }
    public boolean tinhHSD(){
        boolean isHetHan = false;
        Date ngayHienTai = new Date();
        if(this.ngayHetHan.before(ngayHienTai)){
            isHetHan = true;
        }else{
            isHetHan = false;
        }
        return isHetHan;
    }

    
  
    @Override
    public void kiemTraHSD() {
        // TODO Auto-generated method stub
        HangHoa hangHoa = new HangThucPham();
        HangThucPham hangThucPham = (HangThucPham) hangHoa;
        if(this.getSoLuongTonKho() > 0 && this.tinhHSD() == false ){
            System.out.println("Hang khong ban chay");
        }else{
            System.out.println("Hang ban chay");
        }
    }
    @Override
    public double tinhTien() {
        // TODO Auto-generated method stub
        double tien = 0;
        tien = this.getDonGia() * 0.05;
        return tien;
        
    }

   
    



    
    
}
