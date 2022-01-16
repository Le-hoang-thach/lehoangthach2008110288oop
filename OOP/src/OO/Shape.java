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
    public Shape(String Name,String _turn,String _sound){
        name = Name;
        turn = _turn;
        sound = _sound;
    }
    void name(){
        System.out.println("Full name:" + name);
    }
    void turn(){
        System.out.println("Shape:" + turn);
    }
    void sound(){
        System.out.println("Sound:" + sound);
    }
}
