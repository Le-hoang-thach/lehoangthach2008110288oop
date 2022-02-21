package tuan3.buoi1;



public class DogTestDriver {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Lucy");
        dog.setBreed("Cai");
        dog.setSize(10);
        System.out.println("Name: " + dog.getName()+"\n"+"Breed: "+dog.getBreed() +"\n"+"Size of dog: " + dog.getSize());
        
    }
}
