|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020022|
| Nama |  Jovita Maharani |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/jovitamaharani/AGS_2026/tree/main/src/p12) |

# Jobsheet 12 Double Linked List

## 12.2 Percobaan 1: Operasi Penambahan pada Double Linked List

```
===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu: 1
Masukkan NIM   : 2222        
Masukkan Nama  : Agos
Masukkan Kelas : 1f
Masukkan IPK   : 3

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu: 2
Masukkan NIM   : 9087653
Masukkan Nama  : Behel Madura
Masukkan Kelas : 123
Masukkan IPK   : 4

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu: 3
Masukkan NIM yang dicari: 2222
Masukkan data baru: 
Masukkan NIM   : 2323
Masukkan Nama  : AGOES
Masukkan Kelas : 2b
Masukkan IPK   : 2
Data berhasil disisipkan setelah NIM 2222

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu: 4
Data berhasil dihapus dari awal.

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu: 5
Data berhasil dihapus dari akhir.

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu: 6
Nama Mahasiswa: AGOES
Kelas: 2b
Nim: 2323
IPK: 2.0
--------------------

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu: 0
Program selesai.
```

Pertanyaan:
1. Jelaskan perbedaan struktur dan mekanisme traversal antara Single Linked List dan Double Linked List!
- Struktur Single Linked List adalah terdapat satu node yang berisi data dan pointer ke node berikutnya. Data yang disimpan pada node ini tidak terletak di node berikutnya. Struktur Double Linked List adalah terdapat dua node yang berisi data dan pointer ke node berikutnya dan node sebelumnya. Data yang disimpan pada node ini terletak di node sebelumnya dan node berikutnya.
2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Jelaskan fungsi masing-masing atribut tersebut pada proses traversal dan manipulasi node!
- next: berfungsi untuk mengarahkan pointer ke node berikutnya.
- prev: berfungsi untuk mengarahkan pointer ke node sebelumnya.
3. Perhatikan konstruktor pada class DoubleLinkedList. Jelaskan fungsi konstruktor tersebut terhadap kondisi awal linked list!
- Konstruktor pada class DoubleLinkedList digunakan untuk menginisialisasi kondisi awal linked list dengan mengatur head dan tail menjadi null, serta size menjadi 0. Hal ini menandakan bahwa linked list masih kosong dan siap untuk menerima data baru.
4. Perhatikan potongan kode berikut:
if (isEmpty()) {
 head = tail = newNode;
}
Mengapa head dan tail harus menunjuk node yang sama ketika linked list masih kosong?
- Karena ketika linked list masih kosong, baik head maupun tail belum memiliki node yang ditunjuk. Oleh karena itu, ketika kita menambahkan node pertama kali, baik head maupun tail harus menunjuk ke node yang sama untuk memastikan bahwa linked list memiliki satu node yang valid sebagai awal dan akhir dari linked list tersebut.
5. Modifikasi method print() agar menampilkan pesan "Linked List masih kosong" ketika tidak terdapat data pada linked list!
```
if (isEmpty()) {
    System.out.println("Linked List masih kosong.");
    return;
}
```

```
===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu: 6
Linked List masih kosong.
```
6. Modifikasi kode program dengan menambahkan method printReverse() untuk menampilkan seluruh data pada Double Linked List secara terbalik, dimulai dari node tail menuju head!
```
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
```

```
System.out.println("7. Tampilkan data secara terbalik (Mundur)");

case 7:
list.printReverse();
break;
```


