package Kteam;

import java.util.Scanner;

public class Preson {
    public Scanner input = new Scanner(System.in);
    public String name;
    public int age;
    public float height;
    
    public Preson() {
    }
    public Preson(String name , int age, float heigth){
        this.name = name + "kteam";
        this.age = age;
        this.height = heigth;
    }
    public Scanner getInput() {
        return input;
    }
    public void setInput(Scanner input) {
        this.input = input;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "Preson [age=" + age + ", height=" + height + ", input=" + input + ", name=" + name + "]";
    }
    
    
}
