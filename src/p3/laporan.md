|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020022|
| Nama |  Jovita Maharani |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/jovitamaharani/AGS_2026/tree/main/src/p3) |

# Jobsheet 3 #3 ARRAY OF OBJECTS

## 3.2 Membuat Array dari Object, Mengisi dan Menampilkan
```
ShowCodeDetailsInExceptionMessages -cp E:\Java\AGS_2026\bin p3.MahasiswaDemo17 "
NIM    : 244107060033
Nama   : AGNES TITANIA KINANTI
Kelas  : SIB-1E
IPK    : 3.75
---------------------------------
NIM    : 2341720172
Nama   : ACHMAD MAULANA HAMZAH
Kelas  : TI-2A
IPK    : 3.36
---------------------------------
NIM    : 244107023006
Nama   : DIRHAMAWAN PUTRANTO
Kelas  : TI-2E
IPK    : 3.8
---------------------------------

```

Pertanyaan:
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method? Jelaskan!
    - class yang akan dibuat tidak harus selalu memiliki atribut sekaligus method, karena array of object membutuhkan class untuk membuat atribut sebagai tempat menyimpan data, dan method untuk memproses data.
2. Apa yang dilakukan oleh kode program berikut?
    - kode program tersebut untuk membuat array dari objek arrayOfMahasiswa, kode tersebut akan membuat array arrayOfMahasiswa yang dapat menampung 3 objek mahasiswa
3. Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan konstruktur pada baris program berikut?
    - class mahasiswa tidak memiliki konstruktor, pada baris program diatas bisa dilakukan pemanggilan karena java memiliki konstruktor deault
4. Apa yang dilakukan oleh kode program berikut?
    - kode program tersebut adalah proses intansiasi objek mahasiswa, menggunkan konstruktor default, membuat objek mahasiswa, mengisi nilai untuk setiap atributnya dalam elemen arrayOfMahasiswa pada indeks ke-0
5. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2?
    - agar struktur data (class Mahasiswa) terpisah dari logika jalannya program (class MahasiswaDemo) untuk mempermudah pengelolaan kode.


## 3.3 Menerima Input Isian Array Menggunakan Looping
```
Masukan data mahasiswa ke-1
NIM    : 32875i476
Nama   : jow
Kelas  : 1F
IPK    : 3.9
---------------------------------
Masukan data mahasiswa ke-2
NIM    : 475678456
Nama   : bubu
Kelas  : 1A
IPK    : 3.9
---------------------------------
Masukan data mahasiswa ke-3
NIM    : 487358
Nama   : sasa
Kelas  : 1I
IPK    : 3.9
---------------------------------
Data mahasiswa ke-1
NIM    : 32875i476
Nama   : jow
Kelas  : 1F
IPK    : 3.9
---------------------------------
Data mahasiswa ke-2
NIM    : 475678456
Nama   : bubu
Kelas  : 1A
IPK    : 3.9
---------------------------------
Data mahasiswa ke-3
NIM    : 487358
Nama   : sasa
Kelas  : 1I
IPK    : 3.9
---------------------------------
```

Pertanyaan
1. Tambahkan method cetakInfo() pada class Mahasiswa kemudian modifikasi kode program pada langkah no 3.
    - ```
         Masukan data mahasiswa ke-1
NIM    : 355 
Nama   : fh
Kelas  : 5
IPK    : 4 
---------------------------------
Masukan data mahasiswa ke-2
NIM    : 5777776
Nama   : fytf
Kelas  : 6
IPK    : 3
---------------------------------
Masukan data mahasiswa ke-3
NIM    : drgfgt
Nama   : yhr
Kelas  : 2
IPK    : 4
---------------------------------
Data mahasiswa ke-1
Cetak info mahasiswa
Data mahasiswa ke-1
NIM    : 355
Nama   : fh
Kelas  : 5
IPK    : 4.0
Data mahasiswa ke-2
NIM    : 355
Nama   : fh
Kelas  : 5
IPK    : 4.0
Data mahasiswa ke-3
NIM    : 355
Nama   : fh
Kelas  : 5
IPK    : 4.0
---------------------------------
Data mahasiswa ke-2
Cetak info mahasiswa
Data mahasiswa ke-1
NIM    : 5777776
Nama   : fytf
Kelas  : 6
IPK    : 3.0
Data mahasiswa ke-2
NIM    : 5777776
Nama   : fytf
Kelas  : 6
IPK    : 3.0
Data mahasiswa ke-3
NIM    : 5777776
Nama   : fytf
Kelas  : 6
IPK    : 3.0
---------------------------------
Data mahasiswa ke-3
Cetak info mahasiswa
Data mahasiswa ke-1
NIM    : drgfgt
Nama   : yhr
Kelas  : 2
IPK    : 4.0
Data mahasiswa ke-2
NIM    : drgfgt
Nama   : yhr
Kelas  : 2
IPK    : 4.0
Data mahasiswa ke-3
NIM    : drgfgt
Nama   : yhr
Kelas  : 2
IPK    : 4.0
---------------------------------

E:\Java\AGS_2026>
      ```
