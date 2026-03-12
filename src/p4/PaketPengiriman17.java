package p4;

public class PaketPengiriman17 {
    public String nomorResi;     // membuat variabel public agar bisa di akses ke semua file
    public double berat, ongkosDasar, totalOngkos;
    public int jml;

    // method untuk print data
    public void printData17(String nomorResi, double berat, double ongkosDasar, double totalOngkos) {
        System.out.println("============= Data Pengiriman =============");
        for (int i = 0; i < jml; i++) {
            System.out.println();
            System.out.println("Nomor Resi      : " + this.nomorResi);
            System.out.println("Berat           : " + this.berat);
            System.out.println("Ongkos Dasar    : " + this.ongkosDasar);
            System.out.println("Total Ongkos    : " + this.totalOngkos);
        }
    }
    
    public void hitungRataOngkosLebih10kg(PaketPengiriman17[] arrayOfPengiriman) {
        double totalOngkos = 0;
        int count = 0;
        for (PaketPengiriman17 p : arrayOfPengiriman) {
            if (p.berat > 10) {
                totalOngkos += p.totalOngkos;
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Rata-rata ongkos untuk paket lebih dari 10 kg: " + (totalOngkos / count));
        } else {
            System.out.println("Tidak ada paket yang beratnya lebih dari 10 kg.");
        }
    }
}
