from pathlib import Path

# Week 1 - Rangkuman dan Aktivitas

## 🔍 Rangkuman Materi

### Pertemuan 1: Backend dan Frontend

#### Apa itu Frontend dan Backend?

---

### **1. Frontend**

Frontend adalah bagian dari aplikasi yang langsung dilihat dan digunakan oleh pengguna. Tugas utama frontend adalah membuat antarmuka pengguna (user interface) yang menarik, responsif, dan mudah digunakan. Frontend juga bertanggung jawab dalam memastikan pengalaman pengguna (user experience/UX) berjalan dengan optimal. Selain itu, frontend menjembatani komunikasi dengan backend melalui API, agar data yang dibutuhkan pengguna bisa ditampilkan dengan tepat.

**Contoh:**

![Frontend Info 1](Week-1/screenshoot/image.png)  
![Frontend Info 2](Week-1/screenshoot/image-1.png)

- **Fokus utama**: Pengalaman pengguna (UX/UI).
- **Teknologi utama**:
  - **HTML**: Struktur halaman.
  - **CSS**: Styling dan tata letak.
  - **JavaScript**: Interaktivitas dan logika di sisi klien.
- **Framework populer**: React, Angular, Vue (mempermudah pengembangan UI modern dan dinamis).

---

### **2. Backend**

Backend adalah bagian dari aplikasi yang bekerja di balik layar dan tidak terlihat langsung oleh pengguna. Fungsinya sangat penting karena bertanggung jawab dalam memproses logika bisnis aplikasi, mengelola data, serta menjaga keamanan sistem. Backend menangani penyimpanan dan pengelolaan data di database, memfasilitasi komunikasi antara frontend dan server melalui API, serta menangani proses autentikasi dan otorisasi pengguna.

Contoh konkret dari tugas backend meliputi menyimpan data pengguna, memvalidasi input dari pengguna, dan mengirim email secara otomatis seperti email verifikasi atau notifikasi.

- **Fokus utama**: Logika aplikasi, pengelolaan data, keamanan.
- **Teknologi utama**:
  - **Node.js**: JavaScript di sisi server.
  - **Python**: Framework seperti Django dan Flask.
  - **Java**: Dengan framework seperti Spring.
- **Framework & Tools**: Spring Boot, Express.js, Django, Flask.
- **Komponen utama**: API, server, dan database.

---

### **Bagaimana Keduanya Bekerja Bersama?**

![Frontend-Backend Flow](Week-1/screenshoot/image-2.png)

Frontend dan backend berkomunikasi melalui API, biasanya dengan metode REST menggunakan HTTP/HTTPS. Proses alurnya:

1. **Frontend** mengirim permintaan (request) ke **backend**.
2. **Backend** memproses permintaan tersebut, mengambil data dari database.
3. **Backend** mengirimkan balasan (response) ke **frontend**.
4. **Frontend** menampilkan data tersebut kepada pengguna.

---

## 📸 Bukti Kegiatan

**Pertemuan 1: Senin, 14 April 2025**

![Bukti Kegiatan](Week-1/screenshoot/Pertemuan 1_Senin, 14 April 2025.png)

---

## 📂 Link Tambahan (jika ada)

- Google Drive: [https://drive.google.com/...](https://drive.google.com/...)
  """

# Simpan ke file markdown

output_path = Path("/mnt/data/week1_rangkuman.md")
output_path.write_text(markdown_content, encoding='utf-8')

output_path.name
