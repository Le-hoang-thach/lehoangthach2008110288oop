package Kteam;

public class OOP_bai16 {
    /*
    gồm thuộc tính và pbhuowng thức;
    thuộc tính :là information 
    phuong thưc la hanh dong
    */
    public static void main(String[] args) {
        Preson  a = new Preson("thach " , 19 ,1.72f);
        
        a.eat("Fish");
        a.run(" cong vien hoang van thu");
        int age = a.getAge();
        System.out.println("his age : " + age);
           
       }
    }