2. Misalkan Anda punya array baru bertipe array of Mahasiswa dengan nama myArrayOfMahasiswa. Mengapa kode berikut menyebabkan error?
    - karena kode tersebut mencoba mengakses indeks ke-0 dari array myArrayOfMahasiswa yang belum diinisialisasi, sehingga menyebabkan NullPointerException.

## 3.4 Constructor Berparameter
```
Masukkan Data Matakuliah ke-1
Kode       : 1
Nama       : df
SKS        : 3
Jumlah Jam : 3
---------------------------------
Masukkan Data Matakuliah ke-2
Kode       : 2 
Nama       : gv
SKS        : 4
Jumlah Jam : 4
---------------------------------
Masukkan Data Matakuliah ke-3
Kode       : 3
Nama       : vgdf
SKS        : 6
Jumlah Jam : 2
---------------------------------
Data Matakuliah ke-1
Kode       : 1
Nama       : df
SKS        : 3
Jumlah Jam : 3
---------------------------------
Data Matakuliah ke-2
Kode       : 2
Nama       : gv
SKS        : 4
Jumlah Jam : 4
---------------------------------
Data Matakuliah ke-3
Kode       : 3
Nama       : vgdf
SKS        : 6
Jumlah Jam : 2
---------------------------------

E:\Java\AGS_2026>
```

Pertanyaan
1. Apakah suatu class dapat memiliki lebih dari 1 constructor? Jika iya, berikan contohnya
    -iya, suatu class dapat memiliki lebih dari 1 constructor, ini disebut constructor overloading. Contohnya:
    public Matakuliah17() { }
    public Matakuliah17(String kd, String nm) { }
2. Tambahkan method tambahData() pada class Matakuliah, kemudian gunakan method
tersebut di class MatakuliahDemo untuk menambahkan data Matakuliah
    - ```
    Masukkan jumlah matakuliah: 1
Masukkan Data Matakuliah ke-1
Kode       : 1
Nama       : aaa
SKS        : 2
Jumlah Jam : 2
---------------------------------
Data Matakuliah ke-1
Kode       : 1
Nama       : aaa
SKS        : 2
Jumlah Jam : 2
---------------------------------

    ```
3. Tambahkan method cetakInfo() pada class Matakuliah, kemudian gunakan method
tersebut di class MatakuliahDemo untuk menampilkan data hasil inputan di layar
    - ```
Masukkan Data Matakuliah ke-1
Kode       : 1
Nama       : ddddd
SKS        : 2
Jumlah Jam : 2
---------------------------------
Masukkan Data Matakuliah ke-2
Kode       : 2
Nama       : bbbb
SKS        : 3
Jumlah Jam : 3
---------------------------------
Masukkan Data Matakuliah ke-3
Kode       : 3
Nama       : aaa
SKS        : 4
Jumlah Jam : 4
---------------------------------
Data Matakuliah ke-1
Kode       : 1
Nama       : ddddd
SKS        : 2
Jumlah Jam : 2
---------------------------------
Data Matakuliah ke-2
Kode       : 2
Nama       : bbbb
SKS        : 3
Jumlah Jam : 3
---------------------------------
Data Matakuliah ke-3
Kode       : 3
Nama       : aaa
SKS        : 4
Jumlah Jam : 4
---------------------------------
    ```
