package Kteam.mypack;

public class SinhVien {
    public String name;
    public int age;
    public float height;
    public static String university = "Gia Dinh university";
    public static int total = 0;
    public SinhVien(String name, int age, float height){
        this.name = name;
        this.age = age;
        this.height = height;
        total += 1;
    }
}
