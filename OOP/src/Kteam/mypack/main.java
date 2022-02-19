package Kteam.mypack;

public class main {
     /*
    gồm thuộc tính và pbhuowng thức;
    thuộc tính :là information 
    phuong thưc la hanh dong
    */
    public static void main(String[] args) {
        Person  a = new Person("Thach ", 19, 1.72f);
        
        a.eat("Fish");
        a.run(" cong vien hoang van thu");
        int age = a.getAge();
        System.out.println("his age : " + age);
           
       }
}
