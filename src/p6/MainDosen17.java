package p6;

import java.util.Scanner;

public class MainDosen17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sS = new Scanner(System.in); // Scanner khusus String
        DataDosen17 data = new DataDosen17();
        int pilih;

        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Bubble Sort - Usia)");
            System.out.println("4. Sorting DSC (Selection Sort - Usia)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Kode Dosen: ");
                    String kd = sS.nextLine();
                    System.out.print("Nama Dosen: ");
                    String nm = sS.nextLine();
                    System.out.print("Laki-laki (true/false): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    data.tambah(new Dosen17(kd, nm, jk, usia));
                    break;
                case 2:
                    System.out.println("\n--- Daftar Dosen ---");
                    data.tampil();
                    break;
                case 3:
                    data.bubbleSort();
                    System.out.println("\nData berhasil diurutkan ASC (Termuda ke Tertua).");
                    data.tampil();
                    break;
                case 4:
                    data.selectionSort();
                    System.out.println("\nData berhasil diurutkan DSC (Tertua ke Termuda).");
                    data.tampil();
                    break;
            }
        } while (pilih != 5);
        
        System.out.println("Program selesai.");
    }
}
