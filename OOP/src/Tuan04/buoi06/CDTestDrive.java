package Tuan04.buoi06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CDTestDrive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu:");
        int n = in.nextInt();
        CD []cd = new CD[n];
        ArrayList<CD> cD = new ArrayList<>(Arrays.asList(cd));
        for(int i = 0;i< cd.length;i++){
            System.out.println("Dia CD thu " + (i+1) +":" + "\n");
            cd[i] = new CD();
            cd[i].nhapThongTin();

        }
        cd = cD.toArray(new CD[0]);
        System.out.println(Arrays.toString(cd));
        
        
                       
    }
}