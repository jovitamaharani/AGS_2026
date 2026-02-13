package p1;

import java.util.Scanner;

class pemilihan {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);

        double tugas, kuis, uts, uas, total;
        String huruf, lulus;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("input nilai tugas: ");
        tugas = jovita.nextInt();
        System.out.print("input nilai kuis: ");
        kuis = jovita.nextInt();
        System.out.print("input nilai uts: ");
        uts = jovita.nextInt();
        System.out.print("input nilai uas: ");
        uas = jovita.nextInt();
        System.out.println("==============================");
        System.out.println("==============================");

        if (tugas < 0 || kuis < 0 || uts < 0 || uas < 0 || tugas > 100 || kuis > 100 || uts > 100 || uas > 100) {
            System.out.println("nilai tidak valid");
        } else {
            tugas *= 0.2;
            kuis *= 0.2;
            uts *= 0.3;
            uas *= 0.3;
            total = tugas + kuis + uts + uas;

            if (total > 80 && total <= 100) {
                huruf = "A";
            } else if (total > 73 && total <= 80) {
                huruf = "B+";
            } else if (total > 65 && total <= 73) {
                huruf = "B";
            } else if (total > 60 && total <= 65) {
                huruf = "C+";
            } else if (total >= 50 && total <= 60) {
                huruf = "C";
            } else if (total >= 39 && total <= 50) {
                huruf = "D";
            } else {
                huruf = "E";
            }

            System.out.println("nilai akhir: " + total);
            System.out.println("nilai huruf: " + huruf);
            System.out.println("==============================");
            System.out.println("==============================");
            if (huruf.equalsIgnoreCase("d") || huruf.equalsIgnoreCase("e")) {
                lulus = "TIDAK LULUS";
            } else {
                lulus = "LULUS";
            }
            System.out.println(lulus);
        }
    }
}