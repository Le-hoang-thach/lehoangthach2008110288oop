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
   
    void inputInformation(){
        System.out.println("Please input your name:");
        name = input.next();
        System.out.println("Please input age:");
        age = input.nextInt();
        System.out.println("Please input address:");
        address = input.next();
        System.out.println("Please input indentity card:");
        identity_card = input.nextInt();
        System.out.println("Please input phone number:");
        phone_number = input.nextInt();
    }
    void showInformation(){
        System.out.println("Fist and last name :" + name ) ;
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Indentity card: " + identity_card);
        System.out.println("Phone mumber: " + phone_number);  
    }
}
