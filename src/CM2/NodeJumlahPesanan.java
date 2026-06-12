package CM2;

public class NodeJumlahPesanan {
// membuat node untuk menyimpan nama menu dan harga pesanan
    String namaMenu;
    int harga;
    NodeJumlahPesanan next;
    NodeJumlahPesanan prev;

    // construktor node jumlah pesanan
    public NodeJumlahPesanan(String namaMenu, int harga) {
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.next = null;
        this.prev = null;
    }
}
