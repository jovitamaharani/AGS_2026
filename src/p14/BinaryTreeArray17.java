package p14;

public class BinaryTreeArray17 {
    Mahasiswa17[] dataMahasiswa; 
    int idxLast; 

    public BinaryTreeArray17() { 
        this.dataMahasiswa = new Mahasiswa17[50]; 
        this.idxLast = -1;
    }

    void populateData(Mahasiswa17 dataMhs[], int idxLast) { 
        this.dataMahasiswa = dataMhs; 
        this.idxLast = idxLast; 
    }

    void traverseInOrder(int idxStart) { 
        if (idxStart <= idxLast) { 
            if (dataMahasiswa[idxStart] != null) { 
                traverseInOrder(2 * idxStart + 1); 
                dataMahasiswa[idxStart].tampilInformasi(); 
                traverseInOrder(2 * idxStart + 2); 
            }
        }
    }

    public void add(Mahasiswa17 data) {
        if (idxLast + 1 < dataMahasiswa.length) {
            idxLast++;
            dataMahasiswa[idxLast] = data;
        } else {
            System.out.println("Penyimpanan Tree Array sudah penuh!");
        }
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                // 1. Cetak Root / Node Saat ini
                dataMahasiswa[idxStart].tampilInformasi();
                // 2. Rekursif ke Left Child (2 * idxStart + 1)
                traversePreOrder(2 * idxStart + 1);
                // 3. Rekursif ke Right Child (2 * idxStart + 2)
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}