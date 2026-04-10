package CM1;

public class Peminjaman17 {
    Mahasiswa17 mhs;
    Buku17 buku;
    int lamaPinjam, terlambat, denda;
    int batasPinjam = 5;

    public Peminjaman17(Mahasiswa17 mhs, Buku17 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
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
    }

    public void tampilPeminjaman() {
        System.out.println(mhs.nama + " | " + buku.judul + " | Lama: " + lamaPinjam + " | Terlambat: " + terlambat
                + " | Denda: " + denda);
    }

    int findBinarySearch(Peminjaman17[] listPem, String cariNIM, int left, int right) {
    int mid;
    if (right >= left) {
        mid = (left + right) / 2;

        int nimTengah = Integer.parseInt(listPem[mid].mhs.nim);
        int nimDicari = Integer.parseInt(cariNIM);

        if (nimDicari == nimTengah) {
            return mid;
        } else if (nimTengah > nimDicari) {
            return findBinarySearch(listPem, cariNIM, left, mid - 1);
        } else {
            return findBinarySearch(listPem, cariNIM, mid + 1, right);
        }
    }
    return -1;
}
}