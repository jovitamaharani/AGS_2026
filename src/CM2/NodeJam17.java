package CM2;

public class NodeJam17 {
    // membuat node untuk menyimpan jam antri dan jumlah antrian
    String jamAntri;
    int jumlahAntrian;
    NodeJam17 next;
    NodeJam17 prev;

    // construktor node jam antrian
    public NodeJam17(String jamAntri, int jumlahAntrian) {
        this.jamAntri = jamAntri;
        this.jumlahAntrian = jumlahAntrian;
        this.next = null;
        this.prev = null;
    }
}
