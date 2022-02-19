package BaiLamThemKteam;

import java.util.Scanner;

public class SoNguyen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Nhap vao 1 so nguyen: ");
        n = input.nextInt();
        if(n > 0){
            System.out.println("day la so nguyenn duong");
        }else{
            System.out.println("day la so nguyen am");
        }
    }
}
