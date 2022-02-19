package Kteam;

public class VongLapForEach_Bai13 {
    /*
    for each để duyệt dữ liệu 
    for(<kiểu dữ liệu > <tên biến>:<tên mảng>)
    */
    public static void main(String[] args) {
        int []a = {1, 2, 3, 4, 5};
        for(int b: a){
            if(b %2 ==0){
                System.out.println(b);
            }
        }
        int c[][] = {{1, 2, 3},{2, 3, 4}};
        for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               System.out.print(c[i][j] +" ");
               
           }
           System.out.println();
       }
    }
}
