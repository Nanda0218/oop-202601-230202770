# Catatan Minggu 01: Paradigma Pemrograman dan Setup

## Yang saya kerjakan
Saya mengisi tiga cara untuk membentuk sapaan Aset-Pinjam. Versi prosedural memakai fungsi statis, versi OOP menyimpan nama dan NIM dalam field, dan versi fungsional mengembalikan lambda yang menerima nama.

## Keputusan desain
Ketiga implementasi memakai kalimat yang sama agar perbedaan yang terlihat hanya pada cara program disusun. Field OOP dibuat `private final` supaya nilainya hanya ditetapkan saat objek dibuat.

## Kendala
Tidak ada kendala khusus.

## Penggunaan AI
- Alat yang dipakai: OpenAI Codex
- Bagian yang dibantu AI: implementasi `HelloProsedural.sapa`, `HelloOOP`, `HelloFungsional.pembuatSapaan`, dan penyusunan catatan ini.
- Prompt utama: “Kerjakan minggu 01”.
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Belum ada perubahan atau penolakan.
- Satu hal yang saya pahami lebih baik sekarang: Lambda dapat dikembalikan sebagai nilai fungsi dan menangkap NIM dari lingkup saat fungsi dibuat.
