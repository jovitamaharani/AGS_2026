package p3;

import java.util.Scanner;

public class DosenDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen17[] arrayOfDosen = new Dosen17[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (pria/wanita): ");
            String jk = sc.nextLine();
            boolean jenisKelamin = false;
            if (jk.equalsIgnoreCase("wanita")) {
                jenisKelamin = true;
            } else if (jk.equalsIgnoreCase("pria")) {
                jenisKelamin = false;
            }

            System.out.print("Usia          : ");
            int usia = Integer.parseInt(sc.nextLine());
            System.out.println("---------------------------------");

            arrayOfDosen[i] = new Dosen17(kode, nama, jenisKelamin, usia);
        }

        int i = 1;
        for (Dosen17 dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + i);
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + (dosen.jenisKelamin ? "Wanita" : "Pria"));
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("---------------------------------");
            i++;
        }

        DataDosen17 dataDosenSemua = new DataDosen17();
        dataDosenSemua.dataSemuaDosen(arrayOfDosen);
        dataDosenSemua.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosenSemua.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosenSemua.infoDosenPalingTua(arrayOfDosen);
        dataDosenSemua.infoDosenPalingMuda(arrayOfDosen);
    }
}