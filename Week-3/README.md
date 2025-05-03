# DonasiApp - Aplikasi Konsol untuk Manajemen Donasi

## Deskripsi Proyek

DonasiApp adalah aplikasi konsol sederhana yang dirancang untuk mengelola daftar filantropi dan riwayat donasi. Aplikasi ini memungkinkan pengguna untuk menambah donasi ke organisasi filantropi tertentu dan melihat riwayat transaksi. Proyek ini dikembangkan untuk memenuhi tugas praktik dengan fokus pada Console I/O & Flow Control, Struktur Data Sederhana, dan (Opsional) Dasar OOP.

## Teori dan Konsep

### 1. Console I/O & Flow Control

- **Input/Output Konsol**: Aplikasi ini menggunakan kelas `Scanner` dari Java untuk membaca input dari pengguna (misalnya, pilihan menu, nama filantropi, nama donatur, dan jumlah donasi). Output ditampilkan secara bertahap melalui `System.out.println()` untuk memberikan umpan balik kepada pengguna setelah setiap aksi (contoh: konfirmasi donasi berhasil atau menampilkan riwayat).
- **Kontrol Alur (Flow Control)**: Program menggunakan struktur `while` untuk menjalankan loop menu secara berulang hingga pengguna memilih untuk keluar. Penggunaan `if-else` memungkinkan logika keputusan berdasarkan pilihan menu (1 untuk donasi, 2 untuk riwayat, 3 untuk keluar), dengan validasi input untuk memastikan angka yang dimasukkan sesuai.

### 2. Struktur Data Sederhana

- **List/Array untuk Daftar Philanthropy**: Aplikasi menggunakan `ArrayList<Filantropi>` untuk menyimpan daftar filantropi (misalnya, A, B, C). Struktur ini memungkinkan penambahan dan pengaksesan elemen secara dinamis.
- **Dictionary/Map atau List of Object untuk Transaksi**: Riwayat donasi disimpan menggunakan `Map<String, ArrayList<Donasi>>` di kelas `Filantropi`. Kunci map adalah nama donatur, dan nilainya adalah daftar objek `Donasi` yang berisi nama donatur dan jumlah donasi. Pendekatan ini memungkinkan penyimpanan dan pengelolaan transaksi secara terorganisir.

### 3. (Opsional) Dasar OOP

- **Kelas dan Pewarisan**: Proyek ini menerapkan konsep OOP dengan:
  - Kelas `User` sebagai superclass yang menyimpan atribut `nama` sebagai properti dasar.
  - Kelas `Donasi` yang mewarisi `User` untuk merepresentasikan donasi dengan tambahan atribut `jumlah`.
  - Kelas `Filantropi` yang mewarisi `User` untuk mengelola daftar filantropi dan riwayat donasi.
- **Encapsulation**: Atribut seperti `nama` dan `jumlah` dibuat `private` atau `protected` dengan getter dan setter untuk mengontrol akses.
- **Polimorfisme**: Metode `toString()` di-override di kelas `Donasi` dan `Filantropi` untuk memberikan representasi string yang lebih bermakna (misalnya, nama filantropi atau detail donasi).

## Cara Menjalankan

- Melakukan Kompilasi

```bash
cd C:\Users\asus\Documents\CharlosPardomuanPurba-Batch7\Week-3\praktek\DonasiApp\src
javac com\example\User.java com\example\Donasi.java com\example\Filantropi.java com\example\DonasiApp.java
```

- Run

```bash
java com.example.DonasiApp
```
![image](https://github.com/user-attachments/assets/d906b3f6-5ad0-4d5e-8981-1e5612201d8f)
