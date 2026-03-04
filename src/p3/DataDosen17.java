package p3;

public class DataDosen17 {

    public void dataSemuaDosen(Dosen17[] arrayOfDosen) {
        System.out.println("\n=======DATA SEMUA DOSEN=======");

        for (Dosen17 d : arrayOfDosen) {
            System.out.println("Kode          : " + d.kode);
            System.out.println("Nama          : " + d.nama);

            String jenis = (d.jenisKelamin) ? "Wanita" : "Pria";
            System.out.println("Jenis Kelamin : " + jenis);

            System.out.println("Usia          : " + d.usia);
            System.out.println("-----------------------------------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen17[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen17 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                wanita++;
            } else {
                pria++;
            }
        }

        System.out.println("\n=======JUMLAH DOSEN PER JENIS KELAMIN=======");
        System.out.println("Pria : " + pria);
        System.out.println("Wanita : " + wanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen17[] arrayOfDosen) {
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        int jmlPria = 0;
        int jmlWanita = 0;

        for (Dosen17 d : arrayOfDosen) {
            if (d.jenisKelamin == true) {
                totalUsiaWanita += d.usia;
                jmlWanita++;
            } else {
                totalUsiaPria += d.usia;
                jmlPria++;
            }
        }

        if (jmlPria > 0) {
            double rataPria = (double) totalUsiaPria / jmlPria;
            System.out.println("Rata-rata Usia Pria   : " + rataPria);
        } else {
            System.out.println("Rata-rata Usia Pria   : 0 (Tidak ada dosen pria)");
        }

        if (jmlWanita > 0) {
            double rataWanita = (double) totalUsiaWanita / jmlWanita;
            System.out.println("Rata-rata Usia Wanita : " + rataWanita);
        } else {
            System.out.println("Rata-rata Usia Wanita : 0 (Tidak ada dosen wanita)");
        }
        System.out.println("------------------------------------------------------");
    }

    public void infoDosenPalingTua(Dosen17[] arrayOfDosen) {
        Dosen17 dosenPalingTua = arrayOfDosen[0];

        for (Dosen17 d : arrayOfDosen) {
            if (d.usia > dosenPalingTua.usia) {
                dosenPalingTua = d;
            }
        }

        System.out.println("\n======= DOSEN PALING TUA =======");
        System.out.println("Kode          : " + dosenPalingTua.kode);
        System.out.println("Nama          : " + dosenPalingTua.nama);
        System.out.println("Jenis Kelamin : " + (dosenPalingTua.jenisKelamin ? "Wanita" : "Pria"));
        System.out.println("Usia          : " + dosenPalingTua.usia);
        System.out.println("--------------------------------");
    }

    public void infoDosenPalingMuda(Dosen17[] arrayOfDosen) {
        Dosen17 dosenPalingMuda = arrayOfDosen[0];

        for (Dosen17 d : arrayOfDosen) {
            if (d.usia < dosenPalingMuda.usia) {
                dosenPalingMuda = d;
            }
        }

        System.out.println("\n======= DOSEN PALING MUDA =======");
        System.out.println("Kode          : " + dosenPalingMuda.kode);
        System.out.println("Nama          : " + dosenPalingMuda.nama);
        System.out.println("Jenis Kelamin : " + (dosenPalingMuda.jenisKelamin ? "Wanita" : "Pria"));
        System.out.println("Usia          : " + dosenPalingMuda.usia);
        System.out.println("---------------------------------");
    }
}