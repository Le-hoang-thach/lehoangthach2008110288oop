package OO;

import java.util.Scanner;

public class Customer {
    Scanner input = new Scanner(System.in);
    // data
    // dữ liệu
    String name;
    int age ;
    String address;
    int identity_card;
    int phone_number;
    //function
    //opertion
    // hàm
    public Customer(String Name, int Age, int Indentity_card, int Phone_number){
        name= Name;
        age = Age;
        identity_card = Indentity_card;
        phone_number = Phone_number;
    }
    public void name(){
        System.out.println("Full name: " + name);

    }
    public void Age(){
        System.out.println("Age: " + age );
    }
    public void indentity_card(){
        System.out.println("");
    }
    
}
