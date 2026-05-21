package p12;

import java.util.Scanner;

public class DoubleLinkedListMain17 {
    public static Mahasiswa17 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM   : ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = scan.nextDouble();
        scan.nextLine();
        return new Mahasiswa17(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoubleLinkedList17 list = new DoubleLinkedList17();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("7. Tampilkan data secara terbalik (Mundur)");
            System.out.println("8. Hapus data setelah NIM tertentu");
            System.out.println("9. Hapus data pada indeks tertentu");
            System.out.println("10. Cetak data pertama (Get First)");
            System.out.println("11. Cetak data terakhir (Get Last)");
            System.out.println("12. Cetak data indeks tertentu (Get Index)");
            System.out.println("13. Tampilkan jumlah data (Size)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa17 mhsAwal = inputMahasiswa(scan);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa17 mhsAkhir = inputMahasiswa(scan);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String keyNim = scan.nextLine();
                    System.out.println("Masukkan data baru: ");
                    Mahasiswa17 dataBaru = inputMahasiswa(scan);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 7:
                    list.printReverse();
                    break;
                case 8:
                    System.out.print("Masukkan NIM acuan: ");
                    String nimKunci = scan.nextLine();
                    list.removeAfter(nimKunci);
                    break;
                case 9:
                    System.out.print("Masukkan indeks data yang akan dihapus: ");
                    int idxHapus = scan.nextInt();
                    scan.nextLine();
                    list.remove(idxHapus);
                    break;
                case 10:
                    list.getFirst();
                    break;
                case 11:
                    list.getLast();
                    break;
                case 12:
                    System.out.print("Masukkan indeks data yang ingin dilihat: ");
                    int idxCari = scan.nextInt();
                    scan.nextLine();
                    list.getIndex(idxCari);
                    break;
                case 13:
                    System.out.println("Jumlah total data mahasiswa saat ini: " + list.size());
                    System.out.println("--------------------");
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);
        scan.close();
    }
}
