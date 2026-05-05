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

## 2.2. Percobaan 2 : Antrian Layanan Akademik
```
=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 1
NIM : 213
Nama: a
Prodi: e
Kelas: 2
a berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 1
NIM : b
Nama: d
Prodi: d
Kelas: 3
d berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 4
Daftar Mahasiswa dalam Antrian:
NIM - NAMAjj - PRODI - KELAS
1. 213 - a - e - 2
2. b - d - d - 3

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 2
Melayani mahasiswa: 213 - a - e - 2

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 4
Daftar Mahasiswa dalam Antrian:
NIM - NAMAjj - PRODI - KELAS
1. b - d - d - 3

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 5
Jumlah dalam antrian: 1

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 0
Terima kasih.

E:\Java\AGS_2026>
```

Pertanyaan
```
public void LihatAkhir() {
    if (isEmpty()) {
        System.out.println("Antrian kosong.");
    } else {
        System.out.print("Mahasiswa paling belakang: ");
        System.out.println("NIM NAMA PRODI KELAS");
        data[rear].tampilkanData();
    }
}
```

```
System.out.println("6. Cek Antrian paling belakang");
case 6:
    antrian.LihatAkhir();
    break;

```

```
=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 1
NIM : 213
Nama: a
Prodi: e
Kelas: 2
a berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 1
NIM : b
Nama: d
Prodi: d
Kelas: 3
d berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 4
Daftar Mahasiswa dalam Antrian:
NIM - NAMAjj - PRODI - KELAS
1. 213 - a - e - 2
2. b - d - d - 3

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 2
Melayani mahasiswa: 213 - a - e - 2

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 4
Daftar Mahasiswa dalam Antrian:
NIM - NAMAjj - PRODI - KELAS
1. b - d - d - 3

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 5
Jumlah dalam antrian: 1

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 0
Terima kasih.

E:\Java\AGS_2026>

E:\Java\AGS_2026>
E:\Java\AGS_2026> e: && cd e:\Java\AGS_2026 && cmd /C "C:\Users\asus\AppData\Roaming\Code\User\globalStorage\pleiades.java-extension-pack-jdk\java\latest\bin\java.exe -XX:+ShowCodeDetailsInExceptionMessages -cp E:\Java\AGS_2026\bin p10.LayananAkademikSIAKAD "

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian paling belakang
0. Keluar
Pilih menu: 1
NIM : 123
Nama: aa
Prodi: ti
Kelas: 1a
aa berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian paling belakang
0. Keluar
Pilih menu: 1
NIM : bb
Nama: bbbb
Prodi: sib
Kelas: 1g
bbbb berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian paling belakang
0. Keluar
Pilih menu: 6
Mahasiswa paling belakang: NIM NAMA PRODI KELAS
bb - bbbb - sib - 1g

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian paling belakang
0. Keluar
Pilih menu: 0
Terima kasih.
```

