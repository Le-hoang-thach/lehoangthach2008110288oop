package OO;

import java.util.Scanner;

public class Employee {
    // data
    Scanner input = new Scanner(System.in);
    String name;
    int age;
    int identity_card;
    String address;
    int phone_number;
    int position;
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
        System.out.println("Plese position");
        position = input.nextInt();
    }
    void outputInformation(){
        System.out.println("Fist and last name :" + name ) ;
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Indentity card: " + identity_card);
        System.out.println("Phone mumber: " + phone_number);  
        System.out.println("Plese position:" + position);
    }
}
