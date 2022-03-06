package ThuaKe;

public class Animal {
    
    private String hunger;
    private String picture;
    private String roams;
    private String eat;

    public Animal(){

    }
    public Animal( String hunger, String picture, String roams){
        this.picture = picture;
        
        this.hunger = hunger;
        this.roams = roams;
    }
    
    
    public void setHunger(String hunger) {
        this.hunger = hunger;
    }
    public String getHunger() {
        return hunger;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
    public String getPicture() {
        return picture;
    }
    public void setRoams(String roams) {
        this.roams = roams;
    }
    public String getRoams() {
        return roams;
    }
    public void getInfo(){
        System.out.println("Picture: " + picture);
        System.out.println("Hunger: " + hunger);
        System.out.println("Roams: " + roams);
       
        
    }

   
}