package OO;



public class Account {
    //data
    int account_number = 13072002;
    int account_blance = 0;
    //function
    //operation
    void deposits(int amount){
        //code
        account_blance += amount;

    }
    void withdramwals(int amount){
        //code
        account_blance -= amount;
    }
    void show(){
        //code
        System.out.println("Information");
        System.out.println("Account-number: " + account_number);
        System.out.println("Account-blance: " + account_blance);
    }
   
}
