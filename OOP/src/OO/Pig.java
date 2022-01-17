package OO;

public class Pig {
    int size;
    String name;
    String breed;
    
   
    public 
    
    void bark(){
        if(size >20){
            System.out.println("ec/ec/ec");
        }else {
            System.out.println("uc/uc/uc");
        }
    }
    void setBigger(){
        size += 10;
    }
    void bed(){
        System.out.println("Zzzzzz");
        this.bark();
    }
    

}