4. Modifikasi kode program pada class MatakuliahDemo agar panjang (jumlah elemen) dari
array of object Matakuliah ditentukan oleh user melalui input dengan Scanner
    - ```
    Masukkan jumlah matakuliah: 1
Masukkan Data Matakuliah ke-1
Kode       : 1
Nama       : ksjfhui
SKS        : 3
Jumlah Jam : 4
---------------------------------
Data Matakuliah ke-1
Kode       : 1
Nama       : ksjfhui
SKS        : 3
Jumlah Jam : 4
---------------------------------
    ```


## Tugas

1. 
```
Masukkan Data Dosen ke-1
Kode          : 1
Nama          : e
Jenis Kelamin (pria/wanita): pria
Usia          : 21
---------------------------------
Masukkan Data Dosen ke-2
Kode          : 2
Nama          : aaa
Jenis Kelamin (pria/wanita): wanita
Usia          : 35
---------------------------------
Masukkan Data Dosen ke-3
Kode          : 3
Nama          : bbb
Jenis Kelamin (pria/wanita): wanita
Usia          : 40
---------------------------------
Data Dosen ke-1
Kode          : 1
Nama          : e
Jenis Kelamin : Pria
Usia          : 21
---------------------------------
Data Dosen ke-2
Kode          : 2
Nama          : aaa
Jenis Kelamin : Wanita
Usia          : 35
---------------------------------
Data Dosen ke-3
Kode          : 3
Nama          : bbb
Jenis Kelamin : Wanita
Usia          : 40
---------------------------------

```

2. 
a. ```
Masukkan Data Dosen ke-1
Kode          : 1
Nama          : ds
Jenis Kelamin (pria/wanita): wanita
Usia          : 22
---------------------------------
Masukkan Data Dosen ke-2
Kode          : 2
Nama          : r
Jenis Kelamin (pria/wanita): pria
Usia          : 43
---------------------------------
Masukkan Data Dosen ke-3
Kode          : 3
Nama          : aaa
Jenis Kelamin (pria/wanita): pria
Usia          : 45
---------------------------------
Data Dosen ke-1
Kode          : 1
Nama          : ds
Jenis Kelamin : Wanita
Usia          : 22
---------------------------------
Data Dosen ke-2
Kode          : 2
Nama          : r
Jenis Kelamin : Pria
Usia          : 43
---------------------------------
Data Dosen ke-3
Kode          : 3
Nama          : aaa
Jenis Kelamin : Pria
Usia          : 45
---------------------------------

=======DATA SEMUA DOSEN=======
Kode          : 1
Nama          : ds
Jenis Kelamin : Wanita
Usia          : 22
-----------------------------------------------------
Kode          : 2
Nama          : r
Jenis Kelamin : Pria
Usia          : 43
-----------------------------------------------------
Kode          : 3
Nama          : aaa
Jenis Kelamin : Pria
Usia          : 45
-----------------------------------------------------
```

b. ```
Masukkan Data Dosen ke-1
Kode          : 1
Nama          : de
Jenis Kelamin (pria/wanita): wanita
Usia          : 32
---------------------------------
Masukkan Data Dosen ke-2
Kode          : 2
Nama          : aaa
Jenis Kelamin (pria/wanita): wanita
Usia          : 21
---------------------------------
Masukkan Data Dosen ke-3
Kode          : 3
Nama          : djfrjs
Jenis Kelamin (pria/wanita): pria
Usia          : 45
---------------------------------
Data Dosen ke-1
Kode          : 1
Nama          : de
Jenis Kelamin : Wanita
Usia          : 32
---------------------------------
Data Dosen ke-2
Kode          : 2
Nama          : aaa
Jenis Kelamin : Wanita
Usia          : 21
---------------------------------
Data Dosen ke-3
Kode          : 3
Nama          : djfrjs
Jenis Kelamin : Pria
Usia          : 45
---------------------------------

=======DATA SEMUA DOSEN=======
Kode          : 1
Nama          : de
Jenis Kelamin : Wanita
Usia          : 32
-----------------------------------------------------
Kode          : 2
Nama          : aaa
Jenis Kelamin : Wanita
Usia          : 21
-----------------------------------------------------
Kode          : 3
Nama          : djfrjs
Jenis Kelamin : Pria
Usia          : 45
-----------------------------------------------------

=======JUMLAH DOSEN PER JENIS KELAMIN=======
Pria : 1
Wanita : 2
```

