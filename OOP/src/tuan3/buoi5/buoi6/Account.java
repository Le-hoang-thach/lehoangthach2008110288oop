package tuan3.buoi5.buoi6;

import java.text.NumberFormat;
import java.util.Scanner;

public class Account {
    static Scanner input = new Scanner(System.in);
    private String tenTk;
    private long sTk;
    private  double tienTk;
    public Account(){
        // constructor mac dinh
    }
    public Account(String tenTk, long stk, double tienTk){
        this.tenTk = tenTk;
        this.sTk = sTk;
        this.tienTk = tienTk;
    }
    public void setsTk(long sTk) {
        this.sTk = sTk;
    }
    public long getsTk() {
        return sTk;
    }
    public void settenTk(String tenTk) {
        this.tenTk = tenTk;
    }
    public String gettenTk() {
        return tenTk;
    }
    public void settienTk(double tienTk) {
        this.tienTk = tienTk;
    }
    public double gettienTk() {
        return tienTk;
    }
    @Override
    public String toString(){
        NumberFormat tienEN = NumberFormat.getInstance();
        String str = tienEN.format(tienTk);
        return  sTk  + "-" + tenTk + "-" +str;
    }
    public double napTien(){
        double nap;
        System.out.println("Nhap so tien ban muon nap:");
        nap = input.nextDouble();
        
        if(nap >= 0){
            NumberFormat tienEN = NumberFormat.getInstance();
            String str = tienEN.format(nap);
            System.out.println("ban vua nap " +str +"vao tai khoan." );
        }else{
            System.out.println("so tien nap vao khong hop le");
        }
        return nap;
    }
    public double daoHan(){
        double laiSuat = 0.035;
        tenTk = tenTk + tienTk * laiSuat;
        NumberFormat tienEN = NumberFormat.getInstance();
        String str = tienEN.format(tienTk);
        System.out.println("so tien trong tk " +str +"tu dao han 1 thang");
        return tienTk;
    } 
    void inTK() {
        NumberFormat tienEN = NumberFormat.getCurrencyInstance();
        String str1 = tienEN.format(sTk);
        System.out.printf("%-10d %-20s %-20s \n", sTk, tenTk, str1);
    }


    
}
