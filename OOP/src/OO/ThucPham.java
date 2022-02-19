package OO;

import java.util.Scanner;

public class ThucPham {
    //attribute
    //data
    Scanner input = new Scanner(System.in);
    String name;
    int gia;
    //function
    //opertion
    public ThucPham(String name, int gia){
        this.name = name;
        this.gia  = gia;


    }
    void nhapThongTin(){
        System.out.println("Please, name product: ");
        name = input.nextLine();
        System.out.println("Please, Price: ");
        gia = input.nextInt();
    }
    void inThongTin(){
        System.out.println("Full name: " + name);
        System.out.println("Price: "  + gia);
    }
}
