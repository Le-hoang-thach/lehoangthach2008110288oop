package OO;

public class Customer {
    Static Scanner input = new Scanner(System.in);
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
    void inThongTin(){
        System.out.println("Fist and last name :" + name ) ;
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Indentyti card: " + identity_card);
        System.out.println("Phone mumber: " + phone_number);  
    }


}
