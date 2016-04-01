package luaspersegi;

import java.util.Scanner;

public class LuasPersegi {
    static int p, l, luas;
    static Scanner sc = new Scanner(System.in);
    
    static int hitung_luas(int panjang,int lebar){
        int luas = panjang*lebar;
        return luas;
    }
    
    static void input(){
        System.out.println("Panjang: ");
        p = sc.nextInt();
        System.out.println("Lebar: ");
        l = sc.nextInt();
    }
    public static void main(String[] args) {
        input();
        System.out.println("Luas Persegi = " +hitung_luas(p,l));
    }
    
}
