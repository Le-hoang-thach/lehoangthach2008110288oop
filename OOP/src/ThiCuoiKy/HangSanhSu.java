package ThiCuoiKy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HangSanhSu extends HangHoa {
    private Date ngayNhapKho;
    private String nhaSX;
   
    public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTonKho, Date ngayNhapKho, String nhaSX) {
        super(maHang, tenHang, donGia, soLuongTonKho);
        this.ngayNhapKho = ngayNhapKho;
        this.nhaSX = nhaSX;
    }



    public HangSanhSu() {
        
    }



    
    
   
    
    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }
    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }
    public String getNhaSX() {
        return nhaSX;
    }
    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }
    @Override
    public double tinhTien() {
        // TODO Auto-generated method stub
        double tien = 0;
        tien = this.getDonGia() * 0.1;
        return tien;
    }
    @Override
    public String toString() {
        return "HangSanhSu " + super.toString()+ "  ngayNhapKho= " + ngayNhapKho + ", nhaSX=" + nhaSX + " thue: " + tinhTien()+ "]";
    }
    @Override
    public void kiemTraHSD() {
        // TODO Auto-generated method stubs
       
        HangHoa hangHoa = new HangSanhSu();
        HangSanhSu hangSanhSu  = (HangSanhSu) hangHoa;
        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
        Date ngayHienTai = new Date();
        Calendar c = Calendar.getInstance();
        Calendar v = Calendar.getInstance();
        c.setTime(ngayHienTai);
        v.setTime(ngayNhapKho);
        int ngayHienTai1 = c.get(Calendar.DATE);
        int ngayNhapKho1 = v.get(Calendar.DATE);
        int tinhNgay = ngayHienTai1 - ngayNhapKho1;
        if(this.getSoLuongTonKho() > 50 && tinhNgay >10){
            System.out.println("Hang Hoa ban cham");
        }else{
            System.out.println("Hang Hoa ban chay");
        }
        
    }
    
    
    
}
