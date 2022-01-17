package OO;

import java.util.Scanner;

public class Student {
    // attribute
    //data
    //state
    Scanner input = new Scanner(System.in);
    String name;
    double age;
    String Code_Student;
    String lop;
    public Student(){
        
    }
    public Student(String name , double age){
        this.name = name;
        this.age = age;

    }
    public Student(String name, double age, String  Code_Student,String lop){
        // hàm phảt đặt đầu tiên
        this(name, age);
        this.Code_Student = Code_Student;
        this.lop = lop;
    }
    void hoc(){
        // code 
        System.out.println("Please , input class");
 
    }
    void doc(){
        //code
        System.out.println("Please, input  favorite book");
        
    }
    void thi(){
        System.out.println("Score");
    }
    void hoatDongNgoaiKhoa(){
        System.out.println("sport");
    }
  
}
