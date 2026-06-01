 |  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020022|
| Nama |  Jovita Maharani |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/jovitamaharani/AGS_2026/tree/main/src/p14) |


# Jobsheet 14 Tree

## 14.2.1 Percobaan 1
```
Daftar semua mahasiswa (in order traversal):
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85

Pencarian data mahasiswa:
Cari mahasiswa dengan ipk: 3.54 : Ditemukan
Cari mahasiswa dengan ipk: 3.22: Tidak ditemukan

Daftar semua mahasiswa setelah penambahan 3 mahasiswa:
InOrder Traversal:
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85

PreOrder Traversal:
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72

PostOrder Traversal:
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57

Penghapusan data mahasiswa
Jika 2 anak, current = 
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72

Daftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85
```

Pertanyaan:
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa?
- Binary search tree memiliki aturan khusus dimana setiap node memiliki nilai yang lebih kecil dari node induknya di sebelah kiri dan nilai yang lebih besar di sebelah kanan. Hal ini memungkinkan proses pencarian data menjadi lebih cepat karena kita dapat langsung memutuskan untuk mencari ke kiri atau ke kanan berdasarkan perbandingan nilai, sehingga mengurangi jumlah node yang perlu diperiksa dibandingkan dengan binary tree biasa yang tidak memiliki aturan tersebut.
2. Untuk apakah di class Node, kegunaan dari atribut left dan right?
- Atribut left dan right pada class Node digunakan untuk menyimpan referensi ke node anak kiri dan anak kanan dari sebuah node dalam binary tree. Atribut left menunjuk ke node yang memiliki nilai lebih kecil, sedangkan atribut right menunjuk ke node yang memiliki nilai lebih besar. Dengan adanya atribut ini, kita dapat membangun struktur pohon biner yang memungkinkan operasi seperti penambahan, pencarian, dan penghapusan data dilakukan dengan efisien.
3. 
a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?
- Atribut root di dalam class BinaryTree digunakan untuk menyimpan referensi ke node utama atau akar dari pohon biner. Root adalah titik awal dari struktur pohon, dan semua operasi seperti penambahan, pencarian, dan penghapusan data dimulai dari root. Dengan memiliki atribut root, kita dapat dengan mudah mengakses seluruh pohon dan melakukan berbagai operasi pada struktur data tersebut.
b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?
- Ketika objek tree pertama kali dibuat, nilai dari root adalah null. Ini menunjukkan bahwa pohon biner masih kosong dan belum memiliki node apapun. Setelah penambahan node pertama, root akan diisi dengan referensi ke node tersebut, dan pohon akan mulai terbentuk.
4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?
- Ketika tree masih kosong dan akan ditambahkan sebuah node baru, proses yang terjadi adalah sebagai berikut:
a. Node baru akan dibuat dengan nilai yang diberikan.
b. Karena tree masih kosong, node baru tersebut akan menjadi root dari pohon biner.
c. Atribut root akan diupdate untuk menunjuk ke node baru tersebut, sehingga node baru menjadi titik awal dari struktur pohon.
d. Setelah node baru menjadi root, setiap penambahan node berikutnya akan mengikuti aturan binary search tree untuk menentukan posisi node baru, apakah akan ditempatkan di sebelah kiri atau kanan dari node yang sudah ada.
5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris program tersebut?
parent = current;
if (mahasiswa.ipk < current.mahasiswa.ipk) {
    current = current.left;
    if (current == null) {
        parent.left = newNode;
        return;
    }
} else {
    current = current.right;
    if (current == null) {
        parent.right = newNode;
        return;
    }
}
- Baris program tersebut digunakan untuk menambahkan node baru ke dalam binary search tree dengan mengikuti aturan penempatan berdasarkan nilai IPK mahasiswa. Berikut penjelasan detilnya:
a. parent = current; - Baris ini menyimpan referensi ke node saat ini (current) ke dalam variabel parent. Ini penting karena kita akan menggunakan parent untuk menentukan di mana node baru akan ditempatkan.
b. if (mahasiswa.ipk < current.mahasiswa.ipk) { - Baris ini mengecek apakah nilai IPK mahasiswa baru lebih kecil dari nilai IPK dari node saat ini. Jika nilai IPK baru lebih kecil, maka node baru akan ditempatkan di sebelah kiri dari node saat ini.
c. current = current.left; - Baris ini mengarahkan pointer current ke node anak kiri dari node saat ini. Jika node saat ini memiliki anak kiri, maka pointer current akan menunjuk ke node anak kiri tersebut.
d. if (current == null) { - Baris ini mengecek apakah node anak kiri saat ini adalah null. Jika node anak kiri saat ini tidak ada, maka node baru akan ditempatkan di sebelah kiri dari node saat ini.
e. parent.left = newNode; - Baris ini mengarahkan referensi ke node baru (newNode) ke variabel parent.left. Dengan mengarahkan referensi ini, kita dapat mengakses node baru dari variabel parent.
f. return; - Baris ini mengembalikan nilai dari method add().
6. Jelaskan langkah-langkah pada method delete() saat menghapus sebuah node yang memiliki dua anak. Bagaimana method getSuccessor() membantu dalam proses ini?
- Saat menghapus sebuah node yang memiliki dua anak, langkah-langkah yang dilakukan pada method delete() adalah sebagai berikut:
a. Pertama, kita mencari node yang akan dihapus (current) dan menyimpan referensi ke node induknya (parent).
b. Setelah menemukan node yang akan dihapus, kita memeriksa apakah node tersebut memiliki dua anak. Jika iya, kita perlu mencari pengganti (successor) untuk node yang akan dihapus.
c. Method getSuccessor() digunakan untuk mencari node pengganti yang akan menggantikan posisi node yang akan dihapus. Successor adalah node yang memiliki nilai lebih kecil dari node yang akan dihapus. Jika tidak ada node pengganti, maka method getSuccessor() akan mengembalikan null.
d. Setelah menemukan node pengganti, kita menghapus node yang akan dihapus dari pohon biner. Jika node pengganti adalah node induknya, maka node induknya akan menjadi nilai dari node yang akan dihapus. Jika tidak, maka node pengganti akan menjadi nilai dari node induknya.
e. Jika node yang akan dihapus adalah root, maka root akan dihapus dan nilai dari root akan diubah menjadi nilai dari node pengganti.
f. Jika node yang akan dihapus bukan root, maka node induknya akan menjadi nilai dari node pengganti.
g. Setelah node yang akan dihapus dihapus, kita menghapus referensi ke node tersebut dari variabel parent.
h. Jika node induknya adalah root, maka root akan dihapus dan nilai dari root akan diubah menjadi nilai dari node pengganti.
i. Jika node induknya bukan root, maka node pengganti akan menjadi nilai dari node induknya.
j. Setelah node pengganti dihapus, kita menghapus referensi ke node tersebut dari variabel parent.
k. Setelah node yang akan dihapus dihapus, kita menghapus referensi ke node tersebut dari variabel parent.



