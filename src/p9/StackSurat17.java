package p9;

public class StackSurat17 {
    Surat17[] tumpukan;
    int size;
    int top;

    public StackSurat17(int size) {
        this.size = size;
        tumpukan = new Surat17[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat17 srt) {
        if (!isFull()) {
            top++;
            tumpukan[top] = srt;
        } else {
            System.out.println("Stack Penuh! Tidak dapat menerima surat lagi.");
        }
    }

    public Surat17 pop() {
        if (!isEmpty()) {
            Surat17 srt = tumpukan[top];
            top--;
            return srt;
        } else {
            System.out.println("Stack Kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat17 peek() {
        if (!isEmpty()) {
            return tumpukan[top];
        } else {
            System.out.println("Tidak ada surat di dalam tumpukan.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (tumpukan[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan pada posisi indeks ke-" + i);
                System.out.println("ID: " + tumpukan[i].idSurat + " | Jenis: " + tumpukan[i].jenisIzin);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}