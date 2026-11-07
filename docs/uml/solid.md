# Prinsip SOLID yang terlihat di kode

## Single Responsibility Principle (SRP)

`KatalogAset` bertanggung jawab mengelola kumpulan aset di memori dan menyediakan pencarian berdasarkan nama atau jenis. Kelas ini tidak menghitung denda atau mengatur status peminjaman. Pemisahan tersebut membuat perubahan cara mencari aset tidak perlu mengubah aturan denda.

## Open/Closed Principle (OCP)

`Aset` menetapkan perilaku umum dan mendeklarasikan `hitungDenda(int)` sebagai operasi abstrak. `Laptop`, `Ruang`, dan `AlatLab` menyediakan pengali denda masing-masing melalui implementasinya. Jenis aset baru dapat dibuat sebagai subclass dengan implementasi denda sendiri tanpa mengubah implementasi subclass yang sudah ada. Setiap subclass juga memperoleh kontrak `DapatDipinjam` dari `Aset`.

## Dependency Inversion Principle (DIP)

Kontrak `AturanDenda` berada di paket `kontrak`; `DendaFlat` dan `DendaProgresif` mengimplementasikannya, sedangkan `LayananDenda` menyimpan dependensi bertipe `AturanDenda`. Ini memisahkan pemakai strategi dari kelas strategi konkret dan memudahkan penggantian aturan. Batas implementasi perlu dicatat: konstruktor serta metode layanan/strategi masih TODO Minggu 10, sehingga injeksi dependensi belum dapat digunakan pada alur yang berjalan.

SRP dan OCP tampak pada pembagian tanggung jawab dan kelas aset konkret yang sudah berjalan. DIP tampak pada rancangan tipe yang tertulis di kode, tetapi belum didukung implementasi layanan yang aktif. Diagram kelas menampilkan paket dan tanda tangan sesuai kode; diagram urutan juga menandai `ajukan()` sebagai TODO Minggu 9 agar tidak mengklaim bahwa cabang sukses dan bentrok sudah dijalankan.
