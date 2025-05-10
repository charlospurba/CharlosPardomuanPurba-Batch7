# 📒 Expenses API – Spring Boot

API sederhana untuk mencatat dan mengelola pengeluaran menggunakan Spring Boot.

---

## 🚀 Fitur

- `GET /expenses`: Menampilkan seluruh list pengeluaran.
- `POST /expenses`: Menambahkan atau memperbarui pengeluaran:
  - Jika `name` belum ada → tambah pengeluaran baru.
  - Jika `name` sudah ada → `amount` dijumlahkan dengan nilai lama.

---

## 🧰 Teknologi

- Java 23
- Spring Boot
- Maven

---

## 🔧 Cara Menjalankan

### 1. **Clone atau download project**

```bash
git clone <repo-url>
cd demo
```

### 2. **Build & Jalankan dengan Maven**

```bash
cd C:\Users\asus\Documents\CharlosPardomuanPurba-Batch7\Week-4\praktek\Project\demo
mvn spring-boot:run
```

Secara default, aplikasi akan berjalan di:

```
http://localhost:8080
```

> 🔴 Jika port 8080 sudah digunakan, kamu bisa ubah ke port lain di file:

```
src/main/resources/application.properties
```

```properties
server.port=8081
```

---

## 📡 API Endpoint

### 🔹 GET `/expenses`

**Deskripsi:** Mengambil seluruh daftar pengeluaran.

**Contoh Response:**

```json
[
  {
    "name": "Makan Siang",
    "amount": 50000
  },
  {
    "name": "Transport",
    "amount": 30000
  }
]
```

---

### 🔹 POST `/expenses`

**Deskripsi:** Menambah atau memperbarui pengeluaran.

**Request Body (JSON):**

```json
{
  "name": "Makan Siang",
  "amount": 20000
}
```

- Jika nama sudah ada: `amount` akan dijumlahkan.
- Jika belum: item baru ditambahkan.

**Response:**

```json
{
  "name": "Makan Siang",
  "amount": 70000
}
```

---

## 🧪 Testing dengan curl

```bash
curl -X POST http://localhost:8080/expenses \
     -H "Content-Type: application/json" \
     -d "{\"name\":\"Makan Siang\",\"amount\":20000}"
```

```bash
curl http://localhost:8080/expenses
```

---

## 📁 Struktur Proyek

```
demo/
├── src/
│   └── main/
│       ├── java/
│       │   └── com.example.demo/
│       │       ├── controller/
│       │       │   └── ExpenseController.java
│       │       ├── model/
│       │       │   └── Expense.java
│       │       ├── service/
│       │       │   └── ExpenseService.java
│       │       └── ExpenseApplication.java
│       └── resources/
│           └── application.properties
├── pom.xml
└── README.md
```
