package p1;

import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);

        String[] matkul = { "Pancasila", "Konsep Teknologi Informasi", "Critical thinking dan problem solving",
                "Matematika Dasar ", "Bahasa Inggris 1", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja" };
        int[] sks = { 2, 2, 2, 2, 2, 2, 3, 2 }; 

        double[] nilaiMatkul = new double[matkul.length];
        String[] nilaiHuruf = new String[matkul.length];
        double[] nilaiSetara = new double[matkul.length];

        System.out.println("=============================================");
        System.out.println("\t INPUT NILAI MAHASISWA");
        System.out.println("=============================================");
        
        for (int k = 0; k < matkul.length; k++) {
            System.out.print("Masukan nilai " + matkul[k] + ": ");
            double nilai = jovita.nextDouble();
            
            if (nilai > 100 || nilai < 0) {
                System.out.println("[ERROR] Nilai tidak valid! Masukkan angka 0-100.");
                k--; 
                continue;
            }
            
            nilaiMatkul[k] = nilai;

            if (nilai > 80) {
                nilaiHuruf[k] = "A"; nilaiSetara[k] = 4;
            } else if (nilai > 73) {
                nilaiHuruf[k] = "B+"; nilaiSetara[k] = 3.5;
            } else if (nilai > 65) {
                nilaiHuruf[k] = "B"; nilaiSetara[k] = 3;
            } else if (nilai > 60) {
                nilaiHuruf[k] = "C+"; nilaiSetara[k] = 2.5;
            } else if (nilai > 50) {
                nilaiHuruf[k] = "C"; nilaiSetara[k] = 2;
            } else if (nilai > 39) {
                nilaiHuruf[k] = "D"; nilaiSetara[k] = 1;
            } else {
                nilaiHuruf[k] = "E"; nilaiSetara[k] = 0;
            }
        }

        System.out.println("\n=============================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=============================================");
        System.out.printf("%-40s %-12s %-10s %-10s\n", "Mata Kuliah", "Nilai Angka", "Huruf", "Bobot");
        System.out.println("-------------------------------------------------------------------------");
        
        int totalSks = 0;
        double totalBobot = 0;
        boolean adaE = false;

        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-40s %-12.2f %-10s %-10.1f\n", 
                              matkul[i], nilaiMatkul[i], nilaiHuruf[i], nilaiSetara[i]);
            
            totalSks += sks[i];
            totalBobot += (nilaiSetara[i] * sks[i]);
            if (nilaiHuruf[i].equals("E")) adaE = true;
        }

        double ip = totalBobot / totalSks;
        
        String status = "LULUS";
        if (ip < 2.0) status = "TIDAK LULUS (IP < 2.0)";
        else if (nilaiHuruf[0].equals("D") || nilaiHuruf[0].equals("E")) 
            status = "TIDAK LULUS (PANCASILA < C)";
        else if (adaE) status = "TIDAK LULUS (ADA NILAI E)";

        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("IP Semester\t: %.2f\n", ip);
        System.out.println("Status\t\t: " + status);
        System.out.println("=============================================");
    }
}