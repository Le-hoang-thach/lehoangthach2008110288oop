package OO.shape;

public class Square {
    //data
    //attribute
    //state
   String fileSound;
    // function
    // opertion
    //method
   
    public  Square(String fileSound){
        this.fileSound = fileSound;
    }
    void rotate(){
        System.out.println("u ...... u ...... u" + " 360");

    }
    void playSound(){
        System.out.println("files sound " + this.fileSound + " music");
    }
  
}
