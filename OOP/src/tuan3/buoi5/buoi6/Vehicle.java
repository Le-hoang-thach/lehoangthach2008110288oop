package tuan3.buoi5.buoi6;

public class Vehicle {
    //attributte
    //emplementation
    private String name;
    private String loaiXe;
    private int dungTich;
    private double triGia;
 
    //method
    //interface
    public Vehicle(String name, String loaiXe, int dungTich, double triGia ){
        this.name = name;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
        
    }
    public Vehicle()
    {

    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }
    public int getDungTich() {
        return dungTich;
    }
    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }
    public String getLoaiXe() {
        return loaiXe;
    }
    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }
    public double getTriGia() {
        return triGia;
    }
    public double tinhThue(){
        double thue;
        if(dungTich<100) thue=triGia*0.01;
        else if (dungTich >= 100 && dungTich<=200) thue = triGia * 0.03;
        else thue = triGia * 0.05;
        return thue;
    }
    public String toString(){
        String xuat = name + "-" + loaiXe + "-" + dungTich + "-" +triGia ;
        return xuat;
    }

    public void inThue(){
        System.out.printf(" %-20s %5d %10.2f  %8.5f \n ",name,dungTich,triGia,tinhThue());
    }


    
}
