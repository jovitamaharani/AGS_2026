package p5;

public class MahasiswaMain {
    
    public static int cariMaxUTS(Mahasiswa arr[], int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int maxL = cariMaxUTS(arr, l, mid);
        int maxR = cariMaxUTS(arr, mid + 1, r);
        return Math.max(maxL, maxR);
    }

    public static int cariMinUTS(Mahasiswa arr[], int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int minL = cariMinUTS(arr, l, mid);
        int minR = cariMinUTS(arr, mid + 1, r);
        return Math.min(minL, minR);
    }

    public static double rataRataUAS(Mahasiswa arr[]) {
        double total = 0;
        for (Mahasiswa m : arr) {
            total += m.nilaiUAS;
        }
        return total / arr.length;
    }

    public static void main(String[] args) {
        Mahasiswa[] daftarMahasiswa = {
            new Mahasiswa("Ahmad", 78, 82),
            new Mahasiswa("Budi", 85, 88),
            new Mahasiswa("Cindy", 90, 87),
            new Mahasiswa("Dian", 76, 79),
            new Mahasiswa("Eko", 92, 95),
            new Mahasiswa("Fajar", 88, 85),
            new Mahasiswa("Gina", 80, 83),
            new Mahasiswa("Hadi", 82, 84)
        };

        System.out.println("Nilai UTS Tertinggi: " + cariMaxUTS(daftarMahasiswa, 0, daftarMahasiswa.length - 1));
        System.out.println("Nilai UTS Terendah: " + cariMinUTS(daftarMahasiswa, 0, daftarMahasiswa.length - 1));
        System.out.println("Rata-rata Nilai UAS: " + rataRataUAS(daftarMahasiswa));
    }
}