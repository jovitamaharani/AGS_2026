package CM1;

public class Peminjaman17 {
    Mahasiswa17 mhs;
    Buku17 buku;
    int lamaPinjam, terlambat, denda;
    int batasPinjam = 5;
    boolean isCanceled = false;

    public Peminjaman17(Mahasiswa17 mhs, Buku17 buku, int lamaPinjam, boolean isCanceled) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        this.isCanceled = isCanceled;
        hitungDenda();
    }

    public void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }

        // jawaban uts sesi 4 (A)

        // digunakan untuk mengecek apakah denda lebih dari batas 20000, jika iya maka denda akan di ubah menjadi 20000
        if (denda > 20000) {
            denda = 20000;
        }
    }

    public void tampilPeminjaman() {
        // jawaban uts sesi 4 (B)
        // untuk menampilkan data peminjaman, jika isCanceled true maka data tidak akan ditampilkan, karena data sudah di cancel
        if (isCanceled == false) {
            System.out.println(mhs.nama + " | " + buku.judul + " | Lama: " + lamaPinjam + " | Terlambat: " + terlambat
                    + " | Denda: " + denda);
        }
    }

}