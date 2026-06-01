|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020022|
| Nama |  Jovita Maharani | 
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/jovitamaharani/AGS_2026/tree/main/src/p11) |


# JOBSHEET 10 LINKED LIST

## 2.1 Pembuatan Single Linked List
```
Linked List Kosong
Isi Linked List:
2004    Dirga   TI-1B   3.8

Isi Linked List:
2004    Dirga   TI-1B   3.8
2001    Alvaro  TI-1A   3.5

Isi Linked List:
2004    Dirga   TI-1B   3.8
2003    Cintia  TI-1A   3.7
2001    Alvaro  TI-1A   3.5

Isi Linked List:
2004    Dirga   TI-1B   3.8
2003    Cintia  TI-1A   3.7
2002    Bimon   TI-1B   3.6
2001    Alvaro  TI-1A   3.5
```

Pertanyaan:
1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?
- karena saat awal program dijalankan, linked list belum memiliki data apapun sehingga kondisi isEmpty() terpenuhi dan menghasilkan output "Linked List Kosong".
2. Jelaskan kegunaan variable temp secara umum pada setiap method!
- Variable temp digunakan sebagai pointer sementara untuk menelusuri linked list. Dalam setiap method, temp digunakan untuk menyimpan alamat node saat ini yang sedang diproses, sehingga kita dapat mengakses data dan node berikutnya dalam linked list.
3. Lakukan modifikasi agar data dapat ditambahkan dari keyboard!
```
--- INPUT DATA MAHASISWA ---
Masukkan Jumlah Mahasiswa yang ingin diinput: 2

Data Mahasiswa ke-1
NIM   : 1212
Nama  : aaaa
Kelas : 1a
IPK   : 4

Data Mahasiswa ke-2
NIM   : 2222
Nama  : bbb
Kelas : 1a
IPK   : 3,9

=================================
Isi Linked List:
1212    aaaa    1a      4.0
2222    bbb     1a      3.9
```