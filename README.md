# Java Visual – TP5 AP6
## Manajer Karakter Sprint #2

### Pengelola Karakter, Analitik & Referensi Objek

**Mata Kuliah:** Java Visual (SIH-6406)  
**Praktikum:** AP6 Belajar Praktik  
**Tugas:** TP5 – Sprint #2  
**Nama:** Lasny Silalahi  
**NIM:** 253303621252
**Kelas:** 2 Pagi B

---

## 1. Deskripsi

TP5 merupakan pengembangan dari proyek Character Manager pada TP3. Pada tugas ini, program dikembangkan dengan menambahkan pengelolaan data karakter, pencarian karakter, serta fitur analitik menggunakan Java.

Implementasi dilakukan dengan menerapkan konsep Object-Oriented Programming (OOP), khususnya enkapsulasi, penggunaan koleksi `ArrayList`, dan pemahaman referensi objek.

## 2. Fitur yang Diimplementasikan

### A. Pengelolaan Karakter

Program menyediakan beberapa metode untuk mengelola data karakter, yaitu:

- `addCharacter()` untuk menambahkan karakter ke dalam daftar.
- `findByName()` untuk mencari karakter berdasarkan nama.
- `removeCharacter()` untuk menghapus karakter berdasarkan nama.
- `getTotalCharacters()` untuk mengetahui jumlah karakter yang tersimpan.
- `getAllCharacters()` untuk mendapatkan salinan daftar karakter.

Penambahan karakter dengan nama yang sama ditolak agar tidak terjadi duplikasi data.

### B. Fitur Analitik

Pengembangan pada TP5 mencakup fitur berikut:

- `getAverageLevel()` untuk menghitung rata-rata level seluruh karakter.
- `findByType()` untuk mencari karakter berdasarkan jenis karakter.

Metode `getAverageLevel()` mengembalikan nilai `0` apabila daftar karakter masih kosong, sehingga program tidak mengalami pembagian dengan nol.

### C. Fitur Tambahan

Fitur tambahan yang dikembangkan pada tugas ini adalah:

**[Tuliskan nama metode fitur tambahan yang kamu buat]**

Fitur tersebut digunakan untuk menambah kemampuan pengelolaan atau analisis data karakter. Implementasinya tetap memperhatikan enkapsulasi agar data internal `CharacterManager` tidak dapat diubah secara langsung dari luar kelas.

## 3. Konsep yang Dipelajari

Melalui pengerjaan TP5, beberapa konsep Java yang dipelajari dan diterapkan adalah:

- Penggunaan `ArrayList` untuk menyimpan kumpulan objek.
- Override metode `equals()` untuk membandingkan karakter berdasarkan nama.
- Pencegahan data duplikat.
- Defensive copy pada metode `getAllCharacters()`.
- Perbedaan referensi objek dan nilai primitif.
- Penggunaan variabel `static` untuk data yang dimiliki bersama oleh seluruh objek.
- Penerapan enkapsulasi pada pengelolaan data karakter.

## 4. Hasil Pengujian

Pengujian dilakukan melalui program `Main.java` untuk memastikan setiap metode berjalan sesuai dengan ketentuan tugas.

Hasil pengujian meliputi:

1. Penambahan karakter berhasil.
2. Penambahan karakter dengan nama duplikat ditolak.
3. Pencarian karakter berdasarkan nama berjalan dengan benar.
4. Penghapusan karakter berhasil.
5. Jumlah karakter ditampilkan sesuai data.
6. Defensive copy diuji dengan mengubah daftar hasil `getAllCharacters()`.
7. Rata-rata level karakter dihitung dengan benar.
8. Pencarian karakter berdasarkan tipe menghasilkan data yang sesuai.

## 5. Dokumentasi

### Screenshot Output Program
## Dokumentasi TP5

## Dokumentasi TP5

![Tangkapan layar TP5](screenshots/tp%205.jpeg)

### Fitur Tambahan

**[Masukkan screenshot output fitur tambahan yang dibuat]**

## 6. Analisis Referensi Objek

Analisis mengenai referensi objek, nilai primitif, penggunaan `static`, metode `equals()`, dan defensive copy disusun dalam Google Docs sebagai bagian dari tugas TP5.

Dokumen analisis:

https://docs.google.com/document/d/1jeWA_dOfjEvrqKJidnPsB8QLnNT0x_Bbio-FVfg3rr8/edit?usp=sharing

## 7. Kesimpulan

Pada TP5, program Character Manager dikembangkan dengan menambahkan fitur pengelolaan dan analisis karakter. Tugas ini juga memberikan pemahaman mengenai cara kerja referensi objek, enkapsulasi, dan penggunaan koleksi dalam Java.

Melalui pengujian yang dilakukan, setiap metode dapat diperiksa berdasarkan hasil yang ditampilkan oleh program.

---

**Repository:** JavaVisual – CharacterManager  
**Branch:** `sprint-2-tp5`
