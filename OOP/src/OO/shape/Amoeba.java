package OO.shape;

public class Amoeba {
    // attribute
    String fileSound;
    // method
    public Amoeba(String fileSound){
        this.fileSound = fileSound;
    }
    void Rotate(){
        System.out.println("vu .... vu .... vu");
    }
    void playSound(){
        System.out.println("dang quay ne " + this.fileSound + " 360");
    }
}