```
===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data secara terbalik (Mundur)
0. Keluar
Pilih menu: 7
Linked List masih kosong.

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data secara terbalik (Mundur)
0. Keluar
Pilih menu: 1
Masukkan NIM   : 22
Masukkan Nama  : jojo
Masukkan Kelas : 1F
Masukkan IPK   : 12345

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data secara terbalik (Mundur)
0. Keluar
Pilih menu: 2
Masukkan NIM   : 1111
Masukkan Nama  : bibi
Masukkan Kelas : 2F
Masukkan IPK   : 4

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data secara terbalik (Mundur)
0. Keluar
Pilih menu: 7
=== MENAMPILKAN DATA SECARA TERBALIK (TAIL -> HEAD) ===
Nama Mahasiswa: bibi
Kelas: 2F
Nim: 1111
IPK: 4.0
--------------------
Nama Mahasiswa: jojo
Kelas: 1F
Nim: 22
IPK: 12345.0
--------------------

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data secara terbalik (Mundur)
0. Keluar
Pilih menu: 0
Program selesai.

E:\Java\AGS_2026>
```

## 12.3 Percobaan 2: Operasi Penghapusan pada Double Linked List
```
===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data secara terbalik (Mundur)
0. Keluar
Pilih menu: 5
Linked List masih kosong.

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data secara terbalik (Mundur)
0. Keluar
Pilih menu: 1
Masukkan NIM   : 1111
Masukkan Nama  : Potter
Masukkan Kelas : 1B
Masukkan IPK   : 3,55

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data secara terbalik (Mundur)
0. Keluar
Pilih menu: 5
Data berhasil dihapus dari akhir.

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data secara terbalik (Mundur)
0. Keluar
Pilih menu: 6
Linked List masih kosong.

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data secara terbalik (Mundur)
0. Keluar
Pilih menu: 0
Program selesai.
```

Pertanyaan:
1. Perhatikan potongan kode berikut pada method removeFirst():
head = head.next;
head.prev = null;
Jelaskan fungsi masing-masing statement tersebut pada proses penghapusan node!
- head = head.next; berfungsi untuk mengarahkan pointer head ke node berikutnya, sehingga node pertama yang akan dihapus tidak lagi menjadi bagian dari linked list.
- head.prev = null; berfungsi untuk menghapus referensi ke node yang dihapus pada
2. Modifikasi method removeFirst() dan removeLast() agar program menampilkan data
yang berhasil dihapus!
```
===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data secara terbalik (Mundur)
0. Keluar
Pilih menu: 1
Masukkan NIM   : 1111
Masukkan Nama  : iji
Masukkan Kelas : 1A
Masukkan IPK   : 4

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data secara terbalik (Mundur)
0. Keluar
Pilih menu: 5
Data berhasil dihapus dari akhir.
Nama Mahasiswa: iji
Kelas: 1A
Nim: 1111
IPK: 4.0
--------------------
```

