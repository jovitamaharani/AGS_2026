package p12;

class Mahasiswa17 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa17(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampil() {
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("Nim: " + nim);
        System.out.println("IPK: " + ipk);
    }
}