# Week 1 - Rangkuman dan Aktivitas

## 🔍 Rangkuman Materi

### Perkenalan dan Setup Awal

### Pertemuan 1: Backend dan Frontend

#### Apa itu Frontend dan Backend?

---

### **1. Frontend**

Frontend adalah tampilan dari sebuah aplikasi yang bisa dilihat dan digunakan oleh user. Tugas utama frontend adalah membuat antarmuka pengguna (user interface) yang menarik, responsif, dan mudah digunakan. Frontend juga bertanggung jawab dalam memastikan pengalaman pengguna (user experience/UX) berjalan dengan optimal. Selain itu, frontend juga menjembatani komunikasi dengan backend melalui API, agar data yang dibutuhkan pengguna bisa ditampilkan dengan tepat.

**Contoh:**
![Screenshot 2025-04-15 083444](https://github.com/user-attachments/assets/fe1b050d-0266-4917-999e-6b399be57c51)

![Screenshot 2025-04-15 083528](https://github.com/user-attachments/assets/6d4b6c5c-3f6b-49b8-b49b-48056fd4d30b)

- **Fokus utama**: Pengalaman pengguna (UX/UI).
- **Teknologi utama**:
  - **HTML**: Struktur halaman.
  - **CSS**: Styling dan tata letak.
  - **JavaScript**: Interaktivitas dan logika di sisi klien.
- **Framework populer**: React, Angular, Vue (mempermudah pengembangan UI modern dan dinamis).

### **2. Backend**

Backend adalah bagian dari aplikasi yang bekerja di balik layar dan tidak terlihat langsung oleh pengguna. Fungsinya sangat penting karena bertanggung jawab dalam memproses logika bisnis aplikasi, mengelola data, serta menjaga keamanan sistem. Backend menangani penyimpanan dan pengelolaan data di database, memfasilitasi komunikasi antara frontend dan server melalui API, serta menangani proses autentikasi dan otorisasi pengguna.

Contoh tugas backend adalah menyimpan data pengguna, memvalidasi input dari pengguna, dan mengirim email secara otomatis seperti email verifikasi atau notifikasi.

- **Fokus utama**: Logika aplikasi, pengelolaan data, keamanan.
- **Teknologi utama**:
  - **Node.js**: JavaScript di sisi server.
  - **Python**: Framework seperti Django dan Flask.
  - **Java**: Dengan framework seperti Spring.
- **Framework & Tools**: Spring Boot, Express.js, Django, Flask.
- **Komponen utama**: API, server, dan database.

---

### **Bagaimana Keduanya Bekerja Bersama?**

![Screenshot 2025-04-15 084717](https://github.com/user-attachments/assets/5a464ff8-93a0-4af3-9c11-03146d3e0047)

Komunikasi dilakukan dengan menggunakan API REST. Di mana Frontend mengirim permintaan ke backend melalui HTTP/HTTPS dan Backend akan menerima dan memproses permintaan dari Frontend, setelah itu Frontend akan menampilkan data yang diterima dari Backend dan selanjutnya Backend mengambil data dari database dan mengembalikannya ke frontend.

---

### Pertemuan 2: Agile Scrum

Berikut beberapa tahapan pada Agile Scrum :

#### 1. Backlog

Daftar pekerjaan yang harus diselesaikan dalam project yang akan dibangun, hal ini bisa sepertu fitur, bug yang perlu di perbaiki, dan lain-lain.

#### 2. Sprint Planning

Daftar tugas atau kegiatan yang akan kita lakukan dalam jangan waktu yang sudah ditentukan. Misalnya dalam waktu 1 minggu atau 2 minggu. Di mana tugas yang dikerjakan di sprint planning ini diambil dari backlog yang sudah dibuat sebelumnya.

#### 3. Daily Stand Up

Kegiatan atau meeting yang dilakukan oleh team selama kurang lebih 15 menit di setiap harinya untuk melaporkan hasil pekerjaan di hari sebelumnya dan yang akan dikerjakan hari ini atau pun kendala yang sedang dihadapi. Hal ini bertujuan untuk meningkatkan kinerja team atau pun kerja sama team.

#### 4. Sprint Review

Kegiatan atau meeting yang dilakukan oleh team dan product owner yang dilakukan satu minggu sekali, biasanya diakhir sprint yang berlangsung. Hal ini bertujuan untuk menunjukkan hasil kerja team dalam satu sprint kepada Scrum master ataupun kepada product owner untuk mendapatkan review atau masukan.

#### 5. Sprint Retrospective

Kegiatan atau meeting yang dilakukan oleh team untuk menyatakan apa yang mereka rasakan secara individual kepada seluruh anggota team mengenai apa saja yang sudah dilalui dalam satu sprint. Misalnya mengenai apa yang sudah berjalan dengan baik, apa yang belum berjalan dengan baik, dan apa yang harus diperbaiki dari kerja sama tim.

---

#### Tools Scrum management:

- Jira
- ClickUp
- Notion
- Trello
- Dll

---

### Pertemuan 3 & 4: Source Code Management

#### Part 1

- Pengertian Git, Branch, dan Commit

  - Git adalah alat yang digunakan untuk mengelola atau melacak versi perubahan kode pada project yang sedang dikerjakan.

  ```bash
  git --version --> Untuk mengecek version dari git yang kita install ataupun mengecek apakah git tersedia atau tidak
  git init --> untuk membuat repository kedalam file atau directory lokal
  ```

  - Branch adalah versi terpisah dari repositori utama yang memungkinkan Anda mengerjakan proyek tanpa mengganggu cabang utama. Cabang Git dapat digunakan untuk mengembangkan fitur, memperbaiki bug, atau bereksperimen.

  ```bash
  git branch nama_branch  --> Untuk membuat branch baru
  git checkout nama_branch --> Untuk melakukan perpindahan branch
  git merge target_branch --> Untuk menggabungkan atau merge 2 branch
  ```

  ![image](https://github.com/user-attachments/assets/6a0011e2-8bf5-4f82-a5af-c7eb66ff8a5f)

  - Commit adalah Penyimpan dari code yang sudah kita ubah atau perubahan dari kode project.

  ```bash
  git commit -m "Message commit"  --> Untuk menyimpan perubahan pada code yang di kembangkan.
  ```

  ![image](https://github.com/user-attachments/assets/72d69a08-17c7-4765-80c8-ae245e58b6be)

- Operasi Dasar : Clone & Pull

  - Clone adalah mengunduh repository dari remote ke lokal kita.

  ```bash
  git clone url_repository  --> Untuk menyimpan repo ke lokal
  ```

  ![image](https://github.com/user-attachments/assets/4e442700-7a78-4341-ac33-95a30195959a)

  - Pull adalah mengambil setiap perubahan yang terbaru dari remote project yang sedang dikerjakan

  ```bash
  git pull origin nama_branch  --> Untuk mengambil perubahan terbaru
  ```

  ![image](https://github.com/user-attachments/assets/cc64d549-6008-449f-8290-b22fa4a49a45)

#### Part 2

- Operasi Lanjutan : Push & Merge

  - Push adalah mengunggah perubahan code project pada lokal kita ke remote agar bisa dilihat oleh orang lain.

  ```bash
  git push -u origin nama_branch  --> Untuk mengunggah perubahan code
  ```

  ![image](https://github.com/user-attachments/assets/9d61db73-e33f-48c7-bfdc-e217b1f38998)

  - Merge adalah teknik penggabungan branch ke branch lain.

  ```bash
  git merge target_branch --> Untuk menggabungkan atau merge 2 branch
  ```

  ![image](https://github.com/user-attachments/assets/fc9c2c12-dbb0-4ec2-8b37-4b60d58cbcd2)

- Pull Request

Pull Request adalah permintaan untuk meninjau dan menggabungkan sebuah branch ke main branch. Hal ini dilakukan untuk memastikan kualitas kode melalui review sebelum melakukan penggabungan ke main.

![Screenshot 2025-04-19 163450](https://github.com/user-attachments/assets/8d48f8be-3903-4541-8391-3f3c8228cb3b)

Langkah-langkah melakukan Pull Request di Guthub:

- Buka repository di GitHub.
- Kita akan melihat notifikasi untuk branch baru yang di-push. Klik Compare & pull request.
- Isi detail PR:
  - Judul: Deskripsi singkat perubahan.
  - Komentar: Jelaskan apa yang diubah dan mengapa.
  - Pilih branch tujuan (biasanya main atau master).
- Klik Create pull request.

## 📸 Bukti Kegiatan

**Pertemuan 1: Senin, 14 April 2025**

![Screenshot (2756)](https://github.com/user-attachments/assets/dd034d3c-f24d-4571-87df-55987ebf7f6e)

**Pertemuan 2: Selasa, 15 April 2025**

![image](https://github.com/user-attachments/assets/40735ca2-90c9-45cd-a9f5-9dad917f5c49)

**Pertemuan 3: Rabu, 16 April 2025**

![image](https://github.com/user-attachments/assets/23622447-da75-4fe5-80ab-0c9378ca937d)

**Pertemuan 4: Kamis, 17 April 2025**

![image](https://github.com/user-attachments/assets/2c6a1f8a-f8ec-458a-8d8a-8152a4c1fc3f)

dhjddk

Week-1\screenshoot\Pertemuan 2_Selasa, 15 April 2025.png
![Pertemuan 2](Week-1\screenshoot\Pertemuan 2_Selasa, 15 April 2025.png)
