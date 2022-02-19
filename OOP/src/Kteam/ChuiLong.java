package Kteam;

import java.util.Scanner;

public class ChuiLong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        System.out.println("nhap so tuoi cua long:");
        i = input.nextInt();
        if(i == 22){
            System.out.println("Chuc mung sinh nhat long");
        }else {
            System.out.println("Chua toi sinh nhat");
        }
    }
}
