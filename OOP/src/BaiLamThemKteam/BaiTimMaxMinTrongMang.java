package BaiLamThemKteam;

import java.util.Scanner;

public class BaiTimMaxMinTrongMang {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        int []a;
        
        System.out.println("Nhap so phan tu trong mang:");
        n = input.nextInt();
        /*
        khởi tạo mảng
        */
        a = new int[n];
        nhap(a,n);
        xuat(a,n);
        max(a,n);
        min(a,n);
        sapxep(a, n);
        xuat(a,n);

    }
    public static void nhap(int a[],int n){
        System.out.println("Moi nhao gia tri:");
        for(int i =0  ;i<n;i++){
            System.out.print("a[" + i + "]: ");
            a[i] = input.nextInt();
        }
    }
    public static void xuat(int a[],int n){
        System.out.println("Phan tu trong mang la:");
        for(int i =0  ;i<n;i++){
            System.out.println ("a[" + i + "] = " + a[i]);
           
        }
    }
    public static void max(int a[],int n){
        int max = a[0];
        for(int i = 0;i<n;i++){
            if(a[i] > max){
                max = a[i];
            }
            
        }System.out.println("Gia tri lon nhat: " + max);
       
    }
    public static void min(int a[], int n){
        int min = a[0];
        for(int i =0 ;i<n;i++){
            if(a[i] <min){
                min = a[i];
            }
        }
        System.out.println("Gia tri  nho nhat: " + min);
    }
    public static void sapxep(int a[],int n){
        int temp;
        for(int i = 0;i<n;i++){
            for(int j =0;j<n-1;j++){
                if(a[j+1] <a [j]){
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        
    }
}
