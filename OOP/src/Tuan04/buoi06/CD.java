package Tuan04.buoi06;

import java.util.Scanner;

public class CD {
    // attribute
    //emplementation
    private Scanner input = new Scanner(System.in);
    private int maCD;
    private String tuaCD;
    private String tenCaSi;
    private int soBaiHat;
    private double giaThanh;
    // method
    // interface
    
    
    
    public CD( int maCD, String tuaCD, String tenCaSi, int soBaiHat, double giaThanh) {
  
        
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.tenCaSi = tenCaSi;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }
   public CD(){
       
   }
   
    
    
    
   public int getMaCD() {
       return maCD;
   }
   public void setMaCD(int maCD) {
       this.maCD = maCD;
   }
    public String getTuaCD() {
        return tuaCD;
    }
    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }
    public String getTenCaSi() {
        return tenCaSi;
    }
    public void setTenCaSi(String tenCaSi) {
        this.tenCaSi = tenCaSi;
    }
    public int getSoBaiHat() {
        return soBaiHat;
    }
    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }
    public double getGiaThanh() {
        return giaThanh;
    }
    public void setGiaThanh(double giaThanh) {
        this.giaThanh = giaThanh;
    }
    public void nhapThongTin(){
        System.out.println("Ma CD: " );
        maCD = input.nextInt();
        System.out.println("Tua CD: ");
        tuaCD = input.nextLine();
        System.out.println("Ten Ca si:");
        tuaCD = input.nextLine();
        System.out.println("So bai hat: ");
        soBaiHat = input.nextInt();
        System.out.println("Gia thanh: ");
        giaThanh = input.nextDouble();
    }
    public void xuatThongTin(){
        System.out.println("Ma cd:" +this.maCD);
        System.out.println("Tua cd:" +this.tuaCD);
    }
    
   


}
