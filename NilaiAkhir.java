package nilaiakhir;
import java.util.Scanner;
public class NilaiAkhir {

    public static double nilaiAkhir = 0;
    public static char nilaiHuruf = ' ';

public static void HitungNilai(){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Nilai UTS : ");
    double uts = keyboard.nextDouble();
    System.out.println("Nilai UAS : ");
    double uas = keyboard.nextDouble();
    System.out.println("Nilai Tugas : ");
    double tugas = keyboard.nextDouble();
    nilaiAkhir=0.3*uts+0.5*uas+0.2*tugas;
    System.out.println("Nilai Akhir: " + nilaiAkhir);
}

public static void NilaiHuruf(){
    if(nilaiAkhir>=85) nilaiHuruf='A';
    else
        if(nilaiAkhir>=70) nilaiHuruf='B';
    else
            if(nilaiAkhir>=50) nilaiHuruf='C';
    else
                if(nilaiAkhir>=30) nilaiHuruf='D';
    else
                    nilaiHuruf='E';
    System.out.println("NilaiHuruf: " +nilaiHuruf);
}

    public static void main(String[] args) {
HitungNilai();
NilaiHuruf();
    }
}
