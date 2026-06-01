package p11;

import java.util.Scanner;

public class SLLMain17 {
    public static void main(String[] args) {
        SingleLinkedList17 sll = new SingleLinkedList17();
        Scanner jovita = new Scanner(System.in);
        
        System.out.println("--- INPUT DATA MAHASISWA ---");
        System.out.print("Masukkan Jumlah Mahasiswa yang ingin diinput: ");
        int jumlah = jovita.nextInt();
        jovita.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = jovita.nextLine();
            System.out.print("Nama  : ");
            String nama = jovita.nextLine();
            System.out.print("Kelas : ");
            String kelas = jovita.nextLine();
            System.out.print("IPK   : ");
            double ipk = jovita.nextDouble();
            jovita.nextLine();
            Mahasiswa17 mhs = new Mahasiswa17(nim, nama, kelas, ipk);
            sll.addLast(mhs);
        }

        System.out.println("\n=================================");
        sll.print();
    }
}
