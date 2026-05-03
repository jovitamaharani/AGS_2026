|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020022|
| Nama |  Jovita Maharani |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/jovitamaharani/AGS_2026/tree/main/src/p9) |

# JOBSHEET 9 STACK

## 2.1 Percobaan 1: Mahasiswa Mengumpulkan Tugas
```

Menu:
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 1
Nama: aa
NIM: 234567
Kelas: 1a
Tugas aa berhasil dikumpulkan

Menu:
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 3
Tugas terakhir dikumpulkan oleh aa

Menu:
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 2
Menilai tugas dari aa
Masukkan nilai (0-100): 99
Nilai Tugas aa adalah 99

Menu:
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 4
Daftar semua tugas
Nama    NIM     Kelas


Menu:
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 3
Stack kosong! Tidak ada tugas yang dikumpulkan

Menu:
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 
```

Pertanyaan
1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana yang perlu diperbaiki?
```
public void print() {
    for (int i = 0; i >= top; i--) {
        System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
    }
    System.out.println("");
}
``` 
2. Berapa banyak data tugas mahasiswa yang dapat ditampung di dalam Stack? Tunjukkan potongan kode programnya!
    - 5 data karena kapasitas stack yang dibuat adalah 5 pada saat inisialisasi objek StackTugasMahasiswa17 stack = new StackTugasMahasiswa17 (5)
3. Mengapa perlu pengecekan kondisi !isFull() pada method push? Kalau kondisi if-else tersebut dihapus, apa dampaknya?
    - karena jika top == size - 1, maka stack penuh. program akan mengalami error ArrayIndexOutOfBoundsException jika kondisi if-else tersebut dihapus, karena program akan mencoba menambahkan data ke dalam stack yang sudah penuh, sehingga melebihi kapasitas array yang telah ditentukan.
4. Modifikasi kode program pada class MahasiswaDemo dan StackTugasMahasiswa sehingga pengguna juga dapat melihat mahasiswa yang pertama kali mengumpulkan tugas melalui operasi lihat tugas terbawah!
    - Tambahkan method peekBottom() pada class StackTugasMahasiswa17 untuk melihat tugas terbawah, dan tambahkan case baru pada switch di class MahasiswaDemo17 untuk memanggil method tersebut.
5. Tambahkan method untuk dapat menghitung berapa banyak tugas yang sudah dikumpulkan saat ini, serta tambahkan operasi menunya!
    - Tambahkan method size() pada class StackTugasMahasiswa17 untuk menghitung jumlah tugas yang sudah dikumpulkan, dan tambahkan case baru pada switch di class MahasiswaDemo17 untuk memanggil method tersebut.


## 2.2 Percobaan 2: Konversi Nilai Tugas ke Biner 
```
Menu:
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 1
Nama: jo
NIM: 3
Kelas: 1a
Tugas jo berhasil dikumpulkan

Menu:
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 3
Tugas terakhir dikumpulkan oleh jo

Menu:
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 4
Daftar semua tugas
Nama    NIM     Kelas
jo      3       1a


Menu:
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 2
Menilai tugas dari jo
Masukkan nilai (0-100): 90
Nilai Tugas jo adalah 90
Nilai Biner Tugas: 1011010

Menu:
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 
```

Pertanyaan
1. Jelaskan alur kerja dari method konversiDesimalKeBiner!
    - Method konversiDesimalKeBiner menerima sebuah nilai desimal (nilai tugas) sebagai parameter. Di dalam method, dilakukan perulangan while yang terus berjalan selama nilai desimal tidak sama dengan 0. Pada setiap iterasi, sisa pembagian nilai desimal dengan 2 (nilai % 2) disimpan dalam variabel biner, dan nilai desimal dibagi dengan 2 (nilai /= 2). Nilai biner yang diperoleh dari setiap iterasi ditambahkan ke string hasil dengan urutan terbalik (biner + hasil). Setelah perulangan selesai, method mengembalikan string hasil yang berisi representasi biner dari nilai desimal yang diberikan.
2. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0), bagaimana hasilnya? Jelaskan alasannya
    - maka akan mengalami error karena variabel kode tidak dideklarasikan di dalam method tersebut. Variabel yang digunakan untuk menyimpan nilai desimal adalah nilai, sehingga kondisi perulangan harus tetap menggunakan nilai untuk memastikan bahwa proses konversi berjalan dengan benar.
