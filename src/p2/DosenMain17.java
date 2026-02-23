package p2;

public class DosenMain17 {
    public static void main(String[] args) {
        Dosen17 dosen1 = new Dosen17();
        dosen1.idDosen = "D01";
        dosen1.nama = "Dr. Andi Wijaya";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2015;
        dosen1.bidangKeahlian = "Artificial Intelligence";

        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2025) + " tahun");
        dosen1.ubahKeahlian("Machine Learning");
        dosen1.tampilInformasi();

        System.out.println("---------------------------");

        Dosen17 dosen2 = new Dosen17("D02", "Siti Aminah, M.T.", true, 2020, "Web Development");
        dosen2.tampilInformasi();
        System.out.println("Masa Kerja: " + dosen2.hitungMasaKerja(2025) + " tahun");
        dosen2.setStatusAktif(true);
        dosen2.ubahKeahlian("Mobile Development");
        dosen2.tampilInformasi();
    }
}
