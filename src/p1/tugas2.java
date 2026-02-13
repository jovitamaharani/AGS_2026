package p1;
import java.util.Scanner;

public class tugas2 {

    static Scanner input = new Scanner(System.in);
    static Scanner inputLine = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal kuliah (n): ");
        int n = input.nextInt();

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal);
        tampilkanSemua(jadwal);

        System.out.print("\nCari jadwal berdasarkan HARI: ");
        String hariCari = inputLine.nextLine();
        cariBerdasarkanHari(jadwal, hariCari);

        System.out.print("\nCari jadwal berdasarkan MATA KULIAH: ");
        String matkulCari = inputLine.nextLine();
        cariBerdasarkanMatkul(jadwal, matkulCari);
    }

    static void inputJadwal(String[][] data) {
        System.out.println("\n--- Input Data Jadwal ---");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Jadwal ke-" + (i + 1));
            System.out.print("Mata Kuliah : ");
            data[i][0] = inputLine.nextLine();
            System.out.print("Ruang       : ");
            data[i][1] = inputLine.nextLine();
            System.out.print("Hari        : ");
            data[i][2] = inputLine.nextLine();
            System.out.print("Jam         : ");
            data[i][3] = inputLine.nextLine();
        }
    }

    static void tampilkanSemua(String[][] data) {
        System.out.println("\n==========================================================================");
        System.out.printf("%-25s %-15s %-12s %-15s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("==========================================================================");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-25s %-15s %-12s %-15s\n", data[i][0], data[i][1], data[i][2], data[i][3]);
        }
    }

    static void cariBerdasarkanHari(String[][] data, String hari) {
        System.out.println("\n--- Hasil Pencarian Hari: " + hari + " ---");
        boolean ditemukan = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i][2].equalsIgnoreCase(hari)) {
                System.out.printf("%-25s | %-15s | %-15s\n", data[i][0], data[i][1], data[i][3]);
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Tidak ada jadwal pada hari tersebut.");
    }

    static void cariBerdasarkanMatkul(String[][] data, String matkul) {
        System.out.println("\n--- Hasil Pencarian Mata Kuliah: " + matkul + " ---");
        boolean ditemukan = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i][0].toLowerCase().contains(matkul.toLowerCase())) {
                System.out.printf("Ruang: %-10s | Hari: %-10s | Jam: %-10s\n", data[i][1], data[i][2], data[i][3]);
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Mata kuliah tidak ditemukan.");
    }
}