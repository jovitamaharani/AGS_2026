package CM2;

import java.util.Scanner;

public class DoubleLinkedListMain17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoubleLinkedList17 resto = new DoubleLinkedList17();
        int pilihan;

        resto.tambahAntrian("Ainra", "08224500000");
        resto.tambahAntrian("Danra", "08224511111");
        resto.tambahAntrian("Sanri", "08224522222");
        resto.tambahAntrian("Vania", "08422234556");
        
        do {
            System.out.println("\n=================================");
            System.out.println("   SISTEM ANTREAN ROYAL DELISH   ");
            System.out.println("=================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            // membuat pilihan untuk melihat rekap antrian
            System.out.println("5. Rekap Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = scan.nextLine();
                    System.out.print("No HP        : ");
                    String noHp = scan.nextLine();
                    resto.tambahAntrian(nama, noHp);
                    break;

                case 2:
                    resto.cetakAntrian();
                    break;

                case 3:
                    System.out.print("Kode Pesanan : ");
                    int kode = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Nama Pesanan : ");
                    String namaMenu = scan.nextLine();
                    System.out.print("Harga        : ");
                    int harga = scan.nextInt();
                    System.out.println("Jam Antri     : " + java.time.LocalTime.now());
                    scan.nextLine();
                    
                    resto.hapusAntreanDanInputPesanan(kode, namaMenu, harga);
                    break;

                case 4:
                    resto.cetakLaporanPesanan();
                    break;

                case 5:
                    // membuat rekap antrian per jam antri (hanya jam tanpa menit), dari data yang sudah ada di doublelinkedlist, yang diinputkan di case 3
                    LinkedListRekapAntrian rekapAntrian = new LinkedListRekapAntrian();
                    rekapAntrian.tambahJam("08:00", 1);
                    rekapAntrian.tambahJam("09:00", 3);
                    rekapAntrian.tambahJam("10:00", 5);
                    rekapAntrian.tambahJam("11:00", 7);
                    rekapAntrian.tambahJam("12:00", 9);
                    rekapAntrian.cetakRekapAntrian();
                    

                    break;
                
                default:
                    if (pilihan != 0) {
                        System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    }
                    break;
            }
        } while (pilihan != 0);

        scan.close();
    }
}
