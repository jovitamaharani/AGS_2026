package p6;

import java.util.Scanner;

public class MahasiswaDemo17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);
        Scanner jovita1 = new Scanner(System.in);
        MahasiswaBerprestasi17 list = new MahasiswaBerprestasi17();
        int jmlMhs = 5;

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = jovita.nextLine();
            System.out.print("Nama  : ");
            String nama = jovita.nextLine();
            System.out.print("Kelas : ");
            String kelas = jovita.nextLine();
            System.out.print("IPK   : ");
            double ipk = jovita1.nextDouble();
            System.out.println("---------------------------");

            Mahasiswa17 m = new Mahasiswa17(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();
        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC)");
        list.insertionSort();
        list.tampil();
    }
}
