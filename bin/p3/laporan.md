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

