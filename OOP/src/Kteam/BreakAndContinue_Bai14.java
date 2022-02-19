package Kteam;

public class BreakAndContinue_Bai14 {
    /*
    dừng vòng chứa nó đang chạy

    */
    public static void main(String[] args) {
        int tong = 0;
        int a[] ={1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
       
            for(int h: a){
                if(h % 2 !=0){
                    continue;
                }
                tong = tong + h;
            }
        
        System.out.println("Tong cac so chan chia het cho 2 trong mang la: " +tong );

    }
}
