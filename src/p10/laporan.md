|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020022|
| Nama |  Jovita Maharani |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/jovitamaharani/AGS_2026/tree/main/src/p10) |

# JOBSHEET 10 QUEUE
2.1 Percobaan 1 : Operasi Dasar Queue
```
Masukkan kapasitas queue: 4
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
 
1
Masukkan data baru: 15
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
 
1
Masukkan data baru: 31
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
 
4
Elemen terdepan: 15
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
 
2
Data yang dikeluarkan: 15
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
 
3
31 
Jumlah elemen = 1
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
 
5
Queue behasil dikosongkan
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
```

Pertanyaan
1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size bernilai 0?
    - nilai awal atribut front dan rear bernilai -1 karena pada saat queue masih kosong, tidak ada elemen yang berada di dalamnya. Dengan menetapkan nilai -1, kita dapat dengan mudah memeriksa apakah queue kosong atau tidak. Sedangkan atribut size bernilai 0 karena pada awalnya tidak ada elemen yang dimasukkan ke dalam queue, sehingga ukuran queue adalah 0.
2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!
    - untuk menambahkan elemen baru ke dalam queue. Potongan kode tersebut meminta pengguna untuk memasukkan data baru yang akan dimasukkan ke dalam queue. Setelah data baru dimasukkan, program akan memanggil method Enqueue untuk menambahkan data tersebut ke dalam queue.
3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!
    - untuk menghapus elemen dari queue atau untuk memindahkan elemen terdepan dari queue. Potongan kode tersebut memeriksa apakah queue kosong atau tidak. Jika queue kosong, program akan menampilkan pesan bahwa queue kosong dan tidak ada data yang dapat dikeluarkan. Jika queue tidak kosong, program akan mengeluarkan data yang berada di posisi front dan kemudian memindahkan posisi front ke elemen berikutnya dalam queue.
4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), melainkan int i=front?
    - karena pada queue, elemen pertama yang dimasukkan akan berada di posisi front. Oleh karena itu, untuk mencetak semua elemen dalam queue, kita harus memulai perulangan dari posisi front hingga rear. Jika kita memulai perulangan dari 0, kita mungkin akan mencetak elemen yang tidak ada dalam queue atau mencetak elemen yang sudah dikeluarkan.
5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!
    - untuk mencetak semua elemen yang berada dalam queue. Potongan kode tersebut menggunakan perulangan for untuk mencetak setiap elemen dalam queue mulai dari posisi front hingga rear. Setiap elemen dicetak dengan format tertentu, yaitu nama, nim, dan kelas yang dipisahkan oleh tab. Setelah mencetak semua elemen, program akan mencetak baris kosong untuk memisahkan output dari operasi selanjutnya.
6. Tunjukkan potongan kode program yang merupakan queue overflow!
```
if (IsFull()) {
    System.out.println("Queue sudah penuh");
}
```
7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi queue overflow dan queue underflow, program dihentikan!
```
if (IsFull()) {
    System.out.println("Queue sudah penuh. Program dihentikan");
    System.exit(0);
}
```

