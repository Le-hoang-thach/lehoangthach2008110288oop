package Kteam;

import java.util.Scanner;

public class Preson {
    public Scanner input = new Scanner(System.in);
    public String name;
    public int age;
    public float height;
    public Preson(String name , int age, float heigth){
        this.name = name + "kteam";
        this.age = age;
        this.height = heigth;
    }
    public void eat(String footname){
       System.out.println(name + " is eating " + footname);
    }
    public void run(String adress){
        System.out.println(name + " chay quanh " +adress );
    }
    public int getAge(){
        return age;
    }
}
