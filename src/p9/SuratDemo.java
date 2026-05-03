package p9;

import java.util.Scanner;

public class SuratDemo {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);
        System.out.print("Masukkan kapasitas tumpukan surat: ");
        int kap = jovita.nextInt();
        StackSurat17 stack = new StackSurat17(kap);
        int pilih;

        do {
            System.out.println("\nMenu Layanan Surat Izin:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat (Nama)");
            System.out.println("5. Keluar");
            System.out.print("Pilih (1-5): ");
            pilih = jovita.nextInt();
            jovita.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = jovita.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = jovita.nextLine();
                    System.out.print("Kelas: ");
                    String kls = jovita.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jns = jovita.next().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int dur = jovita.nextInt();
                    
                    Surat17 s = new Surat17(id, nama, kls, jns, dur);
                    stack.push(s);
                    break;

                case 2:
                    Surat17 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Surat milik " + diproses.namaMahasiswa + " telah divalidasi.");
                    }
                    break;

                case 3:
                    Surat17 teratas = stack.peek();
                    if (teratas != null) {
                        System.out.println("Surat teratas: " + teratas.namaMahasiswa + " (" + teratas.idSurat + ")");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cariNama = jovita.nextLine();
                    stack.cariSurat(cariNama);
                    break;
                
                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 5);
    }
}