package p10;

public class AntrianKRS {
    Mahasiswa[] data;
    int front, rear, size, max;
    int totalSelesai = 0;
    final int TOTAL_MAHASISWA_DPA = 30;

    public AntrianKRS(int n) {
        max = n;
        data = new Mahasiswa[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (!isFull()) {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk antrian.");
        } else {
            System.out.println("Antrian penuh!");
        }
    }

    public void panggilAntrian() {
        if (!isEmpty()) {
            System.out.println("Memanggil antrian untuk proses KRS:");
            int jumlahDipanggil = (size >= 2) ? 2 : 1;
            for (int i = 0; i < jumlahDipanggil; i++) {
                Mahasiswa mhs = data[front];
                System.out.println("- " + mhs.nama + " (Selesai KRS)");
                front = (front + 1) % max;
                size--;
                totalSelesai++;
            }
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Antrian (Seluruhnya):");
            for (int i = 0; i < size; i++) {
                data[(front + i) % max].tampilkanData();
            }
        }
    }

    public void tampilkanDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("2 Antrian Terdepan:");
            int limit = (size >= 2) ? 2 : 1;
            for (int i = 0; i < limit; i++) {
                data[(front + i) % max].tampilkanData();
            }
        }
    }

    public void tampilkanTerakhir() {
        if (!isEmpty()) {
            System.out.println("Antrian Paling Akhir:");
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void cetakStatistik() {
        int sisaBelumProses = TOTAL_MAHASISWA_DPA - totalSelesai;
        System.out.println("--- STATISTIK ---");
        System.out.println("Jumlah antrian saat ini     : " + size);
        System.out.println("Mahasiswa sudah selesai KRS : " + totalSelesai);
        System.out.println("Sisa mahasiswa DPA (belum)  : " + sisaBelumProses);
    }

    public void clear() {
        size = 0;
        front = 0;
        rear = -1;
        System.out.println("Antrian berhasil dikosongkan.");
    }
}