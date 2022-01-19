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
    void Rotate(){
        System.out.println("u ...... u ...... u" );

    }
    void playSound(){
        System.out.println("dang quay " + this.fileSound + "360");
    }
  
}
