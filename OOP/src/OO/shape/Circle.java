package OO.shape;

public class Circle {
    //data
    //attribute
   
    String fileSound; // object; /state
    // function
    // opertion
    //method => hành vi của đối tượng objectin heap memory
    
    public  Circle(String fileSound){
        this.fileSound = fileSound;
    }
    void  Rotate(){
       System.out.println("ò ...... ò ...... ò" );
    }
    void playSound(){
        System.out.println("dang quay " + this.fileSound + "360");
    }
  
}
