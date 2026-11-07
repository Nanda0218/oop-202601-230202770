# Catatan Minggu 07: Koleksi

## Yang saya kerjakan
Saya melengkapi `JadwalPeminjaman` untuk memeriksa bentrok, mengurutkan daftar menurut waktu mulai, mengelompokkan peminjaman menurut kode aset, dan menghapus berdasarkan id. Saya juga menambahkan tes untuk kasus batas ketika satu peminjaman selesai tepat saat peminjaman lain dimulai.

## Keputusan desain
Daftar internal tetap memakai `List` karena jadwal perlu mempertahankan urutan masukan serta mendukung pengurutan dan penghapusan. `Map` dibuat saat `perAset()` dipanggil sebagai hasil pengelompokan; saya tidak menyimpan indeks kedua yang harus selalu disinkronkan. Rentang diperlakukan setengah terbuka `[mulai, selesai)`, jadi dua peminjaman berurutan pada aset sama tidak bentrok. Keputusan dan alasannya tercatat di `docs/asumsi.md`.

## Kendala
Tes yang disediakan tidak menetapkan perilaku waktu yang bersinggungan tepat di batas. Saya memilih peminjaman berurutan diperbolehkan, mendokumentasikannya, dan menambahkan tes khusus di folder `mahasiswa`.

## Penggunaan AI
- Alat yang dipakai: Codex.
- Bagian yang dibantu AI: implementasi `JadwalPeminjaman.bentrok`, `semuaUrutMulai`, `perAset`, `hapus`, serta draf tes batas waktu, asumsi, dan catatan.
- Prompt utama: “Kerjakan minggu 07”.
- Yang saya ubah atau tolak dari saran AI, dan alasannya: saya menetapkan rentang setengah terbuka agar waktu selesai dan waktu mulai yang sama dapat dipakai bersama; keputusan ini saya tulis di asumsi dan uji khusus.
- Satu hal yang saya pahami lebih baik sekarang: `List` cukup untuk menyimpan data jadwal, sementara `Map` bisa dibentuk saat diperlukan untuk mengelompokkan data tanpa menyimpan indeks duplikat.
