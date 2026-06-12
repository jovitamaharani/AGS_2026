package CM2;

public class LinkedListRekapAntrian {
    // soal CM B
    // membuat rekap antrian per jam antri, menyimpan jam antri dan jumlah antrian

    // membuat node untuk menyimpan jam antri dan jumlah antrian
    NodeJam17 head;
    NodeJam17 tail;
    int jumlahAntrian;

    // construktor linked list rekap antrian
    public LinkedListRekapAntrian() {
        this.head = null;
        this.tail = null;
        this.jumlahAntrian = 0;
    }

    // method untuk menambah jam antri dan jumlah antrian
    public void tambahJam(String jamAntri, int jumlahAntrian) {
        NodeJam17 newNode = new NodeJam17(jamAntri, jumlahAntrian);

        // untuk cek apakah jam sudah ada di rekap
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        this.jumlahAntrian += jumlahAntrian;
    }

    // method untuk mencari jumlah antrian per jam antri
    public int cariJumlahAntrianPerJam(String jamAntri) {
        NodeJam17 current = head;
        int jumlah = 0;

        while (current != null) {
            if (current.jamAntri.equals(jamAntri)) {
                jumlah += current.jumlahAntrian;
            }
            current = current.next;
        }
        return jumlah;
    }

    //  method untuk mencetak rekap antrian
    public void cetakRekapAntrian() {
        // untuk cek apakah rekap antrian kosong
        if (isEmpty()) {
            System.out.println("Tidak ada rekap antrian");
            return;
        }

        // untuk menampilkan rekap antrian
        System.out.println("Rekap Antrian");
        System.out.println("-------------");
        System.out.printf("%-10s %-10s\n", "Jam", "Jumlah");
        System.out.println("-------------");

        // untuk mencetak jam antri dan jumlah antrian
        NodeJam17 current = head;
        while (current != null) {
            System.out.printf("%-10s %-10d\n", current.jamAntri, current.jumlahAntrian);
            current = current.next;
        }
        System.out.println("-------------");
    }

    // method untuk mengecek apakah list rekap antrian kosong
    public boolean isEmpty() {
        return head == null;
    }
}
