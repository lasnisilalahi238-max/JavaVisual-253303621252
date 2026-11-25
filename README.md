# TP8 — Manajer Karakter Sprint #3

## MainWindow, Dinamis Data & Analisis MVC

TP8 merupakan pengembangan aplikasi Character Manager dari tampilan konsol menjadi antarmuka grafis menggunakan Java Swing. Pada tahap ini, aplikasi menampilkan data karakter dalam sebuah jendela dan menyediakan informasi statistik berupa rata-rata level karakter.

### A. Implementasi MainWindow

Pada TP8, dibuat class `MainWindow.java` di dalam package `view` dengan menggunakan `JFrame` sebagai dasar jendela aplikasi.

Implementasi yang dilakukan meliputi:

- Membuat jendela utama aplikasi menggunakan Java Swing.
- Menampilkan data karakter secara dinamis melalui perulangan.
- Menggunakan minimal lima karakter sebagai data awal.
- Menampilkan statistik rata-rata level karakter menggunakan `JLabel`.
- Menjalankan GUI melalui `SwingUtilities.invokeLater()` pada `Main.java`.

### B. Data Karakter dan Statistik

Aplikasi menampilkan daftar karakter yang dikelola oleh `CharacterManager`. Data karakter ditampilkan berdasarkan isi koleksi, sehingga perubahan jumlah atau data karakter dapat tercermin pada tampilan.

Statistik rata-rata level dihitung berdasarkan level seluruh karakter yang tersedia. Ketika data karakter diubah, nilai rata-rata juga dapat berubah sesuai data terbaru.

Karakter tambahan pada TP8:

| Karakter | Tipe | Level | Alasan |
|---|---|---|---|
| [Nama karakter 1] | [Tipe] | [Level] | [Alasan pemilihan] |
| [Nama karakter 2] | [Tipe] | [Level] | [Alasan pemilihan] |

### C. Alur Data dan Penerapan MVC

Alur data pada aplikasi dimulai dari `Main.java` yang menyiapkan data karakter melalui `CharacterManager`. Selanjutnya, data tersebut digunakan oleh `MainWindow` untuk ditampilkan pada antarmuka grafis. `CharacterManager` berperan sebagai Model yang mengelola data, sedangkan `MainWindow` berperan sebagai View yang menampilkan informasi kepada pengguna. Pemisahan tanggung jawab ini membantu menjaga struktur program agar lebih teratur dan mudah dikembangkan.

### D. Dokumentasi TP8

**Screenshot 1 — Sebelum perubahan data**

Menampilkan MainWindow dengan daftar karakter dan statistik rata-rata level sebelum data diubah.

![Screenshot TP8 sebelum perubahan](screenshots/tp%208%20sebelum.jpeg)

**Screenshot 2 — Sesudah perubahan data**

Menampilkan MainWindow setelah data karakter diubah, dengan statistik rata-rata level yang menyesuaikan.

![Screenshot TP8 sesudah perubahan](screenshots/tp%208%20sesudah.jpeg)

### E. Analisis GUI dan MVC

Analisis lengkap mengenai program sekuensial dan event-driven, penggunaan `SwingUtilities.invokeLater()`, kesalahan pada JFrame, hubungan *is-a* dan *has-a*, serta penerapan MVC pada aplikasi Character Manager tersedia pada Google Docs berikut.

**Google Docs Analisis TP8:** 
https://docs.google.com/document/d/1KQuPCQ4piv6QKHlNybdtpQf8suIB4Fh15-ZK9mbjqYk/edit?usp=sharing

### Kesimpulan

Melalui TP8, aplikasi Character Manager telah memiliki antarmuka grafis berbasis Java Swing. Data karakter ditampilkan secara dinamis dan dilengkapi statistik rata-rata level. Pengembangan ini juga menerapkan pemisahan tanggung jawab antara pengelolaan data dan tampilan melalui konsep MVC.