|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020022|
| Nama |  Jovita Maharani |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/jovitamaharani/AGS_2026/tree/main/src/p6) |

# Jobsheet 5 #5 SORTING (BUBBLE, SELECTION, DAN INSERTION SORT)

## 5.2 Praktikum 1 - Mengimplementasikan Sorting menggunakan object
a. SORTING – BUBBLE SORT
```
Data awal 1
20 10 2 7 12 
Data sudah diurutkan dengan BUBBLE SORT (ASC)
2 7 10 12 20 
```
b. SORTING – SELECTION SORT
```
Data awal 2
30 20 2 8 14
Data sudah diurutkan dengan SELECTION SORT (ASC)
2 8 14 20 30
```

c. SORTING – INSERTION SORT
```
Data awal 3
40 10 4 9 3
Data sudah diurutkan dengan INSERTION SORT (ASC)
3 4 9 10 40
```

Pertanyaan
1. Jelaskan fungsi kode program berikut
- untuk melakukan penukaran posisi (swap) antara dua elemen array yang berdekatan. Jika elemen sebelumnya (data[j-1]) lebih besar daripada elemen sesudahnya (data[j]), maka posisinya ditukar agar elemen yang lebih kecil pindah ke depan. Variabel temp digunakan sebagai wadah penyimpanan sementara agar nilai tidak hilang saat proses pemindahan
2. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada
selection sort!
-   int min = i;
    for (int j = i + 1; j < jumData; j++) {
        if (data[j] < data[min]) {
            min = j;
        }
    }
3. Pada Insertion sort , jelaskan maksud dari kondisi pada perulangan
- Kondisi ini berarti perulangan akan terus berjalan selama Nilai elemen di sebelah kiri lebih besar daripada nilai yang sedang diurutkan (temp).untuk mencari posisi yang tepat bagi nilai temp dengan cara menggeser elemen-elemen yang lebih besar ke kanan.
4. Pada Insertion sort, apakah tujuan dari perintah
- untuk menggeser elemen yang nilainya lebih besar ke posisi sebelah kanannya, sehingga memberikan ruang kosong bagi nilai temp untuk disisipkan nantinya.

## 5.3 Praktikum 2- (Sorting Menggunakan Array of Object) 
```
Data mahasiswa sebelum sorting: 
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
-----------------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
-----------------------
Nama: Sofi
NIM: 125
Kelas: 2A
IPK: 3.1
-----------------------
Nama: Sita
NIM: 126
Kelas: 2A
IPK: 3.9
-----------------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
-----------------------
Data Mahasiswa setelah sorting berdasarkan IPK (DESC):
Nama: Sita
NIM: 126
Kelas: 2A
IPK: 3.9
-----------------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
-----------------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
-----------------------
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
-----------------------
Nama: Sofi
NIM: 125
Kelas: 2A
IPK: 3.1
-----------------------
```

 Pertanyaan
 1. Perhatikan perulangan di dalam bubbleSort() di bawah ini:
    a. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?
    - Karena dalam Bubble Sort, jumlah maksimal langkah atau operan yang dibutuhkan untuk memastikan semua data terurut adalah jumlah data dikurangi satu ($n-1$).
    b. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?
    - Karena setiap kali satu tahap (iterasi i) selesai, satu data terbesar (atau terkecil tergantung urutan) sudah pasti berada di posisi yang benar di ujung. Jadi, perulangan j tidak perlu lagi mengecek data yang sudah berada di posisi yang benar tersebut (mengurangi beban komputasi).
    c. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?
    - Perulangan i akan berlangsung sebanyak 49 kali (dari 0 sampai 48). Total tahapannya juga adalah 49 tahap.
2. Modifikasi program diatas dimana data mahasiswa bersifat dinamis (input dari keyborad) yang terdiri dari nim, nama, kelas, dan ipk!
```
Masukkan Data Mahasiswa ke-1
NIM   : 12
Nama  : s
Kelas : 1a
IPK   : 3
---------------------------
Masukkan Data Mahasiswa ke-2
NIM   : 324
Nama  : bb
Kelas : 1b
IPK   : 4
---------------------------
Masukkan Data Mahasiswa ke-3
NIM   : 42
Nama  : cc
Kelas : 2a
IPK   : 4
---------------------------
Masukkan Data Mahasiswa ke-4
NIM   : 324
Nama  : dd
Kelas : 3a
IPK   : 3
---------------------------
Masukkan Data Mahasiswa ke-5
NIM   : 43
Nama  : ee
Kelas : 4a
IPK   : 4
---------------------------
Data mahasiswa sebelum sorting:
Nama: s
NIM: 12
Kelas: 1a
IPK: 3.0
-----------------------
Nama: bb
NIM: 324
Kelas: 1b
IPK: 4.0
-----------------------
Nama: cc
NIM: 42
Kelas: 2a
IPK: 4.0
-----------------------
Nama: dd
NIM: 324
Kelas: 3a
IPK: 3.0
-----------------------
Nama: ee
NIM: 43
Kelas: 4a
IPK: 4.0
-----------------------
Data Mahasiswa setelah sorting berdasarkan IPK (DESC):
Nama: bb
NIM: 324
Kelas: 1b
IPK: 4.0
-----------------------
Nama: cc
NIM: 42
Kelas: 2a
IPK: 4.0
-----------------------
Nama: ee
NIM: 43
Kelas: 4a
IPK: 4.0
-----------------------
Nama: s
NIM: 12
Kelas: 1a
IPK: 3.0
-----------------------
Nama: dd
NIM: 324
Kelas: 3a
IPK: 3.0
-----------------------
```

