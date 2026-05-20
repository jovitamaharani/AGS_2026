package p11;

import java.util.Scanner;

public class SLLMain17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);
        SingleLinkedList17 sll = new SingleLinkedList17();
        String nama, nim, kelas;
        double ipk;
        System.out.println("Masukan data mahasiswa 1 (NIM, Nama, Kelas, IPK)");
        Mahasiswa17 mhs1 = new Mahasiswa17(jovita.next(), jovita.next(), jovita.next(), jovita.nextDouble());
        System.out.println("Data mahasiswa yang sudah dimasukan");
        mhs1.tampilInformasi();
        // Mahasiswa17 mhs1 = new Mahasiswa17("2001", "Alvaro", "TI-1A", 3.5);
        // Mahasiswa17 mhs2 = new Mahasiswa17("2002", "Bimon", "TI-1B", 3.6);
        // Mahasiswa17 mhs3 = new Mahasiswa17("2003", "Cintia", "TI-1A", 3.7);
        // Mahasiswa17 mhs4 = new Mahasiswa17("2004", "Dirga", "TI-1B", 3.8);

        sll.print();
        // sll.addFirst(mhs4);
        // sll.print();
        // sll.addLast(mhs1);
        // sll.print();
        // sll.insertAfter("Dirga", mhs3);
        // sll.print();
        // sll.insertAt(2, mhs2);
        // sll.print();
    }
}
