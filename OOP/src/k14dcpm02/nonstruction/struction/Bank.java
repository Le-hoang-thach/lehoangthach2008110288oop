package k14dcpm02.nonstruction.struction;


import java.util.Scanner;

public class Bank {
    static int account_number = 13072002;
    static int account_blance = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Gởi tiền
        int deposits;
        System.out.println("Nhập số tiền cần gởi:");
        deposits = input.nextInt();
        account_blance += deposits;
        // show
        show();
        //Rút tiền
        int withdrawals;
        System.out.println("Nhập số tiền cần rút:");
        withdrawals = input.nextInt();
        account_blance -= withdrawals;
        //show
       show();
        //Rút tiền
        System.out.println("Nhập số tiền cần rút:");
        withdrawals = input.nextInt();
        account_blance -= withdrawals;
        //show
        show();

    }
    static void show(){
        System.out.println("Information");
        System.out.println("Account-number: " + account_number);
        System.out.println("Account-blance: " + account_blance);
    }
}
