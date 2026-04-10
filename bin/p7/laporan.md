|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020022|
| Nama |  Jovita Maharani |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/jovitamaharani/AGS_2026/tree/main/src/p7) |

# JOBSHEET 6 SEARCHING

## 6.2. Searching/ Pencarian Menggunakan Algoritma Sequential Search
```
Masukkan Data Mahasiswa ke-1
NIM   : 784
Nama  : adi
Kelas : 2
IPK   : 3,6
---------------------------
Masukkan Data Mahasiswa ke-2
NIM   : 435
Nama  : tio
Kelas : 2
IPK   : 3,8
---------------------------
Masukkan Data Mahasiswa ke-3
NIM   : 21
Nama  : ila
Kelas : 4
IPK   : 3 
---------------------------
Masukkan Data Mahasiswa ke-4
NIM   : 9837
Nama  : lia
Kelas : 2
IPK   : 3,5
---------------------------
Masukkan Data Mahasiswa ke-5
NIM   : 7828
Nama  : fia
Kelas : 3
IPK   : 3,3
---------------------------
Data mahasiswa sebelum sorting:
Nama: adi
NIM: 784
Kelas: 2
IPK: 3.6
-----------------------
Nama: tio
NIM: 435
Kelas: 2
IPK: 3.8
-----------------------
Nama: ila
NIM: 21
Kelas: 4
IPK: 3.0
-----------------------
Nama: lia
NIM: 9837
Kelas: 2
IPK: 3.5
-----------------------
Nama: fia
NIM: 7828
Kelas: 3
IPK: 3.3
-----------------------
Data Mahasiswa setelah sorting berdasarkan IPK (DESC):
Nama: tio
NIM: 435
Kelas: 2
IPK: 3.8
-----------------------
Nama: adi
NIM: 784
Kelas: 2
IPK: 3.6
-----------------------
Nama: lia
NIM: 9837
Kelas: 2
IPK: 3.5
-----------------------
Nama: fia
NIM: 7828
Kelas: 3
IPK: 3.3
-----------------------
Nama: ila
NIM: 21
Kelas: 4
IPK: 3.0
-----------------------
Data yang sudah terurut menggunakan SELECTION SORT (ASC)
Nama: ila
NIM: 21
Kelas: 4
IPK: 3.0
-----------------------
Nama: fia
NIM: 7828
Kelas: 3
IPK: 3.3
-----------------------
Nama: lia
NIM: 9837
Kelas: 2
IPK: 3.5
-----------------------
Nama: adi
NIM: 784
Kelas: 2
IPK: 3.6
-----------------------
Nama: tio
NIM: 435
Kelas: 2
IPK: 3.8
-----------------------
Data yang sudah terurut menggunakan INSERTION SORT (DESC)
Nama: tio
NIM: 435
Kelas: 2
IPK: 3.8
-----------------------
Nama: adi
NIM: 784
Kelas: 2
IPK: 3.6
-----------------------
Nama: lia
NIM: 9837
Kelas: 2
IPK: 3.5
-----------------------
Nama: fia
NIM: 7828
Kelas: 3
IPK: 3.3
-----------------------
Nama: ila
NIM: 21
Kelas: 4
IPK: 3.0
-----------------------
---------------------
Pencarian data
---------------------
masukkan ipk mahasiswa yang dicari:
IPK: 3,4
menggunakan sequential searching
data3.4tidak ditemukan
Data mahasiswa dengan IPK 3.4 tidak ditemukan
```

Pertanyaan
1. Jelaskan perbedaan metod tampilDataSearch dan tampilPosisi pada class MahasiswaBerprestasi!
- tampilPosisi: Berfungsi untuk menginformasikan apakah data ditemukan atau tidak. Jika ditemukan, metode ini hanya menampilkan indeks (posisi) data tersebut dalam array.
- tampilDataSearch: Berfungsi untuk menampilkan detail atribut dari objek yang dicari (seperti NIM, Nama, dan Kelas) berdasarkan indeks yang ditemukan.
2. Jelaskan fungsi break pada kode program di bawah ini!
- untuk menghentikan perulangan for setelah data ditemukan
3. Apa fungsi variabel pos atau indeks hasil pencarian dalam program sequential search?
- sebagai penanda hasil pencarian. Jika bernilai -1, artinya data tidak ditemukan. Jika bernilai selain -1, nilai tersebut menyimpan lokasi indeks data di dalam array yang akan digunakan oleh metode lain untuk menampilkan informasi lengkap
4. Jika terdapat lebih dari satu data dengan nilai yang sama, hasil pencarian sequential search yang dibuat di atas akan menampilkan data ke berapa? Jelaskan.
- maka program akan menampilkan data yang ditemukan pertama kali (indeks terkecil), karena ada perintah break yang langsung menghentikan pencarian ketika hasil pencarian pertama kali ditemukan
5. Berkaitan dengan pertanyaan nomor 2 di atas, apa yang terjadi jika perintah break dihapus dari kode di atas?
- maka program akan terus memproses seluruh elemen array hingga selesai. Jika ada data ganda, variabel posisi akan terus diperbarui, jadi hasil yang muncul adalah data indeks dari data terakhir

## 6.3. Searching/ Pencarian Menggunakan Algoritma Binary Search

Pertanyaan
1. Tunjukkan pada kode program yang mana proses divide dijalankan!
- 
2. Tunjukkan pada kode program yang mana proses conquer dijalankan!
- 
3. Apa fungsi left, right, dan mid?
- 
4. Jika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian?
- 
5. Jika IPK yang dimasukkan dari IPK terbesar ke terkecil (misal: 3.8, 3.7, 3.5, 3.4, 3.2) dan elemen yang dicari adalah 3.2. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai
- 
6. Jelaskan bagaimana binary search menentukan bahwa data yang dicari tidak ditemukan di dalam array.
- 
7. Modifikasi program di atas yang mana jumlah mahasiswa yang diinputkan sesuai dengan masukan dari keyboard.
- 