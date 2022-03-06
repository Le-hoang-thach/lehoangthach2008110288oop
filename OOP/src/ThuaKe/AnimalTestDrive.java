package ThuaKe;

public class AnimalTestDrive {
    public static void main(String[] args) {
        Lion lion = new Lion("ot ot","pictures lion", "lang thang ....... lang thang......lang thang","sutu", "meats");
        lion.setEat("meats");
        lion.setName("Su tu");
        System.out.println("Animal: " +lion.getName());
        lion.getInfo();
        System.out.println("Eats: " + lion.getEat());
       
        
    }
}
