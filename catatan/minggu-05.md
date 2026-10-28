# Catatan Minggu 05: Abstraction

## Yang saya kerjakan
Saya menjadikan `Aset` kelas abstrak, mengimplementasikan `bisaDipinjam()` berdasarkan status dan kondisi, serta menjadikan perhitungan denda abstrak agar tiap jenis aset menyediakan implementasinya. Saya juga mengimplementasikan strategi denda flat dan progresif.

## Keputusan desain
Denda progresif memakai denda flat dikalikan `1 + (hari terlambat / 7)` dengan pembagian bulat; rinciannya dicatat di `docs/asumsi.md`. Faktor ini naik setiap tujuh hari.

## Kendala
Tidak ada kendala khusus.

## Penggunaan AI
- Alat yang dipakai: OpenAI Codex
- Bagian yang dibantu AI: implementasi `Aset`, `DendaFlat`, `DendaProgresif`, serta penyusunan catatan ini.
- Prompt utama: “kerjakan minggu 05”.
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Belum ada perubahan atau penolakan.
- Satu hal yang saya pahami lebih baik sekarang: Kelas abstrak dapat menyimpan state dan perilaku bersama, sementara metode abstrak mewajibkan subclass menyediakan perilaku spesifik.
