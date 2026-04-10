package CM1;

import java.util.Scanner;

public class PeminjamanDemo17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);
        int menu;
        // membuat array of object mahasiswa
        Mahasiswa17[] mahasiswa = {
                new Mahasiswa17("22001", "Andi", "Teknik Informatika"),
                new Mahasiswa17("22002", "Budi", "Teknik Informatika"),
                new Mahasiswa17("22003", "Citra", "Sistem Informasi Bisnis")
        };

        // membuat array of object buku
        Buku17[] buku = {
                new Buku17("B001", "Algoritma", 2020),
                new Buku17("B002", "Basis Data", 2019),
                new Buku17("B003", "Pemrograman", 2021),
                new Buku17("B004", "Fisika", 2024)
        };

        // membuat array of object peminjaman
        Peminjaman17[] peminjaman = {
                new Peminjaman17(mahasiswa[0], buku[0], 7),
                new Peminjaman17(mahasiswa[1], buku[1], 3),
                new Peminjaman17(mahasiswa[2], buku[2], 10),
                new Peminjaman17(mahasiswa[2], buku[3], 6),
                new Peminjaman17(mahasiswa[0], buku[1], 4)
        };

        // perulangan menu
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa\n2. Tampilkan Buku\n3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda\n5. Cari Berdasarkan NIM\n0. Keluar");
            System.out.print("Pilih: ");
            menu = jovita.nextInt();
            jovita.nextLine();

            // perulangan menu
            switch (menu) {
                case 1:
                    System.out.println("\nDaftar Mahasiswa:");
                    for (Mahasiswa17 mhs : mahasiswa) {
                        mhs.tampilMahasiswa();
                    }
                    break;
                case 2:
                    System.out.println("\nDaftar Buku:");
                    for (Buku17 bk : buku) {
                        bk.tampilBuku();
                    }
                    break;
                case 3:
                    System.out.println("\nData Peminjaman:");
                    for (Peminjaman17 pem : peminjaman) {
                        pem.tampilPeminjaman();
                    }
                    break;
                case 4:
                    for (int i = 1; i < peminjaman.length; i++) {
                        Peminjaman17 key = peminjaman[i];
                        int j = i - 1;
                        while (j >= 0 && peminjaman[j].denda < key.denda) {
                            peminjaman[j + 1] = peminjaman[j];
                            j--;
                        }
                        peminjaman[j + 1] = key;
                    }
                    System.out.println("\nSetelah diurutkan (Denda terbesar):");
                    for (Peminjaman17 pem : peminjaman) {
                        pem.tampilPeminjaman();
                    }
                    break;
                case 5:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String cariNIM = jovita.nextLine();
                    int hasilPosisi = findBinarySearch(mahasiswa, cariNIM, 0, mahasiswa.length - 1);
                    
                    if (hasilPosisi != -1) {
                        System.out.println("Data ditemukan pada indeks ke-" + hasilPosisi);
                        mahasiswa[hasilPosisi].tampilMahasiswa();
                    } else {
                        System.out.println("Data dengan NIM " + cariNIM + " tidak ditemukan.");
                    }
                    break;
            }
        } while (menu != 0);
    }

    public static int findBinarySearch(Mahasiswa17[] listMhs, String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            
            int hasilCek = cari.compareTo(listMhs[mid].nim);
            
            if (hasilCek == 0) {
                return mid;
            } else if (hasilCek < 0) {
                return findBinarySearch(listMhs, cari, left, mid - 1);
            } else {
                return findBinarySearch(listMhs, cari, mid + 1, right);
            }
        }
        return -1;
    }
}