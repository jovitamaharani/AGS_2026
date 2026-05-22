package CM2;

public class DoubleLinkedList17 {
    NodeAntrean17 headAntrean;
    NodeAntrean17 tailAntrean;
    
    NodePesanan17 headPesanan;
    NodePesanan17 tailPesanan;
    
    int autoNoAntrean = 1;

    public boolean isAntreanEmpty() {
        return headAntrean == null;
    }

    public boolean isPesananEmpty() {
        return headPesanan == null;
    }

    public void tambahAntrian(String nama, String noHp) {
        Pembeli17 pembeliBaru = new Pembeli17(autoNoAntrean, nama, noHp);
        NodeAntrean17 newNode = new NodeAntrean17(pembeliBaru);

        if (isAntreanEmpty()) {
            headAntrean = tailAntrean = newNode;
        } else {
            tailAntrean.next = newNode;
            newNode.prev = tailAntrean;
            tailAntrean = newNode;
        }

        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + autoNoAntrean);
        autoNoAntrean++;
    }

    public void cetakAntrian() {
        if (isAntreanEmpty()) {
            System.out.println("-----------------------------------");
            System.out.println("Daftar Antrian Pembeli Masih Kosong");
            System.out.println("-----------------------------------");
            return;
        }

        System.out.println("---------------------------------------");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("---------------------------------------");
        System.out.printf("%-12s %-15s %-15s\n", "No Antrian", "Nama", "No HP");
        System.out.println("---------------------------------------");
        
        NodeAntrean17 current = headAntrean;
        while (current != null) {
            System.out.printf("%-12d %-15s %-15s\n", 
                current.data.noAntrean, 
                current.data.namaPembeli, 
                current.data.noHp
            );
            current = current.next;
        }
        System.out.println("---------------------------------------");
    }

    public void hapusAntreanDanInputPesanan(int kodePesanan, String namaPesanan, int harga) {
        if (isAntreanEmpty()) {
            System.out.println("--------------------------------------------");
            System.out.println("Tidak dapat memproses, antrean sedang kosong!");
            System.out.println("--------------------------------------------");
            return;
        }

        Pembeli17 pembeliSaatIni = headAntrean.data;
        System.out.println("--------------------------------------------");
        System.out.println("Memproses Antrean Nomor: " + pembeliSaatIni.noAntrean);
        System.out.println("Nama Pembeli: " + pembeliSaatIni.namaPembeli);
        System.out.println("--------------------------------------------");

        headAntrean = headAntrean.next;
        if (headAntrean == null) {
            tailAntrean = null;
        } else {
            headAntrean.prev = null;
        }

        Pesanan17 pesananBaru = new Pesanan17(kodePesanan, namaPesanan, harga);
        NodePesanan17 newNodePesanan = new NodePesanan17(pesananBaru);

        if (isPesananEmpty()) {
            headPesanan = tailPesanan = newNodePesanan;
        } else {
            tailPesanan.next = newNodePesanan;
            newNodePesanan.prev = tailPesanan;
            tailPesanan = newNodePesanan;
        }

        System.out.println("Pesanan berhasil dicatat dan antrean maju!");
        System.out.println("--------------------------------------------");
    }

    public void sortPesananSesuaiNama() {
        if (isPesananEmpty() || headPesanan.next == null) {
            return;
        }

        boolean swapped;
        do {
            swapped = false; 
            NodePesanan17 current = headPesanan;

            while (current.next != null) {
                if (current.data.namaPesanan.compareTo(current.next.data.namaPesanan) > 0) {
                    Pesanan17 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public void cetakLaporanPesanan() {
        if (isPesananEmpty()) {
            System.out.println("-----------------------------------");
            System.out.println("Belum Ada Rekap Pesanan yang Masuk");
            System.out.println("-----------------------------------");
            return;
        }

        sortPesananSesuaiNama();

        System.out.println("===================================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("===================================================");
        System.out.printf("%-15s %-20s %-15s\n", "Kode Pesanan", "Nama Pesanan", "Harga");
        System.out.println("===================================================");

        NodePesanan17 current = headPesanan;
        int totalPendapatan = 0;

        while (current != null) {
            System.out.printf("%-15d %-20s Rp %-12d\n", 
                current.data.kodePesanan, 
                current.data.namaPesanan, 
                current.data.harga
            );
            totalPendapatan += current.data.harga;
            current = current.next;
        }

        System.out.println("===================================================");
        System.out.println("Total Pendapatan Restoran: Rp " + totalPendapatan);
        System.out.println("===================================================");
    }
}