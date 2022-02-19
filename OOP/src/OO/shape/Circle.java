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
    void  rotate(){
       System.out.println("ò ...... ò ...... ò"  +" 360 ");
    }
    void playSound(){
        System.out.println("files sound " + this.fileSound + " music");
    }
  
}
