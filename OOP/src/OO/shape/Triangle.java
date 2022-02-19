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
    void rotate(){
        System.out.println("i ...... i ...... i" + " 360");

    }
    void playSound(){
        System.out.println("files sound " + this.fileSound + " music");
    }

}
