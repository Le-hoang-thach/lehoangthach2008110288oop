package Kteam;



public class KieuDuLieu_Bai5 {
    /* kieu du lieu la thu khi compiler nhin vao co the biet kich thuc cua bien 
    java có hai kiểu dữ liệu :
    . các kiểu dữ liệu nguyên thủy (primitive Data tyes) 
    . các kiểu dữ liệu tham chiếu  (reference tyes)
    primitive data tyes
    gồm có 8 kiểu và nằm trong kiểu dữ liệu của jav :
    primitive data tyes
    1: kiểu boolean
    lưu hai kiểu dữ liệu true hoăc false
    ví dụ: Boodlean isDone = false;
    2: kiểu byte
    kiểu gồm 1 byte (8bit)
    ví dụ:  byte a = 100;
    3: short 
    kiểu gồm 2 byte (16bit)
    ví dụ: short a = 100000;
    4: int 
    kiểu gồm 4 byte (32bit)
    ví dụ int a = 10000000;
    5: float 
    kiểu gồm 4 byte (32bit)
    ví dụ flaot a = 1.72f;
    6: long 
    kiểu gồm 8 byte (64 bit)
    ví dụ long a = 10000100;
    7: double
    kiểu gồm 8 byte (64 bit)
    ví dụ double a = 10000100; 
    8: char
    biến số thành kí tự
    reference tyes
    kiểu dữ liệu tham chiếu là kiểu dữ liêụ của đối tượng
    biến kiểu dữ liệu nằm chỉ chứa địa chỉ được lưu trữ bộ nhớ stack còn dữ liệu lại nằm  bộ nhớ heap
    

*/    
    public static void main(String[] args) {
        int in = 9;
        float out = 1.72f;
        long cute = 100000000;

        System.out.println(in + out + cute );
    }
}
