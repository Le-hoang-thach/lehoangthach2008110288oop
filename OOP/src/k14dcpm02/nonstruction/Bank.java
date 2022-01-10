package k14dcpm02.nonstruction;

import java.util.Scanner;


public class Bank {
    public static void main(String[] args) {
        //data
        int account_number = 13072002;
        int account_blance = 0;
        Scanner input = new Scanner(System.in);
        // Gởi tiền
        int deposits;
        System.out.println("Nhập số tiền cần gởi:");
        deposits = input.nextInt();
        account_blance += deposits;
        // show
        System.out.println("Information");
        System.out.println("Account-number: " + account_number );
        System.out.println("Account-blance: " + account_blance);
        //Rút tiền
        int withdrawals;
        System.out.println("Nhập số tiền cần rút:");
        withdrawals = input.nextInt();
        account_blance -= withdrawals;
        //show
        System.out.println("Information");
        System.out.println("Account-number: " + account_number);
        System.out.println("Account-blance: " + account_blance);
        //Rút tiền
        System.out.println("Nhập số tiền cần rút:");
        withdrawals = input.nextInt();
        account_blance -= withdrawals;
        //show
        System.out.println("Information");
        System.out.println("Account-number: " + account_number);
        System.out.println("Account-blance: " + account_blance);

    }
}
