package tuan3.buoi5.buoi6;

import java.util.Scanner;

public class SinhVien {
    // attribute
    // emplemetation
  
    private int MSSV;
    private String tenSV ;
    private float LT;
    private float Th;
    //method
    // interfaces
    public SinhVien (){

    }
    public SinhVien(int MSSV, String tenSV, float LT, float Th){
        this.tenSV = tenSV;
        this.MSSV = MSSV;
        this.LT =LT;
        this.Th = Th ;
    }
    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }
    public int getMSSV() {
        return MSSV;
    }
    public float getLT() {
        return LT;
    }
    public String getTenSV() {
        return tenSV;
    }
    public float getTh() {
        return Th;
    }
    public void setMSSV(int mSSV) {
        MSSV = mSSV;
    }
    public void setLT(float lT) {
        this.LT = lT;
    }
    
    public void setTh(float th) {
        this.Th = th;
    }
  

    public float tinhDiemTB(){
        return (this.LT + this.Th)/2;
    }
   public String toString(){
        
    String bien = "Ten sinh vien: " + this.tenSV + " MSSV: "  + this.MSSV +  " diem ly thuyet: "  + this.LT +  " Diem thuc hanh: " + this.Th + " diem trung binh: "  + this.tinhDiemTB();
    return bien;
}


}
