package p11;

public class SLLMain17 {
    public static void main(String[] args) {
        SingleLinkedList17 sll = new SingleLinkedList17();

        Mahasiswa17 mhs1 = new Mahasiswa17("2001", "Alvaro", "TI-1A", 3.5);
        Mahasiswa17 mhs2 = new Mahasiswa17("2002", "Bimon", "TI-1B", 3.6);
        Mahasiswa17 mhs3 = new Mahasiswa17("2003", "Cintia", "TI-1A", 3.7);
        Mahasiswa17 mhs4 = new Mahasiswa17("2004", "Dirga", "TI-1B", 3.8);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.print();
        sll.insertAt(2, mhs2);
        sll.print();
    }
}
