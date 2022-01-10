package OO;

import java.util.Scanner;

public class AccountTestDrive {
    public static void main(String[] args) {
        int quantily;
        Account account = new Account();
        Customer customer = new Customer(); 
        account.show();
        account.deposits(500);
        account.show();
        account.withdramwals(100);
        account.show();
        customer.inputInformation();
        customer.showInformation();
       
        

    }
    
    
}
