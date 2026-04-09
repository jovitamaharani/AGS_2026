package p6;

public class Dosen17 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    Dosen17(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        String jk = (jenisKelamin) ? "Laki-laki" : "Perempuan";
        System.out.println("Kode: " + kode + " | Nama: " + nama + " | Gender: " + jk + " | Usia: " + usia);
    }
}
