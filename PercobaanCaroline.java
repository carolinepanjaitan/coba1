package percobaancaroline;

import java.util.Scanner;

class matematika {
    Scanner scan = new Scanner(System.in);
    
    public int a, b, hasil = 0;
    
    public void penjumlahan(){
        System.out.println("Masukkan Bilangan Pertama: ");
        a = scan.nextInt();
        System.out.println("Masukkan Bilangan Kedua: ");
        b = scan.nextInt();
                hasil = a + b;
                System.out.println("Hasil = " +hasil);
    }
    
    public void pengurangan(){
        System.out.println("Masukkan Bilangan Pertama: ");
        a = scan.nextInt();
        System.out.println("Masukkan Bilangan Kedua: ");
        b = scan.nextInt();
        hasil = a - b;
        System.out.println("Hasil = " +hasil);
    }
    
    public void perkalian(){
        System.out.println("Masukkan Bilangan Pertama: ");
        a = scan.nextInt();
        System.out.println("Masukkan Bilangan Kedua: ");
        b = scan.nextInt();
        hasil = a * b;
        System.out.println("Hasil = " +hasil);
    }   
    
    public void pembagian(){
        System.out.println("Masukkan Bilangan Pertama: ");
        a = scan.nextInt();
        System.out.println("Masukkan Bilangan Kedua: ");
        b = scan.nextInt();
        hasil = a / b;
        System.out.println("Hasil = " +hasil);
    }
}

public class PercobaanCaroline {
    
        public static void main(String[] args) {
            System.out.println(" ");
            Scanner scan = new Scanner(System.in);
            int c = 0;
            matematika d;
            d = new matematika();
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println(" ");
            System.out.println("Pilih Pilihan Anda: ");
            c = scan.nextInt();
            if ((c>4) || (c<0)){
                System.out.println("Anda Salah Memasukkan Nomor");
            }
            else
                if (c==1){
                    d.penjumlahan();
                }
            else
                    if (c==2){
                        d.pengurangan();
                    }
            else
                        if (c==3){
                            d.perkalian();
                        }
            else
                            if (c==4){
                                d.pembagian();
                            }
            System.out.println(" ");
            System.out.println("Omedetou... Kamu Berhasil Menjalankan Project Percobaan Ini!");
    }
    
}
