package tuan3.buoi5;

import java.util.ArrayList;

public class DogTestDriver {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Lucy");
        dog.setBreed("Cai");
        dog.setSize(10);
        System.out.println("Name: " + dog.getName()+"\n"+"Breed: "+dog.getBreed() +"\n"+"Size of dog: " + dog.getSize());
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog(14, "cai", "lucy"));
       System.out.println(dogs.toString());
        
        
    }
}
