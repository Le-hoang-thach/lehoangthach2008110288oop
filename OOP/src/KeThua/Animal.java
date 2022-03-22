package KeThua;

public class Animal {
    // attribute
    private String makeNoise;
    private String eat;
    private String sleep;
    private String roams;
    //method
    public Animal(){
        // constructor mac dinh
    }
    public Animal(String makeNoise, String eat, String sleep, String roams){
        this.makeNoise =makeNoise;
        this.eat =eat;
        this.roams = roams;
        this.sleep =sleep;
    }
    public void makeNoise(){
        System.out.println("U...........");
    }
    public void roams(){
        System.out.println("di ve nha");
    }
    public void eat(){
        System.out.println("an com");
    }
}