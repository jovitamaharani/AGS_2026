package p2;

public class Mahasiswa17 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        ipk = ipkBaru;
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }

    // public static void main(String[] args) {
    //     Mahasiswa17 mhs1 = new Mahasiswa17();
    //     mhs1.nama = "Jovita Maharani";
    //     mhs1.nim = "54657878";
    //     mhs1.kelas = "TI - 1F";
    //     mhs1.ipk = 3.90;

    //     mhs1.tampilkanInformasi();

    //     Mahasiswa17 mhs2 = new Mahasiswa17("Nabila", "545678923", 3.25, "TI - 1C");
    //     mhs2.updateIpk(3.30);
    //     mhs2.tampilkanInformasi();
    // }
}