## 12.5 Tugas Praktikum
```
===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data secara terbalik (Mundur)
8. Hapus data setelah NIM tertentu
9. Hapus data pada indeks tertentu
10. Cetak data pertama (Get First)
11. Cetak data terakhir (Get Last)
12. Cetak data indeks tertentu (Get Index)
13. Tampilkan jumlah data (Size)
0. Keluar
Pilih menu: 2
Masukkan NIM   : 1111
Masukkan Nama  : asa
Masukkan Kelas : 1A
Masukkan IPK   : 4

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data secara terbalik (Mundur)
8. Hapus data setelah NIM tertentu
9. Hapus data pada indeks tertentu
10. Cetak data pertama (Get First)
11. Cetak data terakhir (Get Last)
12. Cetak data indeks tertentu (Get Index)
13. Tampilkan jumlah data (Size)
0. Keluar
Pilih menu: 1
Masukkan NIM   : 2222
Masukkan Nama  : jiji
Masukkan Kelas : 1B
Masukkan IPK   : 3,9

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data secara terbalik (Mundur)
8. Hapus data setelah NIM tertentu
9. Hapus data pada indeks tertentu
10. Cetak data pertama (Get First)
11. Cetak data terakhir (Get Last)
12. Cetak data indeks tertentu (Get Index)
13. Tampilkan jumlah data (Size)
0. Keluar
Pilih menu: 3
Masukkan NIM yang dicari: bubu
Masukkan data baru: 
Masukkan NIM   : 5555
Masukkan Nama  : re
Masukkan Kelas : 1C
Masukkan IPK   : 3
Data dengan NIM bubu tidak ditemukan.

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data secara terbalik (Mundur)
8. Hapus data setelah NIM tertentu
9. Hapus data pada indeks tertentu
10. Cetak data pertama (Get First)
11. Cetak data terakhir (Get Last)
12. Cetak data indeks tertentu (Get Index)
13. Tampilkan jumlah data (Size)
0. Keluar
Pilih menu: 3
Masukkan NIM yang dicari: 2222
Masukkan data baru: 
Masukkan NIM   : 5555
Masukkan Nama  : bubu
Masukkan Kelas : 1H
Masukkan IPK   : 3,9
Data berhasil disisipkan setelah NIM 2222

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data secara terbalik (Mundur)
8. Hapus data setelah NIM tertentu
9. Hapus data pada indeks tertentu
10. Cetak data pertama (Get First)
11. Cetak data terakhir (Get Last)
12. Cetak data indeks tertentu (Get Index)
13. Tampilkan jumlah data (Size)
0. Keluar
Pilih menu: 

6   
Nama Mahasiswa: jiji
Kelas: 1B
Nim: 2222
IPK: 3.9
--------------------
Nama Mahasiswa: bubu
Kelas: 1H
Nim: 5555
IPK: 3.9
--------------------
Nama Mahasiswa: asa
Kelas: 1A
Nim: 1111
IPK: 4.0
--------------------

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data secara terbalik (Mundur)
8. Hapus data setelah NIM tertentu
9. Hapus data pada indeks tertentu
10. Cetak data pertama (Get First)
11. Cetak data terakhir (Get Last)
12. Cetak data indeks tertentu (Get Index)
13. Tampilkan jumlah data (Size)
0. Keluar
Pilih menu: 7
=== MENAMPILKAN DATA SECARA TERBALIK (TAIL -> HEAD) ===
Nama Mahasiswa: asa
Kelas: 1A
Nim: 1111
IPK: 4.0
--------------------
Nama Mahasiswa: bubu
Kelas: 1H
Nim: 5555
IPK: 3.9
--------------------
Nama Mahasiswa: jiji
Kelas: 1B
Nim: 2222
IPK: 3.9
--------------------

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data secara terbalik (Mundur)
8. Hapus data setelah NIM tertentu
9. Hapus data pada indeks tertentu
10. Cetak data pertama (Get First)
11. Cetak data terakhir (Get Last)
12. Cetak data indeks tertentu (Get Index)
13. Tampilkan jumlah data (Size)
0. Keluar
Pilih menu: 8
Masukkan NIM acuan: 1111
Tidak ada data setelah NIM 1111 (NIM ini berada di posisi paling akhir).

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data secara terbalik (Mundur)
8. Hapus data setelah NIM tertentu
9. Hapus data pada indeks tertentu
10. Cetak data pertama (Get First)
11. Cetak data terakhir (Get Last)
12. Cetak data indeks tertentu (Get Index)
13. Tampilkan jumlah data (Size)
0. Keluar
Pilih menu: 8
Masukkan NIM acuan: 2222
Data setelah NIM 2222 berhasil dihapus:
Nama Mahasiswa: bubu
Kelas: 1H
Nim: 5555
IPK: 3.9
--------------------

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data secara terbalik (Mundur)
8. Hapus data setelah NIM tertentu
9. Hapus data pada indeks tertentu
10. Cetak data pertama (Get First)
11. Cetak data terakhir (Get Last)
12. Cetak data indeks tertentu (Get Index)
13. Tampilkan jumlah data (Size)
0. Keluar
Pilih menu: 10
=== DATA PERTAMA (HEAD) ===
Nama Mahasiswa: jiji
Kelas: 1B
Nim: 2222
IPK: 3.9
--------------------

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data secara terbalik (Mundur)
8. Hapus data setelah NIM tertentu
9. Hapus data pada indeks tertentu
10. Cetak data pertama (Get First)
11. Cetak data terakhir (Get Last)
12. Cetak data indeks tertentu (Get Index)
13. Tampilkan jumlah data (Size)
0. Keluar
Pilih menu: 11
=== DATA TERAKHIR (TAIL) ===
Nama Mahasiswa: asa
Kelas: 1A
Nim: 1111
IPK: 4.0
--------------------

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data secara terbalik (Mundur)
8. Hapus data setelah NIM tertentu
9. Hapus data pada indeks tertentu
10. Cetak data pertama (Get First)
11. Cetak data terakhir (Get Last)
12. Cetak data indeks tertentu (Get Index)
13. Tampilkan jumlah data (Size)
0. Keluar
Pilih menu: 6
Nama Mahasiswa: jiji
Kelas: 1B
Nim: 2222
IPK: 3.9
--------------------
Nama Mahasiswa: asa
Kelas: 1A
Nim: 1111
IPK: 4.0
--------------------

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data secara terbalik (Mundur)
8. Hapus data setelah NIM tertentu
9. Hapus data pada indeks tertentu
10. Cetak data pertama (Get First)
11. Cetak data terakhir (Get Last)
12. Cetak data indeks tertentu (Get Index)
13. Tampilkan jumlah data (Size)
0. Keluar
Pilih menu: 7
=== MENAMPILKAN DATA SECARA TERBALIK (TAIL -> HEAD) ===
Nama Mahasiswa: asa
Kelas: 1A
Nim: 1111
IPK: 4.0
--------------------
Nama Mahasiswa: jiji
Kelas: 1B
Nim: 2222
IPK: 3.9
--------------------

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data secara terbalik (Mundur)
8. Hapus data setelah NIM tertentu
9. Hapus data pada indeks tertentu
10. Cetak data pertama (Get First)
11. Cetak data terakhir (Get Last)
12. Cetak data indeks tertentu (Get Index)
13. Tampilkan jumlah data (Size)
0. Keluar
Pilih menu: 11
=== DATA TERAKHIR (TAIL) ===
Nama Mahasiswa: asa
Kelas: 1A
Nim: 1111
IPK: 4.0
--------------------

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data secara terbalik (Mundur)
8. Hapus data setelah NIM tertentu
9. Hapus data pada indeks tertentu
10. Cetak data pertama (Get First)
11. Cetak data terakhir (Get Last)
12. Cetak data indeks tertentu (Get Index)
13. Tampilkan jumlah data (Size)
0. Keluar
Pilih menu: 10
=== DATA PERTAMA (HEAD) ===
Nama Mahasiswa: jiji
Kelas: 1B
Nim: 2222
IPK: 3.9
--------------------

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data secara terbalik (Mundur)
8. Hapus data setelah NIM tertentu
9. Hapus data pada indeks tertentu
10. Cetak data pertama (Get First)
11. Cetak data terakhir (Get Last)
12. Cetak data indeks tertentu (Get Index)
13. Tampilkan jumlah data (Size)
0. Keluar
Pilih menu: 12
Masukkan indeks data yang ingin dilihat: 1
=== DATA PADA INDEKS KE-1 ===
Nama Mahasiswa: asa
Kelas: 1A
Nim: 1111
IPK: 4.0
--------------------

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data secara terbalik (Mundur)
8. Hapus data setelah NIM tertentu
9. Hapus data pada indeks tertentu
10. Cetak data pertama (Get First)
11. Cetak data terakhir (Get Last)
12. Cetak data indeks tertentu (Get Index)
13. Tampilkan jumlah data (Size)
0. Keluar
Pilih menu: 13
Jumlah total data mahasiswa saat ini: 2
--------------------
Program selesai.

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data secara terbalik (Mundur)
8. Hapus data setelah NIM tertentu
9. Hapus data pada indeks tertentu
10. Cetak data pertama (Get First)
11. Cetak data terakhir (Get Last)
12. Cetak data indeks tertentu (Get Index)
13. Tampilkan jumlah data (Size)
0. Keluar
Pilih menu: 0
Program selesai.

E:\Java\AGS_2026>
```