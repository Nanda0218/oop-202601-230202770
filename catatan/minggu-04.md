# Catatan Minggu 04: Polymorphism

## Yang saya kerjakan
Saya mengimplementasikan perhitungan denda pada `Aset` dan override untuk `Ruang`, `Laptop`, serta `AlatLab`. Saya juga melengkapi dua overload pencarian pada `KatalogAset`, termasuk pencarian nama tanpa membedakan kapitalisasi.

## Keputusan desain
Tarif dasar diambil dari `Varian.aktif().dendaPerHari`. Implementasi dasar menolak hari negatif; subclass laptop dan alat lab mengalikan hasil dasar masing-masing dengan dua dan empat.

## Kendala
Tidak ada kendala khusus.

## Penggunaan AI
- Alat yang dipakai: OpenAI Codex
- Bagian yang dibantu AI: implementasi denda pada `Aset` dan subclass, overload pencarian `KatalogAset`, serta penyusunan catatan ini.
- Prompt utama: “Kerjakan minggu 04”.
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Belum ada perubahan atau penolakan.
- Satu hal yang saya pahami lebih baik sekarang: Pemanggilan `hitungDenda` melalui referensi `Aset` tetap memakai override subclass saat runtime (dynamic binding).
