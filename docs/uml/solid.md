# Prinsip SOLID yang terlihat pada kode

## Open/Closed Principle (OCP)

`Aset` mendefinisikan operasi `hitungDenda(int)` sebagai metode abstrak. `Ruang`, `Laptop`, dan `AlatLab` memberi implementasi sesuai jenis masing-masing. Perhitungan yang memakai `Aset` dapat menggunakan dynamic dispatch sehingga penambahan jenis aset baru dapat menambahkan subclass dan implementasinya tanpa mengubah pemanggil yang bekerja terhadap tipe `Aset`.

## Dependency Inversion Principle (DIP)

`DendaFlat` dan `DendaProgresif` merupakan implementasi kontrak `AturanDenda`. `LayananDenda` memiliki konstruktor yang menerima `AturanDenda`, sehingga pemanggil dapat memilih strategi lewat kontrak. Kelas layanan tidak perlu bergantung langsung pada salah satu strategi konkret. Ini juga memudahkan pengujian dengan strategi alternatif.

## Single Responsibility Principle (SRP)

`KatalogAset` mengelola kumpulan aset dan pencarian dalam memori; persistensi menjadi tanggung jawab kontrak DAO di paket `dao`. Pemisahan ini menjaga pencarian katalog tidak sekaligus mengurus koneksi database. Prinsip ini tampak pada batas tanggung jawab antar kelas dan paket yang sudah tersedia.
