package p3;
import java.util.Scanner;

public class MatakuliahDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kode, nama, dummy;
        int sks, jumlahJam;

        System.out.print("Masukkan jumlah matakuliah: ");
        int jml = Integer.parseInt(sc.nextLine());
        Matakuliah17[] arrayOfMatakuliah = new Matakuliah17[jml];

        for (int i = 0; i < jml; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("SKS        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("---------------------------------");
            
            arrayOfMatakuliah[i] = new Matakuliah17();
            arrayOfMatakuliah[i].tambahData(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < jml; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
            System.out.println("---------------------------------");
        }
    }
    
}