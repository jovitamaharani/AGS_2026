package p4;

import java.util.Scanner;

import p3.Matakuliah17;

public class PaketPengirimanMain17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);
        System.out.print("Masukan jumlah pengiriman: ");
        int jml = jovita.nextInt();
        // intansi objek array paket pengiriman
        PaketPengiriman17[] arrayOfPengiriman = new PaketPengiriman17[jml];

        for (int i = 0; i < jml; i++) {
            // intansi objek paket pengiriman
            arrayOfPengiriman[i] = new PaketPengiriman17();

            // pengisian data pengiriman
            System.out.print("Masukan nomor resi: ");
            arrayOfPengiriman[i].nomorResi = jovita.nextLine();
            jovita.next();
            System.out.print("Masukan berat (kg): ");
            arrayOfPengiriman[i].berat = jovita.nextDouble();
            System.out.print("Masukan harga ongkos dasar: ");
            arrayOfPengiriman[i].ongkosDasar = jovita.nextDouble();

            // rumus untuk menghitung total ongkos
            arrayOfPengiriman[i].totalOngkos = arrayOfPengiriman[i].berat * arrayOfPengiriman[i].ongkosDasar;

            // mengecek kondisi apakah ongkos kirim lebih dari 100000
            if (arrayOfPengiriman[i].totalOngkos > 100000) {
                // jika iya makan akan diberi diskon sebanyak 10%
                arrayOfPengiriman[i].totalOngkos *= 0.1;
            }

        }
        for (int i = 0; i < jml; i++) {
            System.out.println("Data pengiriman ke-" + (i + 1));
            System.out.println("nomor resi: " + arrayOfPengiriman[i].nomorResi);
            System.out.println("berat: " + arrayOfPengiriman[i].berat);
            System.out.println("ongkos dasar: " + arrayOfPengiriman[i].ongkosDasar);
            System.out.println("totalOngkos: " + arrayOfPengiriman[i].totalOngkos);
            // menampilkan data pengiriman
            arrayOfPengiriman[i].printData17(arrayOfPengiriman[i].nomorResi, arrayOfPengiriman[i].berat, arrayOfPengiriman[i].ongkosDasar, arrayOfPengiriman[i].totalOngkos);
            // menampilkan data pengiriman dan menghitung rata-rata ongkos untuk paket lebih dari 10 kg
            arrayOfPengiriman[i].hitungRataOngkosLebih10kg(arrayOfPengiriman);
            System.out.println("-------------------------------------------");
        }
    }

}
