package tuan3.buoi5.buoi6;

public class CarTestDriver {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setcarColor("nau")  ;
        System.out.println("mau: "+ car1.getcarColor());
        car1.setcarPrice(500000);
        System.out.println("gia: " + car1.getcarPrice());
    }
}
