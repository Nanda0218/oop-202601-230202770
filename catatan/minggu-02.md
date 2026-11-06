# Catatan Minggu 02: Class, Object, dan Encapsulation

## Yang saya kerjakan
Saya melengkapi `Aset` dengan field privat, konstruktor, getter, dan setter yang diperlukan. Kode dan nama wajib berisi teks, sedangkan status serta kondisi dimulai dengan nilai default yang ditentukan.

## Keputusan desain
Kode dibuat `final` karena tidak ada setter dan identitas aset tidak berubah setelah objek dibuat. Validasi memakai `isBlank()` untuk menolak null atau teks kosong/berisi spasi, tetapi nilai yang lolos disimpan apa adanya tanpa trim atau perubahan huruf besar-kecil.

## Kendala
Belum ada kendala khusus.

## Penggunaan AI
- Alat yang dipakai: Codex.
- Bagian yang dibantu AI: implementasi validasi, konstruktor, getter, setter pada `Aset`, dan draf catatan ini.
- Prompt utama: “Kerjakan minggu 02”.
- Yang saya ubah atau tolak dari saran AI, dan alasannya: belum ada; tinjau dan sesuaikan catatan ini dengan pemahaman saya sebelum mengumpulkan.
- Satu hal yang saya pahami lebih baik sekarang: enkapsulasi membatasi perubahan nilai objek lewat setter yang dapat memvalidasi masukan.
