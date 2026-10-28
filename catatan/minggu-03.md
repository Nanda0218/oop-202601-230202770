# Catatan Minggu 03: Inheritance

## Yang saya kerjakan
Saya melengkapi subclass `Ruang`, `Laptop`, dan `AlatLab` dengan field khusus, konstruktor, getter, dan `getJenis()`. Setiap subclass tetap menggunakan konstruktor `Aset` untuk menyimpan dan memvalidasi kode serta nama.

## Keputusan desain
Kode, nama, status, dan kondisi berada di induk `Aset`; kapasitas, spesifikasi, nomor inventaris, laboratorium, dan tingkat risiko berada di subclass terkait. Contoh saat komposisi lebih tepat: kemampuan pemindaian QR bisa menjadi komponen yang dipakai bersama oleh beberapa jenis aset tanpa menjadikan “dapat memindai QR” sebagai hubungan jenis/subjenis.

## Kendala
Tidak ada kendala khusus.

## Penggunaan AI
- Alat yang dipakai: OpenAI Codex
- Bagian yang dibantu AI: implementasi `Ruang`, `Laptop`, `AlatLab`, dan penyusunan catatan ini.
- Prompt utama: “Kerjakan minggu 03”.
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Belum ada perubahan atau penolakan.
- Satu hal yang saya pahami lebih baik sekarang: Subclass mewarisi validasi atribut umum dari konstruktor induk, sementara validasi atribut khas berada di konstruktor subclass.
