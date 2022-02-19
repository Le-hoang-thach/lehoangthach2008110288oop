package Kteam.mypack;

public class SinhVienTestDriver {
    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien("thach", 19, 1.72f);
        System.out.println("University (class): " + SinhVien.university);
        
        System.out.println("University (instance): " + sinhVien.university);
        System.out.println("University total : " + sinhVien.total);
        SinhVien sinhVien2 = new SinhVien("long", 19, 1.7f);
        System.out.println("University total: " + sinhVien2.total);

    }
}
