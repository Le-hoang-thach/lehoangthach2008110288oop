package OO;

import java.util.Scanner;

public class Account {
    //data
    Scanner input = new Scanner(System.in);
    int deposit;
    int withdramwals;
    int account_number = 13072002;
    int account_blance = 0;
    //function
    //operation
    void deposits(){
        //code
        System.out.println("Please input deposit:");
        deposit = input.nextInt();
        account_blance += deposit;

    }
    void withdramwals(){
        //code
        System.out.println("Please input Withdramwals:");
        withdramwals = input.nextInt();
        account_blance -= withdramwals;
    }
    void show(){
        //code
        System.out.println("Information");
        System.out.println("----------------");
        System.out.println("Account-number: " + account_number);
        System.out.println("Account-blance: " + account_blance);
        System.out.println("----------------");
    }
    public void setsTk(long nextLong) {
    }
    public void settenTk(String nextLine) {
    }
    public void settienTk(int i) {
    }
    public void inTK() {
    }
    public long getSoTK() {
        return 0;
    }
    public void napTien() {
    }
    public void rutTien() {
    }
    public void daoHan() {
    }
    public double getSoTienTrongTK() {
        return 0;
    }
    public void setSoTienTrongTK(double chuyen) {
    }
   
}
