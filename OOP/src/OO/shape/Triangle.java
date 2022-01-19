package OO.shape;

public class Triangle {
    //data
    //attribute
    //state
    String fileSound;
    // function
    // opertion
    //method
    
    public Triangle(String fileSound){
       this.fileSound = fileSound;
    }
    void Rotate(){
        System.out.println("i ...... i ...... i" );

    }
    void playSound(){
        System.out.println("dang quay " + this.fileSound + "360");
    }

}