c. ```
Masukkan Data Dosen ke-1
Kode          : 1
Nama          : sd
Jenis Kelamin (pria/wanita): wanita
Usia          : 30
---------------------------------
Masukkan Data Dosen ke-2
Kode          : 2
Nama          : bvcfdg
Jenis Kelamin (pria/wanita): wanita
Usia          : 45
---------------------------------
Masukkan Data Dosen ke-3
Kode          : 3
Nama          : addvn
Jenis Kelamin (pria/wanita): pria
Usia          : 50
---------------------------------
Data Dosen ke-1
Kode          : 1
Nama          : sd
Jenis Kelamin : Wanita
Usia          : 30
---------------------------------
Data Dosen ke-2
Kode          : 2
Nama          : bvcfdg
Jenis Kelamin : Wanita
Usia          : 45
---------------------------------
Data Dosen ke-3
Kode          : 3
Nama          : addvn
Jenis Kelamin : Pria
Usia          : 50
---------------------------------

=======DATA SEMUA DOSEN=======
Kode          : 1
Nama          : sd
Jenis Kelamin : Wanita
Usia          : 30
-----------------------------------------------------
Kode          : 2
Nama          : bvcfdg
Jenis Kelamin : Wanita
Usia          : 45
-----------------------------------------------------
Kode          : 3
Nama          : addvn
Jenis Kelamin : Pria
Usia          : 50
-----------------------------------------------------

=======JUMLAH DOSEN PER JENIS KELAMIN=======
Pria : 1
Wanita : 2
Rata-rata Usia Pria   : 50.0
Rata-rata Usia Wanita : 37.5
------------------------------------------------------
```

d. ```
Masukkan Data Dosen ke-1
Kode          : 1
Nama          : sd
Jenis Kelamin (pria/wanita): wanita
Usia          : 30
---------------------------------
Masukkan Data Dosen ke-2
Kode          : 2
Nama          : bvcfdg
Jenis Kelamin (pria/wanita): wanita
Usia          : 45
---------------------------------
Masukkan Data Dosen ke-3
Kode          : 3
Nama          : addvn
Jenis Kelamin (pria/wanita): pria
Usia          : 50
---------------------------------
Data Dosen ke-1
Kode          : 1
Nama          : sd
Jenis Kelamin : Wanita
Usia          : 30
---------------------------------
Data Dosen ke-2
Kode          : 2
Nama          : bvcfdg
Jenis Kelamin : Wanita
Usia          : 45
---------------------------------
Data Dosen ke-3
Kode          : 3
Nama          : addvn
Jenis Kelamin : Pria
Usia          : 50
---------------------------------

=======DATA SEMUA DOSEN=======
Kode          : 1
Nama          : sd
Jenis Kelamin : Wanita
Usia          : 30
-----------------------------------------------------
Kode          : 2
Nama          : bvcfdg
Jenis Kelamin : Wanita
Usia          : 45
-----------------------------------------------------
Kode          : 3
Nama          : addvn
Jenis Kelamin : Pria
Usia          : 50
-----------------------------------------------------

=======JUMLAH DOSEN PER JENIS KELAMIN=======
Pria : 1
Wanita : 2
Rata-rata Usia Pria   : 50.0
Rata-rata Usia Wanita : 37.5
------------------------------------------------------

======= DOSEN PALING TUA =======
Kode          : 3
Nama          : addvn
Jenis Kelamin : Pria
Usia          : 50
--------------------------------
```

e. ```
======= DOSEN PALING MUDA =======
Kode          : 1
Nama          : sd
Jenis Kelamin : Wanita
Usia          : 30
---------------------------------
```