package BaiLab4;



public class SanPhamTestDriver {
    public static void main(String[] args) {
        // bai 1 va 2
      /*  
        SanPham sp1 = new SanPham();
        sp1.nhap();
        sp1.xuat();
        SanPham sp2 = new SanPham();
        sp2.nhap();
        sp2.xuat();*/
        // bai 3
        SanPham sp3 = new SanPham("bo", 250000, 20000, 230000);
        sp3.xuat();
        SanPham sp4 = new SanPham("rau muong", 15000, 5000, 10000);
        sp4.xuat();
        //bai 4
        SanPham sp5 = new SanPham("gao", 300000, 20000, 280000); 
        sp5.xuat();
        System.out.println("tong tien sau khi giam gia: ");
        
        sp5.setGiamGia(20000, 280000);
        System.out.println(sp5.getGiamGia());
        
        




    }
}
