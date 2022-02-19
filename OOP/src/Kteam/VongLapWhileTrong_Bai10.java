package Kteam;

public class VongLapWhileTrong_Bai10 {
    /*
        vòng lặp while là tạo 1 dòng code chạy đi chạy lại nhiều lần đến 1 điều kiện nào đó kết thúc
        trong while ta tạo 1 điều kiện cho lặp  nếu đk đúng khối lệnh sẽ lặp cho đến khi điều kiện sai
        có hai dạng while và do while :
        while <biều thức điều kiện khối lệnh lặp

    */
    public static void main(String[] args) {
        int i = 0;
        while(i < 10){
            System.out.println(i);
            i += 1;
        }
        do {
            System.out.println(i);
            i += 1;
        } while (i<10);
    }
}