## 2.3 Tugas
```
=== SISTEM ANTRIAN KRS DPA ===
1. Tambah Antrian Mahasiswa
2. Panggil Antrian (2 Mahasiswa)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Terdepan
5. Tampilkan Antrian Terakhir
6. Statistik & Sisa DPA
7. Kosongkan Antrian
0. Keluar
Pilih: 1
NIM: 123
Nama: jojo
Prodi: ti
Kelas: 1f
jojo berhasil masuk antrian.

=== SISTEM ANTRIAN KRS DPA ===
1. Tambah Antrian Mahasiswa
2. Panggil Antrian (2 Mahasiswa)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Terdepan
5. Tampilkan Antrian Terakhir
6. Statistik & Sisa DPA
7. Kosongkan Antrian
0. Keluar
Pilih: 1
NIM: 111
Nama: aaaaa
Prodi: sib
Kelas: 2b
aaaaa berhasil masuk antrian.

=== SISTEM ANTRIAN KRS DPA ===
1. Tambah Antrian Mahasiswa
2. Panggil Antrian (2 Mahasiswa)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Terdepan
5. Tampilkan Antrian Terakhir
6. Statistik & Sisa DPA
7. Kosongkan Antrian
0. Keluar
Pilih: 2
Memanggil antrian untuk proses KRS:
- jojo (Selesai KRS)
- aaaaa (Selesai KRS)

=== SISTEM ANTRIAN KRS DPA ===
1. Tambah Antrian Mahasiswa
2. Panggil Antrian (2 Mahasiswa)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Terdepan
5. Tampilkan Antrian Terakhir
6. Statistik & Sisa DPA
7. Kosongkan Antrian
0. Keluar
Pilih: 3
Antrian kosong.

=== SISTEM ANTRIAN KRS DPA ===
1. Tambah Antrian Mahasiswa
2. Panggil Antrian (2 Mahasiswa)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Terdepan
5. Tampilkan Antrian Terakhir
6. Statistik & Sisa DPA
7. Kosongkan Antrian
0. Keluar
Pilih: 1
NIM: 199
Nama: bib
Prodi: ti
Kelas: 1a
bib berhasil masuk antrian.

=== SISTEM ANTRIAN KRS DPA ===
1. Tambah Antrian Mahasiswa
2. Panggil Antrian (2 Mahasiswa)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Terdepan
5. Tampilkan Antrian Terakhir
6. Statistik & Sisa DPA
7. Kosongkan Antrian
0. Keluar
Pilih: 1
NIM: 3456
Nama: kaka
Prodi: sib
Kelas: 1a
kaka berhasil masuk antrian.

=== SISTEM ANTRIAN KRS DPA ===
1. Tambah Antrian Mahasiswa
2. Panggil Antrian (2 Mahasiswa)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Terdepan
5. Tampilkan Antrian Terakhir
6. Statistik & Sisa DPA
7. Kosongkan Antrian
0. Keluar
Pilih: 3
Daftar Antrian (Seluruhnya):
199 - bib - ti - 1a
3456 - kaka - sib - 1a

=== SISTEM ANTRIAN KRS DPA ===
1. Tambah Antrian Mahasiswa
2. Panggil Antrian (2 Mahasiswa)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Terdepan
5. Tampilkan Antrian Terakhir
6. Statistik & Sisa DPA
7. Kosongkan Antrian
0. Keluar
Pilih: 6
--- STATISTIK ---
Jumlah antrian saat ini     : 2
Mahasiswa sudah selesai KRS : 2
Sisa mahasiswa DPA (belum)  : 28

=== SISTEM ANTRIAN KRS DPA ===
1. Tambah Antrian Mahasiswa
2. Panggil Antrian (2 Mahasiswa)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Terdepan
5. Tampilkan Antrian Terakhir
6. Statistik & Sisa DPA
7. Kosongkan Antrian
0. Keluar
Pilih: 5
Antrian Paling Akhir:
3456 - kaka - sib - 1a

=== SISTEM ANTRIAN KRS DPA ===
1. Tambah Antrian Mahasiswa
2. Panggil Antrian (2 Mahasiswa)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Terdepan
5. Tampilkan Antrian Terakhir
6. Statistik & Sisa DPA
7. Kosongkan Antrian
0. Keluar
Pilih: 4
2 Antrian Terdepan:
199 - bib - ti - 1a
3456 - kaka - sib - 1a

=== SISTEM ANTRIAN KRS DPA ===
1. Tambah Antrian Mahasiswa
2. Panggil Antrian (2 Mahasiswa)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Terdepan
5. Tampilkan Antrian Terakhir
6. Statistik & Sisa DPA
7. Kosongkan Antrian
0. Keluar
Pilih: 7
Antrian berhasil dikosongkan.

=== SISTEM ANTRIAN KRS DPA ===
1. Tambah Antrian Mahasiswa
2. Panggil Antrian (2 Mahasiswa)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Terdepan
5. Tampilkan Antrian Terakhir
6. Statistik & Sisa DPA
7. Kosongkan Antrian
0. Keluar
Pilih: 3
Antrian kosong.

=== SISTEM ANTRIAN KRS DPA ===
1. Tambah Antrian Mahasiswa
2. Panggil Antrian (2 Mahasiswa)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Terdepan
5. Tampilkan Antrian Terakhir
6. Statistik & Sisa DPA
7. Kosongkan Antrian
0. Keluar
Pilih: 0

E:\Java\AGS_2026>
```