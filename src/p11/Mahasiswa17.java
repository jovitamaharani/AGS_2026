package p11;

public class Mahasiswa17 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa17() {
    }

    public Mahasiswa17(String nama, String nim, String kelas, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}