## 5.3.5 Mengurutkan Data Mahasiswa Berdasarkan IPK (Selection Sort)
```
Masukkan Data Mahasiswa ke-1
NIM   : 32
Nama  : df
Kelas : 2
IPK   : 3,8
---------------------------
Masukkan Data Mahasiswa ke-2
NIM   : 234
Nama  : df
Kelas : 3
IPK   : 3,5
---------------------------
Masukkan Data Mahasiswa ke-3
NIM   : 34
Nama  : ef
Kelas : 4
IPK   : 4
---------------------------
Masukkan Data Mahasiswa ke-4
NIM   : 43
Nama  : fg
Kelas : 3
IPK   : 3,7
---------------------------
Masukkan Data Mahasiswa ke-5
NIM   : 324
Nama  : fs
Kelas : 3
IPK   : 3,7
---------------------------
Data mahasiswa sebelum sorting:
Nama: df
NIM: 32
Kelas: 2
IPK: 3.8
-----------------------
Nama: df
NIM: 234
Kelas: 3
IPK: 3.5
-----------------------
Nama: ef
NIM: 34
Kelas: 4
IPK: 4.0
-----------------------
Nama: fg
NIM: 43
Kelas: 3
IPK: 3.7
-----------------------
Nama: fs
NIM: 324
Kelas: 3
IPK: 3.7
-----------------------
Data Mahasiswa setelah sorting berdasarkan IPK (DESC):
Nama: ef
NIM: 34
Kelas: 4
IPK: 4.0
-----------------------
Nama: df
NIM: 32
Kelas: 2
IPK: 3.8
-----------------------
Nama: fg
NIM: 43
Kelas: 3
IPK: 3.7
-----------------------
Nama: fs
NIM: 324
Kelas: 3
IPK: 3.7
-----------------------
Nama: df
NIM: 234
Kelas: 3
IPK: 3.5
-----------------------
Data yang sudah terurut menggunakan SELECTION SORT (ASC)
Nama: df
NIM: 234
Kelas: 3
IPK: 3.5
-----------------------
Nama: fg
NIM: 43
Kelas: 3
IPK: 3.7
-----------------------
Nama: fs
NIM: 324
Kelas: 3
IPK: 3.7
-----------------------
Nama: df
NIM: 32
Kelas: 2
IPK: 3.8
-----------------------
Nama: ef
NIM: 34
Kelas: 4
IPK: 4.0
-----------------------
```

Pertanyaan
Di dalam method selection sort, terdapat baris program seperti di bawah ini:
Untuk apakah proses tersebut, jelaskan!
- untuk mengeksekusi penukaran posisi. Setelah sistem menemukan elemen dengan nilai terkecil (pada idxMin) dalam satu putaran, elemen tersebut ditukar dengan elemen pada posisi i (posisi target urutan saat itu).

## 5.4 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort
```
Data yang sudah terurut menggunakan INSERTION SORT (ASC)
Nama: dfg
NIM: 435
Kelas: 3
IPK: 3.4
-----------------------
Nama: bbbbb
NIM: 4325
Kelas: 2
IPK: 3.6
-----------------------
Nama: hgfgd
NIM: 53456
Kelas: 1
IPK: 3.9
-----------------------
Nama: hgf
NIM: 234
Kelas: 3
IPK: 4.0
-----------------------
Nama: aaa
NIM: 324
Kelas: 1
IPK: 4.0
-----------------------
```


Pertanyaan
```
Data yang sudah terurut menggunakan INSERTION SORT (DESC)
Nama: aaa
NIM: 324
Kelas: 1
IPK: 4.0
-----------------------
Nama: hgf
NIM: 234
Kelas: 3
IPK: 4.0
-----------------------
Nama: hgfgd
NIM: 53456
Kelas: 1
IPK: 3.9
-----------------------
Nama: bbbbb
NIM: 4325
Kelas: 2
IPK: 3.6
-----------------------
Nama: dfg
NIM: 435
Kelas: 3
IPK: 3.4
-----------------------
```