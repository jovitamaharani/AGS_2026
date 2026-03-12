|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020022|
| Nama |  Jovita Maharani |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/jovitamaharani/AGS_2026/tree/main/src/p5) |

# Jobsheet 5 #5 BRUTE FORCE DIVIDE AND CONQUER

## 5.2 Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer
``` 
Masukkan nilai: 5
Nilai faktorial 5 menggunakan BF: 120
Nilai faktorial 5 menggunakan DC: 120
```

5.2.3. Pertanyaan
1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else!
    - pada kode if (n == 1) adalah base case (kondisi berhenti) agar rekrusi bisa berhenti ketika n sudah mencapai 1. 
    - pada bagian else adalah bagian divide (membagi masalah menjadi sub masalah yang lebih kecil) dengan memanggil fungsi dirinya sendiri (rekursif) untuk menyelesaikan sub masalah.
2. Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan for? Buktikan!
    - memungkinkan untuk menggunakan perulangan while, do while
        ```
        code:
            int faktorialBF(int n) {
                int fakto = 1;
                int i = 1;
                
                while (i <= n){
                    fakto *= i;
                    i++;
                }
                return fakto;
            }

        output:
        Masukkan nilai: 5
        Nilai faktorial 5 menggunakan BF: 120
        Nilai faktorial 5 menggunakan DC: 120
        ```
3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !
    - perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); adalah pada bagian fakto *= i; adalah akumulasi perkalian iteratif (brute force), sedangkan faktorialDC(n-1); adalah pendekatan rekrusif yang memecah masalah menjadi sub masalah yang lebih kecil (divide and conquer).
4. Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF() dan faktorialDC()!
    - kesimpulan: brute force (faktorialBF) menghitung langsung secara berurutan dari 1 sampai n, sementara divide and conquer (faktorialDC) memecah perhitungan menjadi perkalian n dengan hasil faktorial dari n-1 hingga mencapai base case.


## 5.3 Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer

```
Masukan jumlah elemen: 3
Masukan nilai basis elemen ke- 1: 2
Masukan nilai pangkat elemen ke- 1: 3
Masukan nilai basis elemen ke- 2: 4
Masukan nilai pangkat elemen ke- 2: 5
Masukan nilai basis elemen ke- 3: 6
Masukan nilai pangkat elemen ke- 3: 7
HASIL PANGKAT BRUTEFORCE
2^3: 8
4^5: 1024
6^7: 279936
HASIL PANGKAT DIVIDE AND CONQUER:
2^3: 8
4^5: 1024
6^7: 279936
```

5.3.3. Pertanyaan
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC()!
    - perbedaan antara pangkatBF() dan pangkatDC() adalah pada pendekatan yang digunakan untuk menghitung hasil pangkat. pangkatBF() menggunakan pendekatan iteratif (brute force) dengan melakukan perkalian berulang, sedangkan pangkatDC() menggunakan pendekatan rekursif (divide and conquer) dengan memecah masalah menjadi sub masalah yang lebih kecil hingga mencapai base case.
2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!
    - combine sudah termasuk dalam kode tersebut, kode program tersebut akan menampilkan hasil pangkat menggunakan 2 metode, yaitu pangkatBF() dan pangkatDC(). pada operator * yang menggabungkan hasik dari pemanggilan pangkatBF() dan pangkatDC() akan menghasilkan hasil pangkat.
3. Pada method pangkatBF()terdapat parameter untuk melewatkan nilai yang akan dipangkatkan dan pangkat berapa, padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat, apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method pangkatBF() yang tanpa parameter?
    - tetap relevan agar method lebih fleksibel, jika tanpa parameter, method hanya bisa mengakses atribut nilaai dan pangkat yang ada di class Pangkat.
4. Tarik tentang cara kerja method pangkatBF() dan pangkatDC()!
    - pangkatBF bekerja dengan melakukan perkalian basis secara berulang sebanyak nilai pangkat, sedangkan pangkatDC bekerja dengan prinsip divide (membagi masalah menjadi sub masalah yang lebih kecil, membagi pangkat menjadi dua) dan conquer (menyelesaikan sub masalah secara rekursif) untuk menghitung hasil pangkat.


## 5.4 Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer

```
Masukan jumlah elemen: 5
Masukan keuntungan ke-1: 10
Masukan keuntungan ke-2: 20
Masukan keuntungan ke-3: 30
Masukan keuntungan ke-4: 40
Masukan keuntungan ke-5: 50
Total keuntungan menggunakan Bruteforce: 150.0
Total keuntungan menggunakan Divide and Conquer: 150.0
```
