package OO;

public class Shape {
    //data
    //attribute
    //state
    String name;
    String turn;
    String sound;
    // function
    // opertion
    //method
    public Shape(){
        // hàm mặc định // default constructor
        
    }
    public  Shape(String Name,String _turn,String _sound){
        name = Name;
        turn = _turn;
        sound = _sound;
    }
    void inThongTin(){
        System.out.println("Full name:" + name);
        System.out.println("Shape:" + turn);
        System.out.println("Sound:" + sound);

    }
  
}
