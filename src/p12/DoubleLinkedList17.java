package p12;

public class DoubleLinkedList17 {
    Node17 head;
    Node17 tail;
    int size;

    public DoubleLinkedList17() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa17 data) {
        Node17 newNode = new Node17(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa17 data) {
        Node17 newNode = new Node17(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void insertAfter(String keyNim, Mahasiswa17 data) {
        Node17 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node17 newNode = new Node17(data);
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node17 current = head;
        while (current != null) {
            current.data.tampil();
            System.out.println("--------------------");
            current = current.next;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Mahasiswa17 dataDihapus = head.data;
        Node17 current = head;
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        size--;
        System.out.println("Data berhasil dihapus dari awal.");
        dataDihapus.tampil();
        System.out.println("--------------------");
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Mahasiswa17 dataDihapus = tail.data;
        Node17 current = tail;
        tail = tail.prev;
        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }
        size--;
        System.out.println("Data berhasil dihapus dari akhir.");
        dataDihapus.tampil();
        System.out.println("--------------------");
    }

    public void search(String keyNim) {
        Node17 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
        } else {
            System.out.println("Data berhasil ditemukan.");
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        Node17 current = tail;
        System.out.println("=== MENAMPILKAN DATA SECARA TERBALIK (TAIL -> HEAD) ===");

        while (current != null) {
            current.data.tampil();
            System.out.println("--------------------");

            current = current.prev;
        }
    }

    public void add(int index, Mahasiswa17 data) {
        if (index < 0 || index > size) {
            System.out.println("Nilai indeks di luar batas!");
            return;
        }

        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node17 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            Node17 newNode = new Node17(data);

            newNode.prev = current.prev;
            newNode.next = current;

            current.prev.next = newNode;
            current.prev = newNode;

            size++;
            System.out.println("Data berhasil ditambahkan pada indeks ke-" + index);
        }
    }

    public void removeAfter(String keyNim) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        Node17 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
        } else if (current.next == null) {
            System.out.println("Tidak ada data setelah NIM " + keyNim + " (NIM ini berada di posisi paling akhir).");
        } else {
            Node17 targetNode = current.next;
            Mahasiswa17 dataDihapus = targetNode.data;

            if (targetNode == tail) {
                current.next = null;
                tail = current;
            } else {
                current.next = targetNode.next;
                targetNode.next.prev = current;
            }
            
            size--;
            System.out.println("Data setelah NIM " + keyNim + " berhasil dihapus:");
            dataDihapus.tampil();
            System.out.println("--------------------");
        }
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        if (index < 0 || index >= size) {
            System.out.println("Nilai indeks di luar batas!");
            return;
        }

        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node17 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            Mahasiswa17 dataDihapus = current.data;
            current.prev.next = current.next;
            current.next.prev = current.prev;
            
            size--;
            System.out.println("Data pada indeks ke-" + index + " berhasil dihapus:");
            dataDihapus.tampil();
            System.out.println("--------------------");
        }
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong, tidak ada data pertama.");
            return;
        }
        System.out.println("=== DATA PERTAMA (HEAD) ===");
        head.data.tampil();
        System.out.println("--------------------");
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong, tidak ada data terakhir.");
            return;
        }
        System.out.println("=== DATA TERAKHIR (TAIL) ===");
        tail.data.tampil();
        System.out.println("--------------------");
    }

    public void getIndex(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        if (index < 0 || index >= size) {
            System.out.println("Nilai indeks di luar batas!");
            return;
        }

        Node17 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        
        System.out.println("=== DATA PADA INDEKS KE-" + index + " ===");
        current.data.tampil();
        System.out.println("--------------------");
    }
}
