package OO;

public class Cow {
    // attribute
    // data
    String name;
    boolean gioiTinh;
    int canNang;
    String giong;
    String mau;
    public Cow(String Name,int CanNang, String Giong, String Mau){
        name = Name;
        canNang  = CanNang;
        giong = Giong;
        mau = Mau;
    }
    public void name(){
        System.out.println("Name:" + name);
    }
    public void giong(){
        System.out.println("Species:" + giong);
    }

    
    public void gioiTinh(){
        System.out.println("Sex:" + gioiTinh);
    }
    public void canNang(){
        System.out.println("Weight:" + canNang);
    }
    public void mau(){
        System.out.println("Color : " + mau);
    }
}
