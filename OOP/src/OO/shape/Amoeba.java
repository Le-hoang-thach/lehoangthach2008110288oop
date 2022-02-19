package OO.shape;

public class Amoeba {
    // attribute
    String fileSound;
    double x,y;
    // method
    public Amoeba(String fileSound){
        this.fileSound = fileSound;
    }
    public Amoeba(String fileSound, double x,double y){
        this(fileSound);
        this.x = x;
        this.y = y;
    }
    void rotate(){
        System.out.println("vu .... vu .... vu" + " 360");
    }
    void playSound(){
        System.out.println("files sound " + this.fileSound + " music");
        System.out.println("tọa độ x :" + this.x + " tọa độ y:" + this.y);
    }
}
