package ThiCuoiKy;

import java.text.ParseException;
import java.util.Comparator;

public  class HangHoa implements Comparator<HangHoa> {
    //attribute
    //emplementtation
    static HangHoa hangHoa = new HangHoa();
    private String maHang;
    private String tenHang;
    private double donGia;
    private int soLuongTonKho;
    
    //interface
    //method
    public  double tinhTien(){
        return 0;
    };
    public void kiemTraHSD() throws ParseException{

    };
 
    
   

    public static HangHoa getHangHoa() {
        return hangHoa;
    }
    public static void setHangHoa(HangHoa hangHoa) {
        HangHoa.hangHoa = hangHoa;
    }
    public HangHoa(String maHang, String tenHang, double donGia, int soLuongTonKho) {
        this.setMaHang(maHang);
        this.setTenHang(tenHang);
        this.setDonGia(donGia);
        this.setSoLuongTonKho(soLuongTonKho);
        
    }


    public HangHoa() {
        //contrustor mặc định
    }
    @Override
    public String toString() {
        return " [ commodity codes = " + maHang + ", Inventory number = " + soLuongTonKho + ", goods name = " + tenHang + " price = " + donGia ;
    }
    public String getMaHang() {
        return maHang;
    }
    public void setMaHang(String maHang) {
        if(maHang != null ){
            this.maHang = maHang;
        }else{
            System.out.println("Ma hang khoong duoc de rong !!!!");
        }
    }
    
    public String getTenHang() {
        return tenHang;
    }
    public void setTenHang(String tenHang) {
        if(tenHang != null){
            this.tenHang = tenHang;
        }else{
            System.out.println("Ten hang khong dc de rong!!!!");
        }
        
    }
    public int getSoLuongTonKho() {
        return soLuongTonKho;
    }
    public void setSoLuongTonKho(int soLuongTonKho) {
        if(soLuongTonKho >= 0){
            this.soLuongTonKho = soLuongTonKho;
        }else{
            System.out.println("So luong ton khong the am");
        }
           
    }
   

    public double getDonGia() {
        return donGia;
    }


    public void setDonGia(double donGia) {
        if(donGia >0){
            this.donGia = donGia;
        }else{
            System.out.println("San pham khong duoc be hon khong!!!");
        }
    }
    public void inThongTin(){
        System.out.println("Ten San pham:" + hangHoa.getTenHang());
        System.out.println("ma hang:" +hangHoa.getMaHang());
        System.out.println("so luong tron kho:" +hangHoa.getSoLuongTonKho());
        System.out.println("don gia:" + hangHoa.getDonGia());
    }
    @Override
    public int compare(HangHoa o1, HangHoa o2) {
        // TODO Auto-generated method stub
        return o1.getMaHang().compareTo(o2.getMaHang()) ;
    }
    

    
   
    

    
    
}
