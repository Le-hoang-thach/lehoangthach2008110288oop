package tuan3.buoi5.buoi6;

public class HinhChuNhat {
    //Attribute
    //emplemetation
    private double chieudai;
    private double chieurong;
    


    
    // interfaces
    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }
    public double getChieudai() {
        return chieudai;
    }  
    public void setChieurong(double chieurong) {
        this.chieurong = chieurong;
    }  
    public double Chieurong() {
        return chieurong;
    }
    
    public double tinhDienTich() {
        return this.chieurong * this.chieudai;
    }
    
    public double tinhChuVi() {
        return (this.chieudai + this.chieurong) *2;
    }
    public String toString(){
        String str  = "Chieu dai: " + this.chieudai + " chieu rong:" + this.chieurong;
        str += " dien tich: " + this.tinhDienTich() + ", chu vi " + this.tinhChuVi();
        
        return str; 
    }
}
