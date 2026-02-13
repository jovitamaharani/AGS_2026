package p1;
public class fungsi {

    static String[] namaCabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
    static String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    static int[] hargaBunga = {75000, 50000, 60000, 10000};

    static int[][] stockBunga = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    public static void main(String[] args) {
        System.out.println("====================================================================");
        System.out.printf("%-15s %-20s %-15s\n", "Cabang", "Pendapatan", "Status");
        System.out.println("====================================================================");

        for (int i = 0; i < stockBunga.length; i++) {
            long pendapatan = hitungPendapatan(i);
            
            String status = tentukanStatus(pendapatan);

            System.out.printf("%-15s Rp %-17d %-15s\n", namaCabang[i], pendapatan, status);
        }
        System.out.println("====================================================================");
    }

    static long hitungPendapatan(int barisCabang) {
        long total = 0;
        for (int j = 0; j < stockBunga[barisCabang].length; j++) {
            total += stockBunga[barisCabang][j] * hargaBunga[j];
        }
        return total;
    }

    static String tentukanStatus(long pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }
}